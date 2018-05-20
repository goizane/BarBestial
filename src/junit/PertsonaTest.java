package junit;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import logika.KartaZerrenda;
import logika.LoroKarta;
import logika.Pertsona;

public class PertsonaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPertsona() {
		Pertsona pertsona = new Pertsona();
		assertNotNull(pertsona);
	}

	@Test
	public void testGetPuntuazioa() {
		Pertsona pertsona = new Pertsona();
		assertNotNull(pertsona);
		int puntuazioa = pertsona.getPuntuazioa();
		assertNotNull(puntuazioa);
	}

	@Test
	public void testMazotikKartaHartuPer() {
		Pertsona pertsona = new Pertsona();
		assertNotNull(pertsona);
	}

	@Test
	public void testJokoaAmaituDaPer() {
		Pertsona pertsona = new Pertsona();
		assertNotNull(pertsona);
		boolean amaitu = pertsona.jokoaAmaituDaPer();
		assertFalse(amaitu);
	}

	@Test
	public void testGetEskukoKartakPer() {
		Pertsona pertsona = new Pertsona();
		assertNotNull(pertsona);
		LoroKarta karta = new LoroKarta("urdina");
		KartaZerrenda zer = pertsona.getEskukoKartakPer();
		assertNotNull(zer);
	}

	@Test
	public void testKartakKargatuPer() {
		Pertsona pertsona = new Pertsona();
		assertNotNull(pertsona);
		List<Integer> lista = new ArrayList<Integer>();
		assertNotNull(pertsona);
	}

	@Test
	public void testJokatuPer() {
		Pertsona pertsona = new Pertsona();
		LoroKarta karta = new LoroKarta("urdina");
		pertsona.jokatuPer(karta);
		assertNotNull(pertsona);
	}

	@Test
	public void testJokalariaHasieratuPer() {
		Pertsona pertsona = new Pertsona();
		pertsona.jokalariaHasieratuPer();
		assertNotNull(pertsona);
	}

	@Test
	public void testIzenaHasieratu() {
		Pertsona pertsona = new Pertsona();
		assertNotNull(pertsona);
		String goizane = "goizane";
		pertsona.izenaHasieratu(goizane);
		String izena = pertsona.getIzena();
		assertNotNull(izena);
		assertEquals(izena, goizane);
	}

	@Test
	public void testGetIzena() {
		Pertsona pertsona = new Pertsona();
		assertNotNull(pertsona);
		String goizane = "goizane";
		pertsona.izenaHasieratu(goizane);
		String izena = pertsona.getIzena();
		assertNotNull(izena);
		assertEquals(izena, goizane);
	}

	@Test
	public void testPertsonaPuntuakEguneratu() {
		Pertsona pertsona = new Pertsona();
		LoroKarta karta = new LoroKarta("urdina");
		pertsona.pertsonaPuntuakEguneratu(karta);
		assertNotNull(pertsona);
	}

}
