package DiamonShop.Controller.User;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{
	

	@RequestMapping(value = {"/", "/trang-chu/"})
	public ModelAndView index() {
		_mvShare.addObject("slides", _homeService.getDataSlide());
		_mvShare.addObject("categorys", _homeService.getDataCategorys());
		_mvShare.addObject("newproducts", _homeService.getDataNewProducts());
		_mvShare.addObject("featureproducts", _homeService.getDataFeatureProducts());
		_mvShare.setViewName("user/index");
		return _mvShare;
	}
	
	@RequestMapping("/product")
	public ModelAndView product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}

}
