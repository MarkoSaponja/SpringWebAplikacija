//Business Logic
package com.vezbanje.SpringVezbanje.sample.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vezbanje.SpringVezbanje.sample.flow.data.DataService;

@Component
public class BusinessService{
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();
		return data.stream().reduce(Integer::sum).get();
	}
}