package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import logika.KartaZerrenda;
import logika.LoroKarta;
import logika.Ordenagailua;
import logika.Pertsona;
import logika.Tableroa;

public class TableroTest {
	
	// Amaituta dago. Testak ondo funtzionatzen du.

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTableroa() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
	}

	@Test
	public void testTableroaHasieratu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
	}

	@Test
	public void testJokokoKartakHasieratu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		tableroa.jokokoKartakHasieratu();
	}

	@Test
	public void testTabernakoKartakHasieratu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		tableroa.tabernakoKartakHasieratu();
	}

	@Test
	public void testKalekoKartakHasieratu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		tableroa.kalekoKartakHasieratu();
	}

	@Test
	public void testGetOrdenagailua() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		Ordenagailua ordenagailu = tableroa.getOrdenagailua();
		assertNotNull(ordenagailu);
	}

	@Test
	public void testGetPertsona() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		Pertsona pertsona = tableroa.getPertsona();
		assertNotNull(pertsona);
	}

	@Test
	public void testGetPerKartak() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		KartaZerrenda zerrenda = tableroa.getPerKartak();
		assertNotNull(zerrenda);
	}

	@Test
	public void testGetTabernakoKartak() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		KartaZerrenda zerrenda = tableroa.getTabernakoKartak();
		assertNotNull(zerrenda);
	}

	@Test
	public void testGetJokokoKartak() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		KartaZerrenda zerrenda = tableroa.getJokokoKartak();
		assertNotNull(zerrenda);
	}

	@Test
	public void testJokokoKartakEguneratu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		String izena = "goizane";
		tableroa.tableroaHasieratu(izena);
		KartaZerrenda zerrenda = tableroa.getTabernakoKartak();
		assertNotNull(zerrenda);
		tableroa.jokokoKartakEguneratu(zerrenda);
		KartaZerrenda zer = tableroa.getJokokoKartak();
		assertEquals(zerrenda, zer);
	}

	@Test
	public void testJokatuPer() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		LoroKarta karta = new LoroKarta("urdina");
		tableroa.jokatuPer(karta);
	}

	@Test
	public void testJokatuOrd() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		LoroKarta karta = new LoroKarta("urdina");
		tableroa.jokatuOrd(karta);
	}

	@Test
	public void testSaltatu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		int saltoa = 2;
		tableroa.saltatu(saltoa);
	}

	@Test
	public void testPertsonaIrabazi() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		LoroKarta karta = new LoroKarta("urdina");
		tableroa.jokatuPer(karta);
		tableroa.jokatuOrd(karta);
		boolean irabazi = tableroa.pertsonaIrabazi();
		assertFalse(irabazi);
	}

	@Test
	public void testBerdinketa() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		LoroKarta karta = new LoroKarta("urdina");
		tableroa.jokatuPer(karta);
		tableroa.jokatuOrd(karta);
		boolean berdinketa = tableroa.berdinketa();
		assertFalse(berdinketa);
	}

	@Test
	public void testJokokoKartakBeteta() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		LoroKarta karta = new LoroKarta("urdina");
		tableroa.jokatuPer(karta);
		tableroa.jokatuOrd(karta);
		boolean beteta = tableroa.jokokoKartakBeteta();
		assertFalse(beteta);
	}

	@Test
	public void testJokokoKartakSartuKanporatu() {
		// Interfaze grafikoan frogatzen da!
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
	}

	@Test
	public void testAnimaladaErrekurtsiboakEgin() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		tableroa.animaladaErrekurtsiboakEgin();
	}

	@Test
	public void testJokokoKartakHustu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		tableroa.jokokoKartakHustu();
	}

	@Test
	public void testIlaranKartaSartu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		LoroKarta karta = new LoroKarta("urdina");
		tableroa.ilaranKartaSartu(karta);
	}

	@Test
	public void testIlarakoLehenengoBiakSartu() {
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
		tableroa.ilarakoLehenengoBiakSartu();
	}

	@Test
	public void testAzkenaKanporatu() {
		// Interfaze grafikoan frogatzen da!
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
	}

	@Test
	public void testAzkenKartaLortu() {
		// Interfaze grafikoan frogatzen da!
		Tableroa tableroa = Tableroa.getTableroa();
		assertNotNull(tableroa);
	}
}