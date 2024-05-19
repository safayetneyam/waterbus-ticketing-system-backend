package com.swe.ticketing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swe.ticketing.model.AddWaterbus;
import com.swe.ticketing.service.WaterbusService;

@RestController
@RequestMapping("/waterbus")
@CrossOrigin // Access from origin is blocked by CORS policy
public class WaterbusController {
	
	@Autowired
	private WaterbusService waterbusService;
	
	@PostMapping("/regi")
	public String regi(@RequestBody AddWaterbus addWaterbus) {
		waterbusService.regiWaterbus(addWaterbus);
		System.out.println("inside /regi");
		return "A new waterbus is registered!";
	}
	
	@GetMapping("/getList")
	public List<AddWaterbus> getAllWaterbus() {
		return waterbusService.getAllWaterbus();
	}
	
}
