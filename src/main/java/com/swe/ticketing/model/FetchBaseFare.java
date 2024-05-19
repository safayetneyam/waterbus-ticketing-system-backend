package com.swe.ticketing.model;

public class FetchBaseFare {
//	Dec_Waterbus acWb = new Dec_AC (new Dec_BaseWaterbus());
//	Dec_Waterbus nonacWb = new Dec_NonAC (new Dec_BaseWaterbus());

	private int fareac;
	private int farenonac;
	private int farelux;
	private int fareord;
	
	public FetchBaseFare (int fareac, int farenonac, int farelux, int fareord) {
		this.fareac = fareac;
		this.farenonac = farenonac;
		this.farelux = farelux;
		this.fareord = fareord;
	}

	public int getFareac() {
		return fareac;
	}

	public void setFareac(int fareac) {
		this.fareac = fareac;
	}

	public int getFarenonac() {
		return farenonac;
	}

	public void setFarenonac(int farenonac) {
		this.farenonac = farenonac;
	}

	public int getFarelux() {
		return farelux;
	}

	public void setFarelux(int farelux) {
		this.farelux = farelux;
	}

	public int getFareord() {
		return fareord;
	}

	public void setFareord(int fareord) {
		this.fareord = fareord;
	}
}
