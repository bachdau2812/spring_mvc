package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.ProductServiceImpl;

@Controller
public class ProductController extends BaseController{
	
	@Autowired
	private ProductServiceImpl _ps ;
	
	@RequestMapping(value = {"/chi-tiet-san-pham/{id}"})
	public ModelAndView index(@PathVariable("id") int id) {
		_mvShare.setViewName("user/products/product");
		_mvShare.addObject("product", _ps.GetProductById(id));
		_mvShare.addObject("productByIdCategory", _ps.GetProductByIdCategory(_ps.GetProductById(id).getId_category()));
		return _mvShare;
	}
}
