package com.fernandohza.helpdesk.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.fernandohza.helpdesk.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, Integer>{

	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, Integer userId);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingOrderByDateDesc(
			String title, String status, String priority,Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndUserIdOrderByDateDesc(
			String title, String status, String priority, Pageable pages);
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndAssignedUserIdOrderByDateDesc(
			String title, String status, String priority, String user, Pageable pages);
	
	Page<Ticket> findByNumber(Integer number, Pageable pages);
}
