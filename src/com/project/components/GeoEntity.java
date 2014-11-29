package com.netcracker.web;

public abstract class GeoEntity {
	
	protected String name;
	protected double area;
	protected double population;
	
	public GeoEntity() {
		name = " ";
		area = 0;
		population = 0;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setpopulation(double population) {
		this.population = population;
	}
	
	
	public String getName() {
		return name;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getpopulation() {
		return population;
	}


}
