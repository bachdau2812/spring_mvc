package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.MapperSlides;
import DiamonShop.Entity.Slides;

@Repository
public class SlideDao extends BaseDao{
	
	public List<Slides> getDataSlide(){
		List<Slides> list = new ArrayList<Slides>();
		String sql = "select * from slides";
		list = _jdbcTemplate.query(sql, new MapperSlides());
		return list;
	}
}
