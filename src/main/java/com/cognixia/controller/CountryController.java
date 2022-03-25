package com.cognixia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.model.City;
import com.cognixia.model.Country;
import com.cognixia.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {
	
	@Autowired
	private CountryService service;
	
	//Get all countries end point        /countries
	@GetMapping()
	public List<Country> getAllCountries() {
		return service.getAllCountries();
	}
	
	//Get Country by Country ID   /{country_id}
	@GetMapping("/{country_id}")
	public Country getCountryById(@PathVariable Integer country_id) {
		return service.getCountryById(country_id);
	}
	
	//Get all countries by continent   /continents?name=<continent name>
	@GetMapping("/continents")
	public List<String> getAllCountriesNameByContinent(@RequestParam String name) {
	System.out.println("\n\n\nThe continent is: " + name + "\n\n\n");
	return service.getAllCountriesNameByContinent(name);
	}
	
	// Get all Cities for a Country  		/countries/{country_id}/cities
		 @GetMapping("{country_id}/cities")
			public List<String> getAllCity(@PathVariable Integer country_id){
				return service.getAllCity(country_id);
			}
			
	// Get Capital City for a Country  		 /countries/{country_id}/cities/{capital}
		 @GetMapping("{country_id}/cities/{capital}")
			public String getCapitalCity(@PathVariable Integer country_id, @PathVariable Integer capital){
				return service.getCapitalCity(country_id, capital);
			}
			
}
