package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategoryDao;
import DiamonShop.Dao.MenuDao;
import DiamonShop.Dao.ProductDao;
import DiamonShop.Dao.SlideDao;
import DiamonShop.Dto.ProductDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Slides;


@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlideDao slideDao;
	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Slides> getDataSlide() {
		return slideDao.getDataSlide();
	}
	@Override
	public List<Categorys> getDataCategorys() {
		return categoryDao.getDataCategorys();
	}
	@Override
	public List<Menus> getDataMunus() {
		return menuDao.getDataMenus();
	}
	@Override
	public List<ProductDto> getDataNewProducts() {
		return productDao.getDataNewProducts();
	}
	
	public List<ProductDto> getDataFeatureProducts() {
		return productDao.getDataFeatureProducts();
	}

}
