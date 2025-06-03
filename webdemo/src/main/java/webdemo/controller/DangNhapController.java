package webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {
	@GetMapping
	public String dangnhapController( ) {
		return "dangnhap";
	}
	
	@PostMapping
	public String dangnhap(@RequestParam("username") String username, @RequestParam("password") String password) {
		
		if(username.equals("dauducbach") && password.equals("bachdepzai")) {
			return "redirect:/";
		}
		return "dangnhap";
	}
}
