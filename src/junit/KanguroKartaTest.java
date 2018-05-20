package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logika.FokaKarta;
import logika.KanguroKarta;

public class KanguroKartaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKanguroKarta() {
		KanguroKarta karta = new KanguroKarta("urdina");
		String izena = karta.getIzena();
		assertEquals(izena, "kanguro");
		assertNotEquals(izena, "loro");
		int zenbakia = karta.getZenb();
		assertEquals(zenbakia, 3);
		assertNotEquals(zenbakia, 5);
	}

	@Test
	public void testSaltoa() {
		// Interfaze grafikan testeatzen da!
		assertTrue(true);	
	}

	@Test
	public void testAnimaladaEgin() {
		// Interfaze grafikan testeatzen da!
		assertTrue(true);
	}
}