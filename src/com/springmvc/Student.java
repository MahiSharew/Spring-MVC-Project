package com.springmvc;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country; 
	private LinkedHashMap<String,String> countryoption; 
	private String favoriteLanguage;
	private String[] os; 
	
	public String[] getOs() {
		return os;
	}
	public void setOs(String[] os) {
		this.os = os;
	}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public Student() {
		
		countryoption= new LinkedHashMap<>();
		countryoption.put("Ethopia", "Ethopia");
		countryoption.put("USA","USA");
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LinkedHashMap<String,String> getCountryoption() {
		return countryoption;
	}
	public void setCountryoption(LinkedHashMap<String,String> countryoption) {
		this.countryoption = countryoption;
	}

}
