package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.ProductDao;
import DiamonShop.Dto.ProductDto;
@Service
public class CategoryServiceImpl implements ICategoryService{
	@Autowired
	private ProductDao pd = new ProductDao();
	
	@Override
	public List<ProductDto> getDataProductPaginate(int id, int start, int totalPage) {
		return pd.getDataProductsPaginate(id, start, totalPage);
	}

	@Override
	public List<ProductDto> getAllProductById(int id) {
		return pd.getAllProductsById(id);
	}
	
	
}
