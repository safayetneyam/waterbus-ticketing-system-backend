package com.swe.ticketing.service;

import java.util.List;

import com.swe.ticketing.model.AddWaterbus;

public interface WaterbusService {
	public AddWaterbus regiWaterbus(AddWaterbus addWaterbus);
	public List<AddWaterbus> getAllWaterbus();
	
	
}
