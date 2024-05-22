package com.swe.ticketing.service;

import java.util.List;

import com.swe.ticketing.model.AddSchedule;
import com.swe.ticketing.model.AddWaterbus;

public interface WaterbusService {
	//add water bus
	public AddWaterbus regiWaterbus(AddWaterbus addWaterbus);
	public List<AddWaterbus> getAllWaterbus();
	
	// schedule water bus
	public AddSchedule saveSchedule(AddSchedule addSchedule);
	public List<AddSchedule> getAllSchedule();
}
