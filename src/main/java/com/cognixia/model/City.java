package com.cognixia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="City")
public class City {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="CityId")
	  private Integer cityid;
	  
	  @Column(name="Name")
	  private String cityname;
	 
	  @Column(name="CountryId")
	  private Integer countryid;
	  
	  @Column(name="Capital")
	  private Integer capital;
	  
	  @Column(name="FirstLandmark")
	  private String firstlandmark;
	  
	  @Column(name="SecondLandmark")
	  private String secondlandmark;
	  
	  @Column(name="ThirdLandmark")
	  private String thirdlandmark;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(Integer cityid, String cityname, Integer countryid, Integer capital, String firstlandmark,
			String secondlandmark, String thirdlandmark) {
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.countryid = countryid;
		this.capital = capital;
		this.firstlandmark = firstlandmark;
		this.secondlandmark = secondlandmark;
		this.thirdlandmark = thirdlandmark;
	}

	public Integer getCityid() {
		return cityid;
	}

	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public Integer getCapital() {
		return capital;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public String getFirstlandmark() {
		return firstlandmark;
	}

	public void setFirstlandmark(String firstlandmark) {
		this.firstlandmark = firstlandmark;
	}

	public String getSecondlandmark() {
		return secondlandmark;
	}

	public void setSecondlandmark(String secondlandmark) {
		this.secondlandmark = secondlandmark;
	}

	public String getThirdlandmark() {
		return thirdlandmark;
	}

	public void setThirdlandmark(String thirdlandmark) {
		this.thirdlandmark = thirdlandmark;
	}

	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", countryid=" + countryid + ", capital=" + capital
				+ ", firstlandmark=" + firstlandmark + ", secondlandmark=" + secondlandmark + ", thirdlandmark="
				+ thirdlandmark + "]";
	}
	  

}
