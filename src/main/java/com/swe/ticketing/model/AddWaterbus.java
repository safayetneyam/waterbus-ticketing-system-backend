package com.swe.ticketing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class AddWaterbus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	private String type; // decorator
	private String category; // factory
	private int baseFare = 10;
	private int capacity;
	
	public AddWaterbus() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWaterbusName() {
		return name;
	}

	public void setWaterbusName(String waterbusName) {
		this.name = waterbusName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(int baseFare) {
		this.baseFare = baseFare;
	}

	public int getSeatCapacity() {
		return capacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.capacity = seatCapacity;
	}
}
