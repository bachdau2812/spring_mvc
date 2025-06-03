package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.ProductDao;
import DiamonShop.Dto.ProductDto;
@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private ProductDao pd = new ProductDao();
	
	@Override
	public ProductDto GetProductById(int id) {
		List<ProductDto> list = pd.getProductById(id);
		return list.get(0);
	}

	@Override
	public List<ProductDto> GetProductByIdCategory(int id) {
		return pd.getAllProductsById(id);
	}

}
