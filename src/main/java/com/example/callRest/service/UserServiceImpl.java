package com.example.callRest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.callRest.dao.UserDao;
import com.example.callRest.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUserByUserName(String userName) {

		User user = userDao.findByuserName(userName);
		
		

		return user;
	}

	@Override
	public void saveUser(User user) {
		userDao.save(user);
	}

}
