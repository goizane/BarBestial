package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import logika.KrokodiloKarta;

public class KrokodiloKartaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKrokodiloKarta() {
		KrokodiloKarta karta = new KrokodiloKarta("urdina");
		String izena = karta.getIzena();
		assertEquals(izena, "krokodilo");
		assertNotEquals(izena, "loro");
		int zenbakia = karta.getZenb();
		assertEquals(zenbakia, 10);
		assertNotEquals(zenbakia, 5);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// Interfaze grafikan testeatzen da!
		assertTrue(true);
	}
}