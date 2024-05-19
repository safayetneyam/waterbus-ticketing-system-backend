package com.swe.ticketing.model;

public class Dec_NonAC extends Dec_CoachType {
	Dec_Waterbus waterbus;
	
	public Dec_NonAC(Dec_Waterbus wb) {
		this.waterbus = wb;
	}
	
	@Override
	public int cost() {
		return this.waterbus.cost() + 7;
	}
	
}