package com.swe.ticketing.service;

import java.util.List;
import java.util.Optional;

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

	// facade - print ticket
	@Override
    public IssueTicket getInfoByID(int id) {
//        return ticketingRepository.findById(id)
//            .orElseThrow(() -> new IssueTicketNotFoundException("Ticket not found with id: " + id));
		Optional<IssueTicket> issue = ticketingRepository.findById(id); 
		return issue.orElse(null);
	}

	@Override
	public IssueTicket getEntityById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
