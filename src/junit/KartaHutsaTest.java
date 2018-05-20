package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import logika.KartaHutsa;

public class KartaHutsaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKartaHutsa() {
		KartaHutsa karta = new KartaHutsa();
		String izena = karta.getIzena();
		assertEquals(izena, "kartaHutsa");
		assertNotEquals(izena, "loro");
		int zenbakia = karta.getZenb();
		assertEquals(zenbakia, 0);
		assertNotEquals(zenbakia, 5);
	}
}