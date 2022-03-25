package com.cognixia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.model.City;
import com.cognixia.repository.CityRepository;

@Service
@Transactional
public class CityService {
	
	@Autowired
	private CityRepository repo;

	//Get all cities   /cities
	public List<City> getAllCities() {
		return repo.findAll();
	}

	public City getCityId(Integer city_id) {
	 return repo.findByCityid(city_id);
	}

	public List<String> getCapitalCity(Integer capital) {
		return repo.findCityByCapital(capital);
	}

	public List<String> getCapitalCityParam(String capital) {
		int isCapital = 0;
		if(capital == "false")
			isCapital =1;
		return repo.findCityByCapital(isCapital);
	}

		
	//Get city by id    cities/{city_id}
	
	
	//Get all capital cities (with country name)     /cities?capital=true

}
