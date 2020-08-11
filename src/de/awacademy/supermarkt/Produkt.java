package de.awacademy.supermarkt;

public class Produkt {

	private String name; // Pflichtfeld
	private int preis; // Preis in Cent, Pflichtfeld
	
	public Produkt(String name, int preis) {
		this.name = name;
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public int getPreis() {
		return preis;
	}
	
	
	
	
	
}
