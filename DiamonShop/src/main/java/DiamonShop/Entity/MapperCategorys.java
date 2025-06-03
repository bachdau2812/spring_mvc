package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategorys implements RowMapper<Categorys>{
	@Override
	public Categorys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categorys category = new Categorys();
		category.setId(rs.getInt("id"));
		category.setName(rs.getString("name"));
		category.setDecription(rs.getString("description"));
		return category;
	}
}
