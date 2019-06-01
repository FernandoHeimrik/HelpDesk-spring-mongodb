package com.fernandohza.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fernandohza.helpdesk.entity.User;

public interface UserRepository extends MongoRepository<User, Integer>{
	
	User findByEmail(User email);

}
