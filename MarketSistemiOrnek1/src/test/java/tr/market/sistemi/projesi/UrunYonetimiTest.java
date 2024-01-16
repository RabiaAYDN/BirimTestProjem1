package tr.market.sistemi.projesi;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class UrunYonetimiTest {

	@Test
	public void testUrunEkle() {
		UrunYonetimi urunYonetimi = new UrunYonetimi();
		urunYonetimi.urunEkle("Supurge");
		List<String> URUN_LİSTESİ = urunYonetimi.urunListele();
		
	}

	@Test
	public void testUrunSil() {
		UrunYonetimi urunYonetimi = new UrunYonetimi();
		urunYonetimi.urunEkle("Supurge");
		urunYonetimi.urunSil("Supurge");
		List<String> URUN_LİSTESİ = urunYonetimi.urunListele();
		
	}

	@Test
	public void testUrunBul() {
		UrunYonetimi urunYonetimi = new UrunYonetimi();
		urunYonetimi.urunEkle("Supurge");
		urunYonetimi.urunBul("Supurge");
		List<String> URUN_LİSTESİ = urunYonetimi.urunListele();
		
	}

	@Test
	public void testUrunListele() {
		UrunYonetimi urunYonetimi = new UrunYonetimi();
		urunYonetimi.urunEkle("Supurge");
		urunYonetimi.urunEkle("Blender");
		List<String> URUN_LİSTESİ = urunYonetimi.urunListele();
		
		
	}

}
