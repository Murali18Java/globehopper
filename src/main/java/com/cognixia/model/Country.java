package com.cognixia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Country")
public class Country {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="CountryId")
	private Integer countryid;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Population")
	private Integer population;
	
	@Column(name="Continent")
	private String continent;
	
	public Country() {
		super();
	}
	
	public Country(int countryid, String name, int population, String continent) {
		super();
		this.countryid = countryid;
		this.name = name;
		this.population = population;
		this.continent = continent;
	}
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Country [countryid=" + countryid + ", name=" + name + ", population=" + population + ", continent="
				+ continent + "]";
	}
	
	
}
