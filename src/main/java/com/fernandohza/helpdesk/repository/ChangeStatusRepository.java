package com.fernandohza.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fernandohza.helpdesk.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String>{
	
	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketid);

}
