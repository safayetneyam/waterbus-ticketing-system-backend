package com.swe.ticketing.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swe.ticketing.model.AddSchedule;
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
	
	@GetMapping("/{id}")
	public Optional<AddWaterbus> getWaterbusById(@PathVariable int id) {
		return waterbusService.getWaterbusById(id);
	}
	
	@PostMapping("/schedule")
	public String schedule(@RequestBody AddSchedule addSchedule) {
		int wbId = addSchedule.getWaterbusid();
		int tripid = addSchedule.getTripid() + 1;
		String startTime, arrivalTime;
		startTime = addSchedule.getTime();
		// System.out.println(startTime);
		List<AddSchedule> schedulesToSave = new ArrayList<>();
		
		
		String[] locations = {"Gulshan", "Police Plaza", "Rampura", "Badda", "FDC"};
		int[] timeTakes = {12, 13, 15, 10};
		
		//09:00
		int hours = Integer.parseInt(startTime.substring(0, 2));
        int minutes = Integer.parseInt(startTime.substring(3));
        
        // UP TRIP
		for (int i = 0; i < locations.length; i++) {
			if (i != 0) {
                minutes += timeTakes[i - 1];
                hours += minutes / 60;
                minutes %= 60;
            }
			arrivalTime = String.format("%02d:%02d", hours, minutes);
			
			AddSchedule scheduleRow = new AddSchedule();
			scheduleRow.setTripid(tripid);
			scheduleRow.setDeparture(locations[i]);
			scheduleRow.setWaterbusid(wbId);
			scheduleRow.setDir("UP");
			
//			LocalDate currentDate = LocalDate.now();
//			String currentDateString = currentDate.toString();
			
			Date currentDate = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			String currentDateTime = dateFormat.format(currentDate);  
			
			scheduleRow.setDate(currentDateTime);
			scheduleRow.setTime(arrivalTime);
			
			schedulesToSave.add(scheduleRow);
		}
		
		// DOWN TRIP
		
		for (int i = locations.length - 1; i >= 0; i--) {
            if (i != locations.length - 1) minutes += timeTakes[i]; 
            else minutes += 20; // takes break of 20 minutes
            
            hours += minutes / 60;
            minutes %= 60;

            arrivalTime = String.format("%02d:%02d", hours, minutes);
            
            AddSchedule scheduleRow = new AddSchedule();
			scheduleRow.setTripid(tripid);
			scheduleRow.setDeparture(locations[i]);
			scheduleRow.setWaterbusid(wbId);
			scheduleRow.setDir("DOWN");
			
//			LocalDate currentDate = LocalDate.now();
//			String currentDateString = currentDate.toString();
			
			Date currentDate = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
			String currentDateTime = dateFormat.format(currentDate);  
			
			scheduleRow.setDate(currentDateTime);
			scheduleRow.setTime(arrivalTime);
			
			schedulesToSave.add(scheduleRow);
            
        }
		
		for (AddSchedule schedule : schedulesToSave) {
            waterbusService.saveSchedule(schedule);
        }
		
		return "A schedule has been added!";
	}
	
	@GetMapping("/getSchedule")
	public List<AddSchedule> getAllSchedule() {
		return waterbusService.getAllSchedule();
	}
}
