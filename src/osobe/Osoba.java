package osobe;

import common.Uporediv;
import izuzeci.Neuporedivo;
import common.MerljivUcinak;
public class Osoba implements Uporediv{
	
	String ime;
	public Osoba(String ime) {
		this.ime = ime;
	}
	@Override
	public int uporedi(Object osoba) throws Neuporedivo {
		if(!(osoba instanceof MerljivUcinak) || !(this instanceof MerljivUcinak)) throw new Neuporedivo("Neuporedivo");
		int indeks1 = ((MerljivUcinak)osoba).indeksKorisnosti();
		int indeks2 = ((MerljivUcinak)this).indeksKorisnosti();
		if(indeks2>indeks1) return 1;
		if(indeks2<indeks1) return -1;
		return 0;
	} //nasledjuje interface => implements, i moramo tu da implemntiramo f-je iz topg inteface-a
	
	public String getIme() {
		return ime;
	}
	
	public String toString() {
		return ime;
	}
}
// osoba o = new Osoba(); o.uporedi(t);