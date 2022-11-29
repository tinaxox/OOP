package klub;

import osobe.Sportista;
import turnir.Statistika;

public abstract class Klub {
    String nazivKluba;
    double budzet;
    Sportista igraci[];
    public Klub(String nazivKluba, int budzet){
        this.nazivKluba = nazivKluba;
        this.budzet = budzet;
    }
    public abstract boolean potpisiUgovor(Sportista s, double cena);

    public dodajStatistikuIgracu(Statistika s){
        for (Sportista igrac : igraci){
          if(igrac.equals(s.getBrojNaDresu())){ 
            igrac.dodajStatistiku(s);
            break; 
          }
        }
    }
    public boolean equals(String nazivKluba) {
		if(this.nazivKluba.equals(nazivKluba)) return true;
		return false;
	}

    public String toString(){
        return nazivKluba;
    }
}
