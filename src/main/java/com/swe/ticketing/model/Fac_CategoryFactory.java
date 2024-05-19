package com.swe.ticketing.model;

public class Fac_CategoryFactory {
	public Fac_Category getCategory (String str) {
		if (str.equalsIgnoreCase("Luxury")) {
			return new Fac_Luxury();
		} else if (str.equalsIgnoreCase("Ordinary")) {
			return new Fac_Ordinary();
		} else return null;
	}
}