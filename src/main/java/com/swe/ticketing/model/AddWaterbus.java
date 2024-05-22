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
	private int basefare;
	private int capacity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String waterbusName) {
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

	public int getBasefare() {
		return basefare;
	}

	public void setBasefare(int baseFare) {
		this.basefare = baseFare;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int seatCapacity) {
		this.capacity = seatCapacity;
	}
}
