package webdemo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Database {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void getListStudent() {
		List<Student> list = new ArrayList<Student>();
		
		String sql = "select * from student" ;
		
		list = jdbcTemplate.query(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setMasv(rs.getInt("masv"));
				s.setTensv(rs.getString("tensv"));
				s.setDiachi(rs.getString("diachi"));
				s.setEmail(rs.getString("email"));
				s.setSdt(rs.getString("sdt"));
				return s;
			}
		});
		
		for(Student s : list) {
			System.out.println(s.toString());
		}
	}
}

















