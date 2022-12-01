package turnir;

import izuzeci.SportistaNijeOdgovarajuci;
import klub.Klub;

public class Utakmica {

  Klub domacin, gost;

  public Utakmica(Klub domacin, Klub gost) {
    this.domacin = domacin;
    this.gost = gost;
  }

  public boolean equals(String domacin, String gost) {
    if (this.domacin.equals(domacin) && this.gost.equals(gost)) return true;
    return false;
  }

  public void dodajStatistiku(Statistika statistika) {
    Klub k = null;
    if (this.domacin.equals(statistika.getNazivKluba())) {
      k = domacin;
    } else {
      k = gost;
    }

    try { //jer dodajStatistikuIgracu baca djubre, a ova hvata, i ona  moze da ima throw i onda da da nekoj drugoj, mora da ima bar jedna try-catch koja ce da isporuci gresku
      k.dodajStatistikuIgracu(statistika);
      return;
    } catch (SportistaNijeOdgovarajuci error) {
      System.out.println(error.getMessage());
    }
  }
}
