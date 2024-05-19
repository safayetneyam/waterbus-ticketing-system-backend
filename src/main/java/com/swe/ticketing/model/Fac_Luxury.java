package com.swe.ticketing.model;

public class Fac_Luxury implements Fac_Category {

	@Override
	public int catRate() {
		return 10;
	}

	@Override
	public double refundRate() {
		return 0.50;
	}

}
