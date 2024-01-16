package tr.market.sistemi.projesi;

import java.util.ArrayList;
import java.util.List;

public class UrunYonetimi {
	
	private List<String> URUN_LİSTESİ = new ArrayList<>();
	
	public void urunEkle(String urunAdi) {
		URUN_LİSTESİ.add(urunAdi);
	}
	
	
	public void urunSil(String urunAdi) {
		URUN_LİSTESİ.remove(urunAdi);
	}
	
	
	
	public void urunBul(String urunAdi) {
		URUN_LİSTESİ.equals(urunAdi);
	}
	
	
	public List<String> urunListele(){
		return URUN_LİSTESİ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
