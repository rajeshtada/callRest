package com.example.callRest.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.callRest.entity.User;

@Controller
@RequestMapping
public class TestButtonController {
	
	@GetMapping("testHtmlPage")
	public String testHtml () {
		
		return "TestHtmlPage"; 
		
	}
	
	

}
