package com.fernandohza.helpdesk.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fernandohza.helpdesk.entity.enums.StatusEnum;

@Document
public class ChangeStatus {

	@Id
	private Integer Id;
	
	@DBRef
	private Ticket ticket;
	
	@DBRef
	private User userChange;
	
	private Date dateChangeStatus;
	
	private StatusEnum status;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public User getUserChange() {
		return userChange;
	}

	public void setUserChange(User userChange) {
		this.userChange = userChange;
	}

	public Date getDateChangeStatus() {
		return dateChangeStatus;
	}

	public void setDateChangeStatus(Date dateChangeStatus) {
		this.dateChangeStatus = dateChangeStatus;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}
	
	
}
