package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.UserEntity;
import DiamonShop.Service.User.AccountSeviceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class UserController extends BaseController{
	@Autowired
	AccountSeviceImpl as = new AccountSeviceImpl();
	
	@RequestMapping(value = "/dang-ky", method=RequestMethod.GET)
	public ModelAndView Register() {
		_mvShare.setViewName("user/account/register");
		_mvShare.addObject("user", new UserEntity());
		return _mvShare;
	}
	
	@RequestMapping(value = "/dang-ky", method=RequestMethod.POST)
	public ModelAndView CreateAccount(@ModelAttribute("user") UserEntity user) {
		int count = as.addAccount(user);
		if(count > 0) {
			_mvShare.addObject("status", "Dang ky tai khoan thanh cong");
		}else {
			_mvShare.addObject("status", "Dang ky tai khoan that bai");
		}
//		_mvShare.addObject("status", true);
		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}
	
	@RequestMapping(value = "/dang-nhap", method=RequestMethod.POST)
	public ModelAndView login(HttpSession session, @ModelAttribute("user") UserEntity user) {
		user = as.checkAccount(user);
		
		if(user != null) {
			_mvShare.setViewName("redirect:trang-chu/");
			session.setAttribute("loginInfor", user);
		}else {
			_mvShare.addObject("statusLogin", "Dang nhap that bai");
		}
		
		return _mvShare;
	}
	
	@RequestMapping(value = "/dang-xuat", method=RequestMethod.GET)
	public String logout(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("loginInfor");
		
		return "redirect:"+request.getHeader("Referer");
	}
	
}








