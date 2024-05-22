package com.swe.ticketing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swe.ticketing.model.IssueTicket;
import com.swe.ticketing.repository.TicketingRepository;

@Service

public class TicketingServiceImpl implements TicketingService {

	@Autowired
	private TicketingRepository ticketingRepository;
	
	@Override
	public IssueTicket saveTicket(IssueTicket issueTicket) {
		// TODO Auto-generated method stub
		return ticketingRepository.save(issueTicket);
	}

	@Override
	public List<IssueTicket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketingRepository.findAll();
	}
	
}
