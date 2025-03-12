package com.example.callRest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.callRest.entity.Property;

public interface PropertyDao extends JpaRepository<Property, Long> {

	List<Property> findByPropertyKeyLike(String string);

}
