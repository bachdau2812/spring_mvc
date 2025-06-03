package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Menus;
import DiamonShop.Entity.MapperMenus;
@Repository
public class MenuDao extends BaseDao{
	public List<Menus> getDataMenus(){
		List<Menus> list = new ArrayList<Menus>();
		String sql = "select * from menus";
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}
}
