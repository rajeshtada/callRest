package com.example.callRest.Restcontroller;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Transactional
@RestController
@RequestMapping("testcontroller")
public class UserCheck {
	
	@PostMapping("updateStoreCustomer")
	public @ResponseBody String showMenu(@RequestParam(name = "mid") String mid, HttpSession session) {
		
//		Merchants merchant = merchantService.findByMId(mid);
////		respo.setData(merchant);
//		respo.setMessage("Success !!!");
//		respo.setStatus(StatusResponse.Success);
		return "Hello World" ;
		
	}
	
	@GetMapping("/testGetReq")
	public  String testATHtml() {
		return " Hello World 45";
	}
	
	@PostMapping("/testGetReq")
	public @ResponseBody String returnApi() {
		return "return";
	}

}
