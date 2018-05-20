package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logika.Karta;
import logika.KartaFactory;
import logika.LoroKarta;

public class KartaFactoryTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetKartaFactory() {
		KartaFactory karta = KartaFactory.getKartaFactory();
		assertNotNull(karta);
	}

	@Test
	public void testSortuKarta() {
		KartaFactory karta = KartaFactory.getKartaFactory();
		assertNotNull(karta);
		Karta berria = null;
		assertNull(berria);
		berria = karta.sortuKarta(2, "urdina");
		assertNotNull(berria);
	}
}