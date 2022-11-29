package osobe;
import common.MerljivUcinak;
import turnir.Statistika;
import izuzeci.SportistaNijeOdgovarajuci;
public abstract class Sportista extends Osoba implements MerljivUcinak{ //abstraktne klase ne traze implementaciju metoda interfejsa
	private Menadzer menadzer;
	private int brojNaDresu;
	private Klub klub;
	
	public Sportista(String ime, int broj) {
		super(ime); //kad ti uneses ime sportiste nekog, to ime se salje klasi Osoba i  za tu klasu vazi isto to ime , new Sportista("Zika") --> ide u Osoba()
		this.brojNaDresu = broj;
	}
	
	public abstract int indeksKorisnosti();
	
	public abstract void dodajStatistiku(Statistika s) throws SportistaNijeOdgovarajuci;
	
	public void setMenadzer(Menadzer m) {
		this.menadzer = m;
	}
	public void setKlub(Klub k) {
		this.klub = k;
	}
	
	public boolean equals(int brojNaDresu) {
		if(brojNaDresu == this.brojNaDresu) return true;
		return false;
	}
	
}
