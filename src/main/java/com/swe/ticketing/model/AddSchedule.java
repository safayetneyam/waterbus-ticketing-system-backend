package com.swe.ticketing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class AddSchedule {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int scheduleid;
	
	private int tripid;
	private int waterbusid;
	private String departure;
	private String time;
	private String dir; //direction
	private String date;
	public int getScheduleid() {
		return scheduleid;
	}
	
	public void setScheduleid(int scheduleid) {
		this.scheduleid = scheduleid;
	}
	public int getTripid() {
		return tripid;
	}
	public void setTripid(int tripid) {
		this.tripid = tripid;
	}
	public int getWaterbusid() {
		return waterbusid;
	}
	public void setWaterbusid(int waterbusid) {
		this.waterbusid = waterbusid;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
