package com.swe.ticketing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swe.ticketing.model.AddWaterbus;
import com.swe.ticketing.repository.WaterbusRepository;

@Service

public class WaterbusServiceImpl implements WaterbusService {
	
	@Autowired
	private WaterbusRepository waterbusRepository;

	@Override
	public AddWaterbus regiWaterbus(AddWaterbus addWaterbus) {
		// TODO Auto-generated method stub
		System.out.println("inside waterbus service");
		return waterbusRepository.save(addWaterbus);
	}

	@Override
	public List<AddWaterbus> getAllWaterbus() {
		// TODO Auto-generated method stub
		return waterbusRepository.findAll();
	}
	
}
