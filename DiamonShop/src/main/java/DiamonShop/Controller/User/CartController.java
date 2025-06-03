 package DiamonShop.Controller.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dto.CartDto;
import DiamonShop.Entity.Bill;
import DiamonShop.Entity.UserEntity;
import DiamonShop.Service.User.BillServiceImpl;
import DiamonShop.Service.User.CartServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CartController extends BaseController{
	@Autowired
	private CartServiceImpl cs = new CartServiceImpl();
	
	@Autowired
	private BillServiceImpl billService = new BillServiceImpl();
	
	@RequestMapping(value = "listCart/")
	public ModelAndView index() {
		_mvShare.addObject("slides", _homeService.getDataSlide());
		_mvShare.addObject("categorys", _homeService.getDataCategorys());
		_mvShare.addObject("newproducts", _homeService.getDataNewProducts());
		_mvShare.addObject("featureproducts", _homeService.getDataFeatureProducts());
		_mvShare.setViewName("user/cart/listCart");
		return _mvShare;
	}
	
	@RequestMapping(value = "addCart/{id}")
	public String addCart(HttpServletRequest request, HttpSession session, @PathVariable("id") int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("ShoppingCart");
		if(cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cs.addCart(id, cart);
		session.setAttribute("ShoppingCart", cart);
		session.setAttribute("totalQty", cs.totalQuantity(cart));
		session.setAttribute("totalPrice", cs.totalPrice(cart));
		
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value = "listCart/editCart/{id}/{qty}")
	public String editCart(HttpServletRequest request, HttpSession session, @PathVariable("id") int id, @PathVariable("qty") int qty) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("ShoppingCart");
		if(cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cs.editCart(id, qty, cart);
		session.setAttribute("ShoppingCart", cart);
		session.setAttribute("totalQty", cs.totalQuantity(cart));
		session.setAttribute("totalPrice", cs.totalPrice(cart));
		
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value = "deleteCart/{id}")
	public String deleteCart(HttpServletRequest request, HttpSession session, @PathVariable("id") int id) {
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("ShoppingCart");
		if(cart == null) {
			cart = new HashMap<Integer, CartDto>();
		}
		cart = cs.deleteCart(id, cart);
		session.setAttribute("ShoppingCart", cart);
		session.setAttribute("totalQty", cs.totalQuantity(cart));
		session.setAttribute("totalPrice", cs.totalPrice(cart));
		
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value = "checkout", method = RequestMethod.GET)
	public ModelAndView checkOut(HttpServletRequest request, HttpSession session) {
		_mvShare.setViewName("user/bills/checkout");
		Bill bill = new Bill();
		UserEntity user = (UserEntity) session.getAttribute("loginInfor");
		
		if(user != null) {
			bill.setAddress(user.getAddress());
			bill.setDisplay_name(user.getDisplay_name());
			bill.setUsername(user.getUsername());
		}
		_mvShare.addObject("bills", bill);
		return _mvShare;
	}
	
	@RequestMapping(value = "checkout", method = RequestMethod.POST)
	public String checkOutBill(HttpServletRequest request, HttpSession session, @ModelAttribute("bill") Bill bill) {
		
		bill.setQty((Integer) session.getAttribute("totalQty"));
		bill.setTotal((Double) session.getAttribute("totalPrice"));
		if(billService.addBill(bill) > 0) {
			
			HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>) session.getAttribute("ShoppingCart");
			billService.addBillDetail(cart);
		}
		session.removeAttribute("ShoppingCart");
		return "redirect:gio-hang";
	}
	
	
}























