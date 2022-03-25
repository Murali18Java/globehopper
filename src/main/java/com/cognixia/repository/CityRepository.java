package com.cognixia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognixia.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {

	City findByCityid(Integer city_id);

	//select * from city where capital =1
	@Query (value="select c.name as cityname, co.name as countryname from city c inner join country co on c.countryid=co.countryid and c.capital=?1", nativeQuery=true)
	List<String> findCityByCapital(int isCapital);

	
}
