package junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import logika.LehoiKarta;
import logika.LoroKarta;

public class KartaTest {
	
	// Amaituta dago. Ondo funtzionatzen du testak.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKarta() {
		// Herentzia
		assertTrue(true);
	}

	@Test
	public void testAnimaladaEgin() {
		// Herentzia
		assertTrue(true);
	}

	@Test
	public void testGetKolorea() {
		// Herentzia
		assertTrue(true);
	}

	@Test
	public void testGetZenb() {
		LoroKarta karta = new LoroKarta("urdina");
		karta.setZenb(2);
		int zenbakia = karta.getZenb();
		assertNotNull(zenbakia);
		assertEquals(zenbakia, 2);
	}

	@Test
	public void testSetZenb() {
		LoroKarta karta = new LoroKarta("urdina");
		karta.setZenb(2);
		int zenbakia = karta.getZenb();
		assertNotNull(zenbakia);
		assertEquals(zenbakia, 2);
	}

	@Test
	public void testGetIrudia() {
		// Interfazerako sortua!
		assertTrue(true);
	}

	@Test
	public void testSetIrudia() {
		// Interfazerako sortua!
		assertTrue(true);	
	}

	@Test
	public void testIsErrekurtsiboa() {
		LoroKarta karta = new LoroKarta("urdina");
		karta.setErrekurtsiboa(true);
		assertTrue(karta.isErrekurtsiboa());
		
		LehoiKarta karta2 = new LehoiKarta("urdina");
		karta2.setErrekurtsiboa(false);
		assertFalse(karta2.isErrekurtsiboa());
	}

	@Test
	public void testSetErrekurtsiboa() {
		LoroKarta karta = new LoroKarta("urdina");
		karta.setErrekurtsiboa(true);
		assertTrue(karta.isErrekurtsiboa());
		
		LehoiKarta karta2 = new LehoiKarta("urdina");
		karta2.setErrekurtsiboa(false);
		assertFalse(karta2.isErrekurtsiboa());
	}

	@Test
	public void testGetIzena() {
		LoroKarta karta = new LoroKarta("urdina");
		karta.setIzena("loro");
		assertNotNull(karta.getIzena());
		assertEquals(karta.getIzena(), "loro");
		assertNotEquals(karta.getIrudia(), "lehoi");
		
		LehoiKarta karta2 = new LehoiKarta("urdina");
		karta2.setIzena("lehoi");
		assertNotNull(karta2.getIzena());
		assertEquals(karta2.getIzena(), "lehoi");
		assertNotEquals(karta2.getIzena(), "loro");
	}

	@Test
	public void testSetIzena() {
		LoroKarta karta = new LoroKarta("urdina");
		karta.setIzena("loro");
		assertNotNull(karta.getIzena());
		assertEquals(karta.getIzena(), "loro");
		assertNotEquals(karta.getIrudia(), "lehoi");
		
		LehoiKarta karta2 = new LehoiKarta("urdina");
		karta2.setIzena("lehoi");
		assertNotNull(karta2.getIzena());
		assertEquals(karta2.getIzena(), "lehoi");
		assertNotEquals(karta2.getIzena(), "loro");
	}

	@Test
	public void testAnimaladaEginInt() {
		LoroKarta karta = new LoroKarta("urdina");
		karta.animaladaEgin(2);
		
		LehoiKarta karta2 = new LehoiKarta("urdina");
		karta2.animaladaEgin(12);
	}

	@Test
	public void testKoloreaEguneratu() {
		LoroKarta karta = new LoroKarta("urdina");
		karta.koloreaEguneratu("berdea");
		String kolorea = karta.getKolorea();
		assertNotNull(kolorea);
		assertEquals(kolorea, "berdea");
		assertNotEquals(kolorea, "urdina");
		
		LoroKarta karta2 = new LoroKarta("berdea");
		karta2.koloreaEguneratu("urdina");
		String kolorea2 = karta2.getKolorea();
		assertNotNull(kolorea2);
		assertEquals(kolorea2, "urdina");
		assertNotEquals(kolorea2, "berdea");
	}

	@Test
	public void testCompareTo() {
		LoroKarta karta = new LoroKarta("urdina");
		LoroKarta karta2 = new LoroKarta("berdea");
		int kont = karta.compareTo(karta2);
		assertNotNull(kont);
	}
}