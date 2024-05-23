package com.example.callRest.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.Md4PasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

import com.example.callRest.service.CustomUserDetailsService;

//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig2 extends WebSecurityConfigurerAdapter{
//
//	@Autowired 
//	CustomUserDetailsService customUserDetailsService;
//	
//	@Autowired
//	DataSource dataSource;
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//	    return NoOpPasswordEncoder.getInstance();
//	}
//	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
////		auth.inMemoryAuthentication().withUser("raju").password("1234").roles("ADMIN");
////		auth.jdbcAuthentication().dataSource(dataSource)
////		.usersByUsernameQuery("select user_name, password from user_data where user_name=?")
////		.authoritiesByUsernameQuery("select role_new from user_data where user_name=?")
////		.passwordEncoder(passwordEncoder());
//
//	
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.csrf().disable()
//		.authorizeRequests()
//		.antMatchers("/callRest/signin").permitAll()
////		.antMatchers("/Book/**").permitAll()
////		.antMatchers("/Book/AddBook").hasRole("ADMIN")
////		.antMatchers("/Book/LiberaryBook").hasRole("USER")
//		.anyRequest()
//		.authenticated()
//		.and()
//		.formLogin()
//		.loginPage("/callRest/signin")
//		.loginProcessingUrl("/dologin")
//		.defaultSuccessUrl("/callRest/home")
//		.and()  
//        .logout()  
//        .logoutUrl("/logout")  
//        .logoutSuccessUrl("/callRest/signin")  
//        .invalidateHttpSession(true)
//        .deleteCookies("JSESSIONID")
////		.defaultSuccessUrl("/testcontroller/testGetReq")
//
//		;
//		
//		http.authorizeHttpRequests((authz) -> authz.anyRequest().authenticated());
//		
//	}
//	
//	
//}
