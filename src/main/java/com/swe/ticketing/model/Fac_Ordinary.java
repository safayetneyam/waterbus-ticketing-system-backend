package com.swe.ticketing.model;

public class Fac_Ordinary implements Fac_Category {

	@Override
	public int catRate() {
		return 5;
	}

	@Override
	public double refundRate() {
		return 0.20;
	}

}
