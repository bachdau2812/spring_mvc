package DiamonShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.ProductDto;

@Service
public interface IProductService {
	public ProductDto GetProductById(int id);
	public List<ProductDto> GetProductByIdCategory(int id);
}
