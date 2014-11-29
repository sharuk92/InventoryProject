package com.project.components;

import java.util.ArrayList;
import java.util.List;


public class City extends Area<Street> {
	
	public City(String name, Street[] street) {
		super(name, streets);
	}

}
