package com.example.callRest.service;

import com.example.callRest.entity.User;

public interface UserService {

	User getUserByUserName(String userName);

	void saveUser(User user);

}
