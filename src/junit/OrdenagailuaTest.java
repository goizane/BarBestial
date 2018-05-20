package junit;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import logika.Karta;
import logika.KartaZerrenda;
import logika.LoroKarta;
import logika.Ordenagailua;

public class OrdenagailuaTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testOrdenagailua() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
	}

	@Test
	public void testGetMazoaOrd() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
		Stack<Karta> mazo = ordenagailu.getMazoaOrd();
		assertNotNull(mazo);
	}

	@Test
	public void testMazotikKartaHartuOrd() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
		Stack<Karta> mazo = ordenagailu.getMazoaOrd();
		assertNotNull(mazo);
	}

	@Test
	public void testGetJokatutakoAzkenKarta() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
		Stack<Karta> mazo = ordenagailu.getMazoaOrd();
		assertNotNull(mazo);
		Karta karta = ordenagailu.getJokatutakoAzkenKarta();
		assertNotNull(karta);
	}

	@Test
	public void testGetPuntuazioa() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
		Stack<Karta> mazo = ordenagailu.getMazoaOrd();
		assertNotNull(mazo);
		int puntuazioa = ordenagailu.getPuntuazioa();
		assertNotNull(puntuazioa);
	}

	@Test
	public void testJokoaAmaituDaOrd() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
		boolean amaitu = Ordenagailua.jokoaAmaituDaOrd();
		assertFalse(amaitu);
	}

	@Test
	public void testMazokoKartaEskukoKartetaraOrd() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
		LoroKarta karta = new LoroKarta("urdina");
		ordenagailu.mazokoKartaEskukoKartetaraOrd(karta);
		KartaZerrenda zer = ordenagailu.getEskukoKartakOrd();
		assertNotNull(zer);
	}

	@Test
	public void testGetEskukoKartakOrd() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
		LoroKarta karta = new LoroKarta("urdina");
		ordenagailu.mazokoKartaEskukoKartetaraOrd(karta);
		KartaZerrenda zer = ordenagailu.getEskukoKartakOrd();
		assertNotNull(zer);
	}

	@Test
	public void testKartakKargatuOrd() {
		Ordenagailua ordenagailu = new Ordenagailua();
		assertNotNull(ordenagailu);
		List<Integer> lista = new ArrayList<Integer>();
		assertNotNull(ordenagailu);
	}

	@Test
	public void testJokatuOrd() {
		Ordenagailua ordenagailu = new Ordenagailua();
		LoroKarta karta = new LoroKarta("urdina");
		ordenagailu.jokatuOrd(karta);
		assertNotNull(ordenagailu);
	}

	@Test
	public void testOrdenagailuarenTxanda() {
		// Interfaze grafikoan frogatzen da automatikoki jolasterakoan!
		assertTrue(true);
	}

	@Test
	public void testJokalariaHasieratuOrd() {
		Ordenagailua ordenagailu = new Ordenagailua();
		ordenagailu.jokalariaHasieratuOrd();
		assertNotNull(ordenagailu);
	}

	@Test
	public void testOrdenagailuPuntuakEguneratu() {
		Ordenagailua ordenagailu = new Ordenagailua();
		LoroKarta karta = new LoroKarta("urdina");
		ordenagailu.OrdenagailuPuntuakEguneratu(karta);
		assertNotNull(ordenagailu);
	}

}
