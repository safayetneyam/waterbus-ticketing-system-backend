package com.swe.ticketing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IssueTicket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int ticketid;
	private int id;
	private String name;
	private String type;
	private String category; 
	private int seat_count;
	private String departure;
	private String destination;
	private String date;
	private String time;
	private int ticket_fare;
	// private double refund_rate;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getSeat_count() {
		return seat_count;
	}
	public void setSeat_count(int seat_count) {
		this.seat_count = seat_count;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTicket_fare() {
		return ticket_fare;
	}
	public void setTicket_fare(int ticket_fare) {
		this.ticket_fare = ticket_fare;
	}
}
