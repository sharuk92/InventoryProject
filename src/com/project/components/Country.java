package com.project.components;

import java.util.ArrayList;
import java.util.List;


public class Country extends Area<City> {

	public Country(String name, City[] cities) {
		super(name, cities);
	}
	
}
