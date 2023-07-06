package com.example.callRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.callRest.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

	User findByuserName(String userName);

}
