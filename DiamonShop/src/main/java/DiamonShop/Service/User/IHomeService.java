
package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dto.ProductDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> getDataSlide();
	
	public List<Categorys> getDataCategorys();
	
	public List<Menus> getDataMunus();
	
	public List<ProductDto> getDataFeatureProducts();

	public List<ProductDto> getDataNewProducts();
}
