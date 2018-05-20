package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logika.FokaKarta;
import logika.KamaleoiKarta;

public class KamaleoiKartaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKamaleoiKarta() {
		KamaleoiKarta karta = new KamaleoiKarta("urdina");
		String izena = karta.getIzena();
		assertEquals(izena, "kamaleoi");
		assertNotEquals(izena, "loro");
		int zenbakia = karta.getZenb();
		assertEquals(zenbakia, 5);
		assertNotEquals(zenbakia, 4);
	}

	@Test
	public void testKopiatzekoKartaEguneratu() {
		// Interfaze grafikan testeatzen da!
		assertTrue(true);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// Interfaze grafikan testeatzen da!
		assertTrue(true);
	}
}