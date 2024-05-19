package com.swe.ticketing.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swe.ticketing.model.Dec_AC;
import com.swe.ticketing.model.Dec_BaseWaterbus;
import com.swe.ticketing.model.Dec_NonAC;
import com.swe.ticketing.model.Dec_Waterbus;
import com.swe.ticketing.model.Fac_Category;
import com.swe.ticketing.model.Fac_CategoryFactory;
import com.swe.ticketing.model.FetchBaseFare;

@RestController
public class FetchBaseFareController {
	
	//decorator
	Dec_Waterbus acWb = new Dec_AC (new Dec_BaseWaterbus());
	Dec_Waterbus nonacWb = new Dec_NonAC (new Dec_BaseWaterbus());
	
	//factory
	Fac_CategoryFactory cf = new Fac_CategoryFactory();  
	
	Fac_Category luxWb = cf.getCategory("luxury");
	Fac_Category ordWb = cf.getCategory("ordinary");
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/api/basefare") 
	public FetchBaseFare getBaseFare() {
		FetchBaseFare fetchBaseFare = new FetchBaseFare(acWb.cost(), nonacWb.cost(), luxWb.catRate(), ordWb.catRate());
		return fetchBaseFare;
	}

}
