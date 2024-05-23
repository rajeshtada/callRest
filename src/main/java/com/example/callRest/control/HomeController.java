package com.example.callRest.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/callRest")
public class HomeController {

	
	@GetMapping("/home")
	public String home()
	{
		
		System.out.println("hello world in home controller");
		return "Home";
	}
	
	
}
