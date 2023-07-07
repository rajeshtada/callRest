package com.example.callRest.Restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.callRest.annotation.ResourcePathClose;


@Controller
@RequestMapping("api")
public class TestResourcesGoneRestController {

	
	@ResourcePathClose(value = "/link1" , name = "goneTest")
	  public String handle1 () {
//		this.getClass().
	      return "The resource 'link1' doesn't exist anymore" + "\n hello test";
	  }
	  
	  @ResourcePathClose(value = "/link2")
	  public String handle2 () {
	      return "The resource 'link2' doesn't exist anymore";
	  }
}
