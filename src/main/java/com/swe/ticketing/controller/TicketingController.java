package com.swe.ticketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swe.ticketing.model.IssueTicket;
import com.swe.ticketing.service.TicketingService;

@RestController
@RequestMapping("/ticket")
@CrossOrigin

public class TicketingController {
	@Autowired 
	private TicketingService ticketingService;
	
	@PostMapping("/issue")
	public String issue(@RequestBody IssueTicket issueTicket) {
		ticketingService.saveTicket(issueTicket);
		return "A new ticket has been issued!";
	}
	
	@GetMapping("/getTicket") 
	public List<IssueTicket> getAllTickets() {
		return ticketingService.getAllTickets();
	}
}
