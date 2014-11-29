package com.project.components;



public class Country {

	private String nameCountry;
	private double areaCountry;
	private double populationCountry;
	
	public Country() {
		nameCountry = " ";
		areaCountry = 0;
		populationCountry = 0;
	}
	
	public Country(String name) {
		nameCountry = name;
		areaCountry = 0;
		populationCountry = 0;
	}
	
	public Country(String name, double area, double population) {
		nameCountry = name;
		areaCountry = area;
		populationCountry = population;
	}
	
	
	public void setnameCountry(String name) {
		nameCountry = name;
	}
	
	public void setareaCountry(double area) {
		areaCountry = area;
	}
	
	public void setpopulationCountry(double population) {
		populationCountry = population;
	}
	
	
	public String getnameCountry() {
		return nameCountry;
	}
	
	public double getareaCountry() {
		return areaCountry;
	}
	
	public double getpopulationCountry() {
		return populationCountry;
	}

}
