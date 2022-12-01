package klub;

import izuzeci.NemaDovoljnoNovca;
import izuzeci.NemaDovoljnoNovca;
import izuzeci.SportistaNijeOdgovarajuci;
import osobe.Sportista;
import turnir.Statistika;
import turnir.TIP_SPORTA;

public abstract class Klub {

  String nazivKluba;
  double budzet;
  Sportista igraci[];

  public Klub(String nazivKluba, int budzet) {
    this.nazivKluba = nazivKluba;
  }

  public abstract boolean potpisiUgovor(Sportista s, double cena)
    throws NemaDovoljnoNovca, SportistaNijeOdgovarajuci;

  public void dodajStatistikuIgracu(Statistika s)
    throws SportistaNijeOdgovarajuci {
    for (Sportista igrac : igraci) {
      if (igrac.equals(s.getBrojNaDresu())) {
        igrac.dodajStatistiku(s);
        break;
      }
    }
  }

  public boolean equals(String nazivKluba) {
    if (this.nazivKluba.equals(nazivKluba)) return true;
    return false;
  }

  public String toString() {
    return nazivKluba;
  }
}
