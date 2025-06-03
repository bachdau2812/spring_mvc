package DiamonShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.ProductDto;
@Service
public interface ICategoryService {
	public List<ProductDto> getDataProductPaginate(int id, int start, int totalPage);
	public List<ProductDto> getAllProductById(int id);
}
