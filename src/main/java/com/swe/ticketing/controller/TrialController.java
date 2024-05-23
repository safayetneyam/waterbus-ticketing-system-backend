package com.swe.ticketing.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trial")
@CrossOrigin

public class TrialController {
	private String storedString;

    @PostMapping("/addNotice")
    public void storeString(@RequestBody String string) {
        this.storedString = string;
    }

    @GetMapping("/getNotice")
    public String retrieveString() {
        return this.storedString;
    }
}
