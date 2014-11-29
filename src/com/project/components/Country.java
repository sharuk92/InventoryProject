package com.project.components;



public class Country extends GeoEntity {


	private City[] cities;
	
	public Country() {
		super();
	}
	
	public Country(String name) {
		this.name = name;
		area = 0;
		population = 0;
	}
	
	public Country(String name, double area, double population) {
		this.name = name;
		this.area = area;
		this.population = population;
	}
	

}
