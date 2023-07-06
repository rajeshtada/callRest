package com.example.callRest.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.callRest.entity.User;
import com.example.callRest.service.UserService;

@Controller
@RequestMapping("/callRest")
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/signin")
	public String openLoginForm(Model model) {
		System.out.println("logout done and return to login controller ");
//		model.addAttribute("Login", "Login");
		return "UserLogin";
	}

	@RequestMapping(value = "/verifyUser" , method = RequestMethod.POST)
	public String verifyUser(@RequestParam(name = "userName", required = false) String userName,
			@RequestParam(name = "password", required = false) String password, Model model) {
		System.out.println("UserName " + userName + "  " + "Password " + password);
		
		

		User user = userService.getUserByUserName(userName);
		
		if ( user!=null && user.getPassword().equals(password)) {
			model.addAttribute("userName", userName);
			model.addAttribute("password", password);
			return "Home";
		} else 
		{
			return "Errors";	
		}

		
		
		//return "Errors";
	}
	
	
	
	
	
	

}
