package com.swe.ticketing.model;

public class Adp_WaterbusFareCalculator implements Adp_FareCalculator {

	@Override
	public double calculateFare(double distanceInKm) {
		// TODO Auto-generated method stub
		return distanceInKm * 5;
	}

}
