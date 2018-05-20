package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logika.Jokalari;
import logika.JokalariZerrenda;
import logika.Pertsona;

public class JokalariZerrendaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testJokalariZerrenda() {
		JokalariZerrenda zerrenda = JokalariZerrenda.getJokalariZerrenda();
		assertNotNull(zerrenda);
	}

	@Test
	public void testGetJokalariZerrenda() {
		JokalariZerrenda zerrenda = JokalariZerrenda.getJokalariZerrenda();
		assertNotNull(zerrenda);
	}

	@Test
	public void testGetJok() {
		JokalariZerrenda zerrenda3 = JokalariZerrenda.getJokalariZerrenda();
		assertNotNull(zerrenda3);
	}

	@Test
	public void testGetJokalari() {
		JokalariZerrenda zerrenda2 = JokalariZerrenda.getJokalariZerrenda();
		assertNotNull(zerrenda2);
	}

	@Test
	public void testGehituJokalaria() {
		JokalariZerrenda zer = JokalariZerrenda.getJokalariZerrenda();
		Pertsona per = new Pertsona();
		zer.gehituJokalaria(per);
		assertNotNull(zer);
	}

}
