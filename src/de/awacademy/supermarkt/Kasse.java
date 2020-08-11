package de.awacademy.supermarkt;

import java.util.ArrayList;

public class Kasse {

	private int zwischenSumme = 0;
	private ArrayList<Produkt> einkaufsWagen = new ArrayList<>();
	
	public void scan(Produkt produkt) {
		this.zwischenSumme = this.zwischenSumme + produkt.getPreis();
		// oder: zwischenSumme += produkt.getPreis();
		
		this.einkaufsWagen.add(produkt);
	}
	
	public int getZwischenSumme() {
		return this.zwischenSumme;
	}

	public ArrayList<Produkt> getEinkaufsWagen() {
		return this.einkaufsWagen;
	}
}
