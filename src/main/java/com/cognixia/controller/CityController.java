package com.cognixia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.model.City;
import com.cognixia.service.CityService;

@RestController
@RequestMapping("/cities")
public class CityController {
	
	@Autowired
	private CityService service;
	
	//Get all cities   /cities
	@GetMapping()
	public List<City> getAllCities(){
		return service.getAllCities();
	}
	
	//Get city by id    cities/{city_id}
	@GetMapping("/{city_id}")
	public City getCity(@PathVariable Integer city_id){
		return service.getCityId(city_id);
	}
	
	//Get all capital cities (with country name)    /cities/capitals/{capital}
	@GetMapping("/capitals/{capital}")
	public List<String> getCapitalCity(@PathVariable Integer capital){
		return service.getCapitalCity(capital);
	}
	
	//Get all capital cities (with country name)    /cities?capital=true
		@GetMapping("?capital=true")
		public List<String> getCapitalCityParam(@RequestParam String capital){
			return service.getCapitalCityParam(capital);
		}
		
			
}
