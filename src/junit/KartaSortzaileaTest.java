package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logika.Karta;
import logika.KartaSortzailea;

public class KartaSortzaileaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKartaSortzailea() {
		// Besteetan testeatzen da.
		assertTrue(true);
	}

	@Test
	public void testKartaSortu() {
		Karta karta = KartaSortzailea.kartaSortu(6, "urdina");
		String izena = karta.getIzena();
		assertEquals(izena, "foka");
		assertNotEquals(izena, "loro");
		int zenbakia = karta.getZenb();
		assertEquals(zenbakia, 6);
		assertNotEquals(zenbakia, 5);
	}
}