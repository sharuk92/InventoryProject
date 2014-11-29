package com.netcracker.web;

import java.util.ArrayList;
import java.util.List;


public class City extends GeoEntity {
	
	private List<Street> streets;
	
	
	public City() {
		super();
		setStreets(new ArrayList<Street>());
	}


	public List<Street> getStreets() {
		return streets;
	}


	public void setStreets(List<Street> streets) {
		this.streets = streets;
	}

}
