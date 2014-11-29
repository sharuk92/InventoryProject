package com.project.components;

import java.util.Set;
import java.util.TreeSet;


public abstract class Area<A extends Area<?>> {

	private String name;
	private Area<?> parent;
	private Set<A> areas;

	protected Area(String name, A[] areas) {
		this.name = name;
		this.areas = new TreeSet<A>();
		for(A area : areas) {
			area.parent = this;
			this.areas.add(area);
		}
	}

	public String getName() {
		return name;
	}

	public Set<A> getAreas() {
		return areas;
	}

	public Area<?> getParent() {
		return parent;
	}

	

}
