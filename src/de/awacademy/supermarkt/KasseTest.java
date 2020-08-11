package de.awacademy.supermarkt;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class KasseTest {

	@Test
	public void scanZweiProdukte() {
		
		// 1. Testdaten vorbereiten
		Produkt vanilleEis = new Produkt("Vanilleeis", 299);
		Produkt schokoEis = new Produkt("Schokoeis", 399);
		
		Kasse kasse = new Kasse();
		
		
		// 2. Logik ausführen
		kasse.scan(vanilleEis);
		kasse.scan(schokoEis);
		
		int zwischenSumme = kasse.getZwischenSumme();
		
		
		// 3. Erwartungswerte vergleichen
		Assert.assertEquals(698, zwischenSumme);
	}
	
	
	@Test
	public void einkaufsWagen() {

		// 1. Testdaten vorbereiten
		Produkt vanilleEis = new Produkt("Vanilleeis", 299);
		Produkt schokoEis = new Produkt("Schokoeis", 3949);
		
		Kasse kasse = new Kasse();
		// 2. Logik ausführen
		kasse.scan(vanilleEis);
		kasse.scan(schokoEis);

		ArrayList<Produkt> produkte = kasse.getEinkaufsWagen(); // String[]
		
		// 3. Erwartungswerte vergleichen
		Assert.assertEquals(2, produkte.size());
		
	}
	

}
