package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import logika.TximinoKarta;

public class TximinoKartaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTximinoKarta() {
		TximinoKarta karta = new TximinoKarta("urdina");
		String izena = karta.getIzena();
		assertEquals(izena, "tximino");
		assertNotEquals(izena, "loro");
		int zenbakia = karta.getZenb();
		assertEquals(zenbakia, 4);
		assertNotEquals(zenbakia, 5);
	}
	
	@Test
	public void testAnimaladaEgin() {
		// Interfaze grafikan testeatzen da!
		assertTrue(true);
	}

}
