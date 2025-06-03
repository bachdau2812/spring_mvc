package DiamonShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamonShop.Dto.ProductDto;
import DiamonShop.Dto.ProductsDtoMapper;

@Repository
public class ProductDao extends BaseDao{
	private final boolean YES = true;
	private final boolean NO = false;
	
	private StringBuffer stringSql() {
		StringBuffer sql = new StringBuffer();
		sql.append("select p.id as id_product, p.id_category, p.sizes, p.name, p.price, p.sale, p.title, p.highlight, p.new_product, p.details, c.id as id_color, c.name as name_color, c.code as code_color, c.img, p.created_at, p.updated_at ");
		sql.append("from products as p ");
		sql.append("inner join colors as c on p.id = c.id_product ");
		return sql;
	}
	
	private String sqlProducts(boolean newProduct, boolean featureProduct) {
		StringBuffer sql = stringSql();
		sql.append("where 1 = 1 ");
		if(newProduct) {
			sql.append("and p.new_product = 1 ");
		}
		if(featureProduct) {
			sql.append("and p.highlight = 1 ");
		}
		
		sql.append("group by id_product, id_color ");
		sql.append("order by rand() ");
		
		if(newProduct) {
			sql.append("limit 12 ");
		}
		if(featureProduct) {
			sql.append("limit 9 ");
		}
		
		return sql.toString();
	}
	
	private StringBuffer sqlProductsById(int id) {
		StringBuffer sql = stringSql();
		sql.append("where 1 = 1 ");
		sql.append("and id_category = "+ id + " ");
		
		return sql;
	}
	
	private String sqlProductsPaginate(int id, int start, int totalPage) {
		StringBuffer sql = sqlProductsById(id);
		sql.append("limit " + start + ", " + totalPage + " ");
		return sql.toString();
	}
	
	public List<ProductDto> getDataNewProducts() {
		String sql = sqlProducts(YES, NO);
		List<ProductDto> list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}
	
	public List<ProductDto> getDataFeatureProducts() {
		String sql = sqlProducts(NO, YES);
		List<ProductDto> list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}
	
	public List<ProductDto> getAllProductsById(int id) {
		String sql = sqlProductsById(id).toString();
		List<ProductDto> list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}
	
	public List<ProductDto> getDataProductsPaginate(int id, int start, int totalPage) {
		StringBuffer sqlGetDataById = sqlProductsById(id);
		List<ProductDto> listProductsById = _jdbcTemplate.query(sqlGetDataById.toString(), new ProductsDtoMapper());
		List<ProductDto> listProduct = new ArrayList<ProductDto>();
		
		if(listProductsById.size() > 0) {
			String sql = sqlProductsPaginate(id, start, totalPage);
			listProduct = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		}
		return listProduct;
	}
	
	
	private String sqlProductById(int id) {
		StringBuffer sql = stringSql();
		sql.append("where 1 = 1 ");
		sql.append("and id_product = "+ id + " ");
		sql.append("limit 1 ");
		return sql.toString();
	}

	public List<ProductDto> getProductById(int id) {
		String sql = sqlProductById(id);
		List<ProductDto> list = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return list;
	}
	
	public ProductDto findProductById(int id) {
		String sql = sqlProductById(id);
		ProductDto product = _jdbcTemplate.queryForObject(sql, new ProductsDtoMapper());
		return product;
	}
	
}















