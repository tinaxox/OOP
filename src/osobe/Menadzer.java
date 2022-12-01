package osobe;

import common.MerljivUcinak;
import izuzeci.NemaDovoljnoNovca;
import izuzeci.SportistaNijeOdgovarajuci;
import klub.Klub;

public class Menadzer extends Osoba implements MerljivUcinak {

  Sportista sportisti[];

  public Menadzer(String ime) {
    super(ime);
    sportisti = new Sportista[10];
  }

  public int indeksKorisnosti() {
    int suma = 0;
    for (int i = 0; i < 10; i++) {
      if (sportisti[i] != null) suma += sportisti[i].indeksKorisnosti();
    }
    return suma;
  }

  public boolean potpisiUgovorSaKlubom(
    Sportista s,
    Klub klubovi[],
    double cena
  ) {
    for (int i = 0; i < klubovi.length; i++) {
      try {
        klubovi[i].potpisiUgovor(s, cena);
      } catch (SportistaNijeOdgovarajuci | NemaDovoljnoNovca e) {
        System.out.println(e.getMessage());
      }
      return true;
    }
    return false;
  }
}
