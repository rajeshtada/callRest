package com.example.callRest.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.callRest.entity.User;
import com.example.callRest.service.UserService;

@Controller
@RequestMapping("/callRest")
public class UserRegistrationController {

	@Autowired
	UserService userService;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
//	
	
	@GetMapping("userRegist")
	public String openUserRegis(Model model) {

		return "userRegistration";
//		User user = userService.getUserByUserName(userName);
	}

	@PostMapping("/saveUserRegis")
	public String SaveUserRegis(@ModelAttribute User user, Model model, RedirectAttributes ru) {
		System.out.println("USer " + user.getUserName() 
		+ "Email " + user.getEmail() + "Password " + user.getPassword());
		String s=user.getPassword();
		//user.setPassword(this.passwordEncoder.encode(s));
		user.setRole("ROLE_ADMIN");
		userService.saveUser(user);
		ru.addFlashAttribute("msg", " user saved success");
		
//		Boolean flagLength = false;
//		Boolean flagUpCase = false;
//		Boolean flagLowCase = false;
//		Boolean flagNumeric = false;
//		Boolean flagSpeChar = false;
//		String reqPassword = user.getPassword();

//		if (reqPassword.length() >= 8 && reqPassword.length() <= 20) {
//		flagLength = true;
//		} else {
//			ru.addFlashAttribute("flagLength", flagLength);
//		}
//		int i = 0; 
//		while(i<reqPassword.length())
//		{
//			char p = reqPassword.charAt(i);
//			if(Character.isUpperCase(p))
//			{
//				flagUpCase = true;
//			}
//			if(Character.isLowerCase(p))
//			{
//				flagLowCase = true;
//			}
//			if(Character.isLowerCase(p))
//			{
//				flagLowCase = true;
//			}
//		}

//		String regex = "^(?=.*[0-9])"
//                + "(?=.*[a-z])(?=.*[A-Z])"
//                + "(?=.*[@#$%^&+=])"
//                + "(?=\\S+$).{8,20}$";
//		
//		Boolean validatePass = false;
//
//		Pattern p = Pattern.compile(regex);
//		if (reqPassword != null) {      	
//        	Matcher m = p.matcher(reqPassword);
//        	 validatePass = m.matches();
//        }
//		
//		if(validatePass) {
//			ru.addFlashAttribute("msg", " password saved success");
//			User user1 = userService.signUpUser(user);
//		} else {
//			ru.addFlashAttribute("msg", " Password must contain 1 UpperCase 1 Lower Case 1 "
//					+ "Special Char 1 Numeric value and min 8 character ");
//		}	
//		
		
		return "redirect:userRegist";

	}

}
