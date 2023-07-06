package com.example.callRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.callRest.entity.User;
import com.example.callRest.service.UserService;

@SpringBootApplication
public class CallRestApplication extends SpringBootServletInitializer {

	@Autowired
	UserService userService;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
	SpringApplication.run(CallRestApplication.class, args);
	
//	ConfigurableApplicationContext app = SpringApplication.run(CallRestApplication.class, args);
//	BookDaoImpl allBook = app.getBean(BookDaoImpl.class);
//	Trial tr = new Trial();
//	tr.trialMethod();
	}
	
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CallRestApplication.class);
    }
	
	
//	public class CallRestApplication implements CommandLineRunner {
//	@Override
//	public void run(String... args) throws Exception {
//		User user= new User();
//		user.setUserName("abhi2");
//		user.setPassword(this.passwordEncoder.encode("1234"));
//		user.setRole("ROLE_ADMIN");
//		userService.saveUser(user);
//		
//	}
//		}
	
		
		
	
	

}
