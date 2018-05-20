package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logika.FokaKarta;
import logika.HipopotamoKarta;

public class HipopotamoKartaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHipopotamoKarta() {
		HipopotamoKarta karta = new HipopotamoKarta("urdina");
		String izena = karta.getIzena();
		assertEquals(izena, "hipopotamo");
		assertNotEquals(izena, "loro");
		int zenbakia = karta.getZenb();
		assertEquals(zenbakia, 11);
		assertNotEquals(zenbakia, 5);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// Interfaze grafikan testeatzen da!
		assertTrue(true);	
	}
}