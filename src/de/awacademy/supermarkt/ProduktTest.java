package de.awacademy.supermarkt;

import org.junit.Assert;
import org.junit.Test;


public class ProduktTest {

	@Test
	public void name() {
		
		// 1. Testdaten vorbereiten
		String vanilleEisName = "Vanilleeis";
		int vanilleEisPreis = 299;
		String schokoEisName = "Schokoeis";
		int schokoEisPreis = 399;
		
		
		// 2. Logik ausf�hren
		Produkt vanilleEis = new Produkt(vanilleEisName, vanilleEisPreis);
		Produkt schokoEis = new Produkt(schokoEisName, schokoEisPreis);
		
		
		// 3. Erwartungswerte pr�fen
		Assert.assertEquals("Vanilleeis", vanilleEis.getName());
		Assert.assertEquals(299, vanilleEis.getPreis());
		
		Assert.assertEquals("Schokoeis", schokoEis.getName());
		Assert.assertEquals(399, schokoEis.getPreis());
	}
	
	
}
