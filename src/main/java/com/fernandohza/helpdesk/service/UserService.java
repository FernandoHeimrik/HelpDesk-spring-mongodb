package com.fernandohza.helpdesk.service;

import java.util.Optional;

import org.springframework.data.domain.Page;

import com.fernandohza.helpdesk.entity.User;

public interface UserService {

	User findByEmail(String email);
	
	User createOrUpdate(User user);
	
	Optional<User> findById(Integer id);
	
	void delete(Integer id);
	
	Page<User> findAll(int page, int count);
}
