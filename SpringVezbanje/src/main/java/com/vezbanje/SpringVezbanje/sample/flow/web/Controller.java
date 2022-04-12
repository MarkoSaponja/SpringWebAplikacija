package com.vezbanje.SpringVezbanje.sample.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vezbanje.SpringVezbanje.sample.flow.business.BusinessService;

@RestController
public class Controller {
	@Autowired
	private BusinessService businessService;
	
	
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}
}