package com.swe.ticketing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.swe.ticketing.model.IssueTicket;

public interface TicketingService {
	public IssueTicket saveTicket(IssueTicket issueTicket);
	public List<IssueTicket> getAllTickets();
	
	// facade - print ticket
	public IssueTicket getEntityById(int id);
	public IssueTicket getInfoByID(int id);
}