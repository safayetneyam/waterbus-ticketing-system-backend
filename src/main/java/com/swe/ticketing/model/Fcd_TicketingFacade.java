package com.swe.ticketing.model;

public class Fcd_TicketingFacade {
	private Fcd_WaterbusInfo waterbusInfo;
	private Fcd_StartEndLocs startEndLocation;
	private Fcd_BoardingTime boardTime;
	private Fcd_TicketFare tktFare;
	
	public Fcd_TicketingFacade() {
		this.waterbusInfo = new Fcd_WaterbusInfo();
		this.startEndLocation = new Fcd_StartEndLocs();
		this.boardTime = new Fcd_BoardingTime();
		this.tktFare = new Fcd_TicketFare();
	}
	
	public PrintTicket printTicket(int wbid, String wbname, String departure, String destination, String time, String date, int ticket_fare) {
		PrintTicket pTicket = new PrintTicket();
		
		pTicket.setWaterbusInfo(waterbusInfo.wbInfo(wbid, wbname));
		pTicket.setStartEndLocs(startEndLocation.startEndLocs(departure, destination));
		pTicket.setBoardingTime(boardTime.boardingTime(time, date));
		pTicket.setTicketFare(tktFare.ticketFare(ticket_fare));
		
		return pTicket;
	} 
}
