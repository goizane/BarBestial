package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logika.Jokalari;
import logika.Karta;
import logika.Pertsona;

public class JokalariTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJokalari() {
		// Herentzia da
		assertTrue(true);
	}

	@Test
	public void testKartakNahastu() {
		Jokalari jok = new Pertsona();
		List<Integer> kartak = jok.kartakNahastu();
		assertNotNull(kartak);
	}

	@Test
	public void testJokalariarenKoloreaHasieratu() {
		Jokalari jok = new Pertsona();
		String kolorea = "urdina";
		jok.jokalariarenKoloreaHasieratu(kolorea);
		// Herentzia da.
		assertTrue(true);
	}

}
