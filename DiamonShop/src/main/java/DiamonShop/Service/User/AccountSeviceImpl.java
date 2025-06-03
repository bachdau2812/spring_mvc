package DiamonShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.UserDao;
import DiamonShop.Entity.UserEntity;

@Service
public class AccountSeviceImpl implements IAccountService{
	@Autowired
	UserDao us = new UserDao();
	
	public int addAccount(UserEntity user) {
		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		
		return us.addAccount(user);
	}

	@Override
	public UserEntity checkAccount(UserEntity user) {
		String inputPassword = user.getPassword();
		user = us.getUserByAccount(user);
		if(user != null) {
			if(BCrypt.checkpw(inputPassword, user.getPassword())) {
				return user;
			}
		}
		return null;
	}
}
