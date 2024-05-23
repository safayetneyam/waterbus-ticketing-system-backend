package com.swe.ticketing.service;

import java.util.List;
import java.util.Optional;

import com.swe.ticketing.model.AddSchedule;
import com.swe.ticketing.model.AddWaterbus;

public interface WaterbusService {
	//add water bus
	public AddWaterbus regiWaterbus(AddWaterbus addWaterbus);
	public List<AddWaterbus> getAllWaterbus();
	
	public Optional<AddWaterbus> getWaterbusById(int id);
	
	// schedule water bus
	public AddSchedule saveSchedule(AddSchedule addSchedule);
	public List<AddSchedule> getAllSchedule();
}
