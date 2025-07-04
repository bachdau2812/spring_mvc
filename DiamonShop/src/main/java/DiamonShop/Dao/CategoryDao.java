package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.MapperCategorys;

@Repository
public class CategoryDao extends BaseDao{
	
	public List<Categorys> getDataCategorys(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "select * from categorys";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
	}
}
