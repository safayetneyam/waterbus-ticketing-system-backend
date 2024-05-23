package com.swe.ticketing.model;

public class FetchDistanceFare {
	
	private String departure;
	private String destination;
	private int distanceFare;
	
	// for direction
//	public FetchDistanceFare(int distanceFare) {
//		this.distanceFare = distanceFare;
//	}

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

	public int getDistanceFare() {
		return distanceFare;
	}

	public void setDistanceFare(int distanceFare) {
		this.distanceFare = distanceFare;
	}
	
}
