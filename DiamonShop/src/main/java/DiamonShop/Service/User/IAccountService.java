package DiamonShop.Service.User;

import org.springframework.stereotype.Service;

import DiamonShop.Entity.UserEntity;

@Service
public interface IAccountService {
	public int addAccount(UserEntity user);
	
	public UserEntity checkAccount(UserEntity user);
}
