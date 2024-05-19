package com.swe.ticketing.model;

public class Dec_AC extends Dec_CoachType {
	
	Dec_Waterbus waterbus;
	
	public Dec_AC(Dec_Waterbus wb) {
		this.waterbus = wb;
	}
	
	@Override
	public int cost() {
		return this.waterbus.cost() + 13;
	}
	
}
