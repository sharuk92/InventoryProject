package com.project.components;

import java.util.ArrayList;
import java.util.List;


public class Country extends GeoEntity {


	private List<City> cities;
	
	public Country() {
		super();
		setCities(new ArrayList<City>());
	}
	
	public Country(String name) {
		this.name = name;
		area = 0;
		population = 0;
		setCities(new ArrayList<City>());
	}
	
	public Country(String name, double area, double population) {
		this.name = name;
		this.area = area;
		this.population = population;
		setCities(new ArrayList<City>());
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
