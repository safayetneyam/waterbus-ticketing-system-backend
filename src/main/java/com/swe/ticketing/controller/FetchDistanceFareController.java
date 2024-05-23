package com.swe.ticketing.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swe.ticketing.model.Adp_FareCalculator;
import com.swe.ticketing.model.Adp_FareCalculatorAdapter;
import com.swe.ticketing.model.Adp_FareCalculatorAdapterImpl;
import com.swe.ticketing.model.Adp_WaterbusFareCalculator;
import com.swe.ticketing.model.FetchDistanceFare;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class FetchDistanceFareController {
	
	private FetchDistanceFare fetchDistanceFare = new FetchDistanceFare();
	
	@PostMapping("/api/locations")
	public FetchDistanceFare calculate(@RequestBody FetchDistanceFare distanceFare) {
		String dpt = distanceFare.getDeparture();
		String dst = distanceFare.getDestination();
		
		String[] locations = {"Gulshan", "Police Plaza", "Rampura", "Badda", "FDC"};
		int[] distInKm = {2, 3, 4, 2};
		
		int dpt_idx = 0, dst_idx = 0, dist = 0; 
		
		for (int i = 0; i <= 4; i++) {
			if (locations[i] == dpt) dpt_idx = i;
			else if (locations[i] == dst) dst_idx = i;
		}
	
		if (dpt_idx < dst_idx) {
			for (int i = dpt_idx; i < dst_idx; i++) 
				dist += distInKm[i];
		} else {
			for (int i = dpt_idx - 1; i >= dst_idx; i--) 
				dist += distInKm[i];
		}
		
		
		Adp_FareCalculator fareCalculator = new Adp_WaterbusFareCalculator();
		Adp_FareCalculatorAdapter fareCalculatorAdapter = new Adp_FareCalculatorAdapterImpl(fareCalculator);
		double calc = fareCalculatorAdapter.calculateFareInTaka(dist);

		int distFare = (int)calc;
		fetchDistanceFare.setDistanceFare(distFare);
		return fetchDistanceFare;
	}
	
	@GetMapping("/api/distanceFare")
	public FetchDistanceFare getDistanceFare() {
		return fetchDistanceFare;
	}
	
}