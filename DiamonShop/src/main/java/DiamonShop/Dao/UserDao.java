package DiamonShop.Dao;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.MapperUser;
import DiamonShop.Entity.UserEntity;
@Repository
public class UserDao extends BaseDao{
	public int addAccount(UserEntity user) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert ");
		sql.append("into users ");
		sql.append("( ");
		sql.append("username, ");
		sql.append("password, ");
		sql.append("display_name, ");
		sql.append("address ");
		sql.append(") ");
		sql.append("values ");
		sql.append("( ");
		sql.append("'").append(user.getUsername()).append("', ");
		sql.append("'").append(user.getPassword()).append("', ");
		sql.append("'").append(user.getDisplay_name()).append("', ");
		sql.append("'").append(user.getAddress()).append("'");
		sql.append(") ");

		
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public UserEntity getUserByAccount(UserEntity user) {
		String sql = "select * from users where username like '" + user.getUsername() + "'";
		UserEntity result = _jdbcTemplate.queryForObject(sql, new MapperUser());
		return result;
	}
	
}
