package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logika.Karta;
import logika.KartaZerrenda;
import logika.LehoiKarta;
import logika.LoroKarta;
import logika.TximinoKarta;

public class KartaZerrendaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testKartaZerrenda() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
	}

	@Test
	public void testGehituKarta() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
	}

	@Test
	public void testKolorekoKartakKontatu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		int zenbat = zer.kolorekoKartakKontatu("urdina");
		assertNotNull(zenbat);
		assertNotEquals(zenbat, 2);
	}

	@Test
	public void testTamaina() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		int tam = zer.tamaina();
		assertEquals(tam, 1);
		assertNotEquals(tam, 2);
	}

	@Test
	public void testGet() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		Karta kar = zer.get(0);
		assertEquals(kar, karta);
		assertNotNull(kar);
	}

	@Test
	public void testDaukaKarta() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		boolean dauka = zer.dauka(karta);
		assertTrue(dauka);
		LehoiKarta kar = new LehoiKarta("urdina");
		boolean dauka2 = zer.dauka(kar);
		assertFalse(dauka2);
	}

	@Test
	public void testHasieratu() {
		KartaZerrenda zer = new KartaZerrenda();
		zer.hasieratu();
		assertNotNull(zer);
	}

	@Test
	public void testKenduKarta() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		boolean dauka = zer.dauka(karta);
		assertTrue(dauka);
		LehoiKarta kar = new LehoiKarta("urdina");
		boolean dauka2 = zer.dauka(kar);
		assertFalse(dauka2);
		zer.kenduKarta(karta);
		boolean dauka3 = zer.dauka(karta);
		assertFalse(dauka3);
	}

	@Test
	public void testZerrendaBete() {
		KartaZerrenda zer = new KartaZerrenda();
		zer.hasieratu();
		zer.zerrendaBete();
		assertNotNull(zer);
	}

	@Test
	public void testPuntuakKontatu() {
		KartaZerrenda zer = new KartaZerrenda();
		zer.hasieratu();
		zer.zerrendaBete();
		assertNotNull(zer);
		int puntuak = zer.puntuakKontatu(1);
		assertNotNull(puntuak);
	}

	@Test
	public void testKartaAltuenaBilatu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		boolean dauka = zer.dauka(karta);
		assertTrue(dauka);
		LehoiKarta kar = new LehoiKarta("urdina");
		boolean dauka2 = zer.dauka(kar);
		assertFalse(dauka2);
		Karta kartaAlt = zer.kartaAltuenaBilatu();
		assertNotNull(kartaAlt);
	}

	@Test
	public void testHutsikDago() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		boolean dauka = zer.dauka(karta);
		assertTrue(dauka);
		LehoiKarta kar = new LehoiKarta("urdina");
		boolean dauka2 = zer.dauka(kar);
		assertFalse(dauka2);
		boolean hutsik = zer.hutsikDago();
		assertFalse(hutsik);
	}

	@Test
	public void testHutsik() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		boolean dauka = zer.dauka(karta);
		assertTrue(dauka);
		LehoiKarta kar = new LehoiKarta("urdina");
		boolean dauka2 = zer.dauka(kar);
		assertFalse(dauka2);
		boolean hutsik = zer.hutsikDago();
		assertFalse(hutsik);
	}

	@Test
	public void testErrepikatutaDago() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		boolean dauka = zer.dauka(karta);
		assertTrue(dauka);
		boolean errepikatuta = zer.errepikatutaDago(2);
		assertFalse(errepikatuta);
	}

	@Test
	public void testTamainaKartaHutsBarik() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		int tam = zer.tamainaKartaHutsBarik();
		assertEquals(tam, 1);
		assertNotEquals(tam, 2);
	}

	@Test
	public void testAzkenKartaBilatu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LehoiKarta karta = new LehoiKarta("urdina");
		zer.gehituKarta(karta);
		Karta kar = zer.azkenKartaBilatu(12);
		assertEquals(karta, kar);
		assertNotNull(kar);
	}

	@Test
	public void testKartaPosizioBateanSartu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.kartaPosizioBateanSartu(karta, 0);
		assertNotNull(zer);
	}

	@Test
	public void testOrdenardenaAldatu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.kartaPosizioBateanSartu(karta, 0);
		zer.ordenardenaAldatu();
		assertNotNull(zer);
	}

	@Test
	public void testSet() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		assertNotNull(zer);
	}

	@Test
	public void testBiKartaAltuenakKenduZerrendaTxikia() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.kartaPosizioBateanSartu(karta, 0);
		assertNotNull(zer);
	}

	@Test
	public void testDaukaInt() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		boolean dauka = zer.dauka(2);
		assertTrue(dauka);
		LehoiKarta kar = new LehoiKarta("urdina");
		boolean dauka2 = zer.dauka(12);
		assertFalse(dauka2);
	}

	@Test
	public void testTxikiagoakDirenKartakEzabatu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		zer.txikiagoakDirenKartakEzabatu(2, 0);
		assertNotNull(zer);
	}

	@Test
	public void testTarteBateanTxikiagoakDirenKartakKendu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		assertNotNull(zer);
	}

	@Test
	public void testKartaLortuZenbakiarekin() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		Karta kar = zer.kartaLortuZenbakiarekin(2);
		assertEquals(karta, kar);
		assertNotNull(kar);
	}

	@Test
	public void testTximinoakKanporatu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		TximinoKarta kar = new TximinoKarta("urdina");
		zer.gehituKarta(kar);
		zer.tximinoakKanporatu();
		assertNotNull(zer);
	}

	@Test
	public void testKartaBatenPosizioaLortu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		TximinoKarta kar = new TximinoKarta("urdina");
		zer.gehituKarta(kar);
		int pos = zer.kartaBatenPosizioaLortu(2);
		assertNotNull(pos);
	}

	@Test
	public void testZerrendaOrdenatu() {
		KartaZerrenda zer = new KartaZerrenda();
		assertNotNull(zer);
		LoroKarta karta = new LoroKarta("urdina");
		zer.gehituKarta(karta);
		TximinoKarta kar = new TximinoKarta("urdina");
		zer.gehituKarta(kar);
		zer.zerrendaOrdenatu(0, 1);
	}

}
