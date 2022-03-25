package com.cognixia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognixia.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

	Country findByCountryid(Integer countryId);
	
	//Get all country columns by continent
	
	//Get only name from country  by continent
	@Query(value= "select c.name from country c where c.continent = ?1", nativeQuery=true)
	List<String> findAllCountriesNameByContinent(String name);

	// Get all Cities for a Country  
	@Query(value= "select c.name as cityname, co.name as countryname from city c inner join country co on c.countryid=co.countryid and c.countryid = ?1", nativeQuery=true)
	List<String> findCityByCountryid(Integer country_id);

	
	// Get Capital City for a Country 
	@Query(value= "select c.name from city c where c.countryid=?1 and c.capital = ?2", nativeQuery=true)
	String findCapitalCityByCountryid(Integer country_id, Integer capital);
}
