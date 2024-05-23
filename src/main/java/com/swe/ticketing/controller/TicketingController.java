package com.swe.ticketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swe.ticketing.model.Fcd_TicketingFacade;
import com.swe.ticketing.model.FetchBaseFare;
import com.swe.ticketing.model.FetchDistanceFare;
import com.swe.ticketing.model.IssueTicket;
import com.swe.ticketing.service.TicketingService;
import com.swe.ticketing.model.PrintTicket;

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
	
	//ISSUE TICKET
	
	int ticket_id = 0;
	@PostMapping("/api/sendId")
	public String calculate(@RequestBody IssueTicket ticket) {
		ticket_id = ticket.getTicketid();
		return "Get Ticket ID Successful";
	}
	
	IssueTicket issue = new IssueTicket();
	
	@GetMapping("/entity/{ticket_id}")
	public ResponseEntity<IssueTicket> getInfoById(@PathVariable int id) {
		issue = ticketingService.getEntityById(ticket_id);
		if (issue == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(issue);
	}
	
	int wbid = issue.getWbid();
	String wbname = issue.getWbname();
	String departure = issue.getDeparture();
	String destination = issue.getDestination();
	String time = issue.getTime();
	String date = issue.getDate();
	int ticketFare = issue.getTicket_fare();
	
	// facade implementation
	Fcd_TicketingFacade ticketingFacade = new Fcd_TicketingFacade();
	PrintTicket pTicket = ticketingFacade.printTicket(wbid, wbname, departure, destination, time, date, ticketFare);
	
	@GetMapping("/api/printTicket") 
	public PrintTicket printTicket() {
		return pTicket;
	}
}
