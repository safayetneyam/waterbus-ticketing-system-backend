package com.swe.ticketing.model;

public class Adp_FareCalculatorAdapterImpl implements Adp_FareCalculatorAdapter {

	private Adp_FareCalculator fareCalculator;
	
	public Adp_FareCalculatorAdapterImpl (Adp_FareCalculator fareCalculator) {
		this.fareCalculator = fareCalculator;
	}
	
	@Override
	public double calculateFareInTaka(double distanceinKm) {
		// TODO Auto-generated method stub
		return fareCalculator.calculateFare(distanceinKm);
	}
	
}
