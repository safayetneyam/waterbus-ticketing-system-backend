package com.swe.ticketing.service;

import java.util.List;

import com.swe.ticketing.model.IssueTicket;

public interface TicketingService {
	public IssueTicket saveTicket(IssueTicket issueTicket);
	public List<IssueTicket> getAllTickets();
}