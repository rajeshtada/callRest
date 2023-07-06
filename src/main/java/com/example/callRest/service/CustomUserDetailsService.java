package com.example.callRest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.callRest.dao.UserDao;
import com.example.callRest.entity.CustomUserDetails;
import com.example.callRest.entity.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserDao userDao;


	@Override 
	   public UserDetails loadUserByUsername(String username)
	   throws UsernameNotFoundException {
		
//		User userN= new User(user.getUserName(), user.getPassword() , true, true,
//	    		true, true,	AuthorityUtils.NO_AUTHORITIES);
		
		User  user = userDao.findByuserName(username);
	    		  if (user==null)  {
	    			  new UsernameNotFoundException("User not present");
	    		  }
	         return new CustomUserDetails(user);
	   }

	public void createUser(UserDetails user) {
		userDao.save((User) user);
	}
}


