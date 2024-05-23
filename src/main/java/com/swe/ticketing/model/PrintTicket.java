package com.swe.ticketing.model;

public class PrintTicket {
	private String waterbusInfo;
	private String startEndLocs;
	private String boardingTime;
	private String ticketFare;
	
	public String getWaterbusInfo() {
		return waterbusInfo;
	}
	public void setWaterbusInfo(String waterbusInfo) {
		this.waterbusInfo = waterbusInfo;
	}
	public String getStartEndLocs() {
		return startEndLocs;
	}
	public void setStartEndLocs(String startEndLocs) {
		this.startEndLocs = startEndLocs;
	}
	public String getBoardingTime() {
		return boardingTime;
	}
	public void setBoardingTime(String boardingTime) {
		this.boardingTime = boardingTime;
	}
	public String getTicketFare() {
		return ticketFare;
	}
	public void setTicketFare(String ticketFare) {
		this.ticketFare = ticketFare;
	}
}
