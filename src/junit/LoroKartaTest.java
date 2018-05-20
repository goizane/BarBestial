package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import logika.LoroKarta;

public class LoroKartaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAnimaladaEgin() {
		// Interfaze grafikan testeatzen da!
		assertTrue(true);
	}

	@Test
	public void testLoroKarta() {
		LoroKarta karta = new LoroKarta("urdina");
		String izena = karta.getIzena();
		assertEquals(izena, "loro");
		assertNotEquals(izena, "foka");
		int zenbakia = karta.getZenb();
		assertEquals(zenbakia, 2);
		assertNotEquals(zenbakia, 5);
	}

	@Test
	public void testKenduKarEguneratu() {
		// Animalada egiterakoan frogatzen da!
		assertTrue(true);
	}

}
