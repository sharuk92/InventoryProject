package com.project.components;


public class World extends Area<Country> {
	
	public World(String name, Country[] countries) {
		super(name, countries);
	}

	public World() {

		this("Earth", new Country[]{
			new Country("Morocco", new City[] {
				new City("Casablanca", new Street[]{
					new Street("2 mars"),
					new Street("Hay Hassani"),
					new Street("Sbata")}),
				new City("Fes", new Street[]{
					new Street("Kassem"),
					new Street("Ibrahim")}),
				new City("Marrakech", new Street[]{
					new Street("Fanaa"),
					new Street("Ibn elhaitham")})
			}),
			new Country("Russia", new City[] {
				new City("Nijny Novogord", new Street[]{
					new Street("Gagarina"),
					new Street("Lenina"),
					new Street("Geroev")})
				}),
		
			});

	}


}
