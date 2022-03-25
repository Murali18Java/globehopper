package com.cognixia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.model.Country;
import com.cognixia.repository.CountryRepository;


@Service
@Transactional
public class CountryService {
	
	@Autowired
	private CountryRepository repo;
	
	//Get all countries service
	public List<Country> getAllCountries() {
		return repo.findAll();		
	}
	
	//Get country by Id
	public Country getCountryById(Integer CountryId) {
		return repo.findByCountryid(CountryId);
	}

	//Get country by continent
	
	public List<String> getAllCountriesNameByContinent(String name) {
		return repo.findAllCountriesNameByContinent(name);
		}

	// Get all Cities for a Country  		/countries/{country_id}/cities
	public List<String> getAllCity(Integer country_id) {
		return repo.findCityByCountryid(country_id);
	}

	// Get Capital City for a Country 
	public String getCapitalCity(Integer country_id, Integer capital) {
		return repo.findCapitalCityByCountryid(country_id, capital);
	}
}
