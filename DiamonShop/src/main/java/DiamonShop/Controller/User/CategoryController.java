package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dto.PaginateDto;
import DiamonShop.Service.User.CategoryServiceImpl;
import DiamonShop.Service.User.PaginateServiceImpl;

@Controller
public class CategoryController extends BaseController{
	@Autowired
	private CategoryServiceImpl cs = new CategoryServiceImpl();
	@Autowired
	private PaginateServiceImpl ps = new PaginateServiceImpl();
	
	private int totalProductPage = 9;
	
	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView product(@PathVariable("id") String id) {
		_mvShare.setViewName("/user/products/category");
		int totalData = cs.getAllProductById(Integer.parseInt(id)).size();
		PaginateDto paginateInfo = ps.getInfoPaginate(totalData, totalProductPage, 1);
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productPaginate", cs.getDataProductPaginate(Integer.parseInt(id), paginateInfo.getStart(), totalProductPage));
		return _mvShare;
	}
	
	@RequestMapping(value = "/san-pham/{id}/{currentPage}")
	public ModelAndView product(@PathVariable("id") String id, @PathVariable("currentPage") String currentPage) {
		_mvShare.setViewName("/user/products/category");
		int totalData = cs.getAllProductById(Integer.parseInt(id)).size();
		PaginateDto paginateInfo = ps.getInfoPaginate(totalData, totalProductPage, Integer.parseInt(currentPage));
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productPaginate", cs.getDataProductPaginate(Integer.parseInt(id), paginateInfo.getStart(), totalProductPage));
		return _mvShare;
	}
	
}





















