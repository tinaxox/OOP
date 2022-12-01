import izuzeci.Neuporedivo;
import java.util.Arrays;
import klub.FudbalskiKlub;
import klub.Klub;
import klub.KosarkaskiKlub;
import osobe.Fudbaler;
import osobe.Kosarkas;
import osobe.Menadzer;
import osobe.Osoba;
import osobe.Sportista;
import turnir.TIP_SPORTA;
import turnir.Turnir;
import turnir.Utakmica;
import turnir.Utakmica;

public class Test {

  public static void main(String[] args) {
    Osoba sportisti[] = new Sportista[18];
    sportisti[0] = new Kosarkas("Milos Teodosic", 4);
    sportisti[1] = new Kosarkas("Nemanja Bjelica", 5);
    sportisti[2] = new Kosarkas("Bogdan Bogdanovic", 6);
    sportisti[3] = new Kosarkas("Majk Cirbes", 7);
    sportisti[4] = new Kosarkas("Stefan Jovic", 8);
    sportisti[5] = new Kosarkas("Marko Guduric", 9);
    sportisti[6] = new Kosarkas("Nikola Kalinic", 10);
    sportisti[7] = new Kosarkas("Luka Mitrovic", 11);
    sportisti[8] = new Kosarkas("Nikola Milutinov", 12);
    sportisti[9] = new Fudbaler("Sasa Ilic", 4);
    sportisti[10] = new Fudbaler("Marko Perovic", 5);
    sportisti[11] = new Fudbaler("Filip Stojkovic", 6);
    sportisti[12] = new Fudbaler("Dejan Savicevic", 7);
    sportisti[13] = new Fudbaler("Dejan Stankovic", 8);
    sportisti[14] = new Fudbaler("Dejan Govedarica", 9);
    sportisti[15] = new Fudbaler("Piksi Stojkovic", 10);
    sportisti[16] = new Fudbaler("Peter Ceh", 11);
    sportisti[17] = new Fudbaler("Ivica Kralj", 12);
    Klub klubovi[] = new Klub[6];
    klubovi[0] = new FudbalskiKlub("FK Crvena Zvezda", 3000);
    klubovi[1] = new FudbalskiKlub("FK Partizan", 3000);
    klubovi[2] = new FudbalskiKlub("FK Radnicki", 3000);
    klubovi[3] = new KosarkaskiKlub("KK Crvena Zvezda", 3000);
    klubovi[4] = new KosarkaskiKlub("KK Partizan", 3000);
    klubovi[5] = new KosarkaskiKlub("KK Mega VIzura", 3000);
    Menadzer menadzeri[] = new Menadzer[3];
    menadzeri[0] = new Menadzer("Menadzer 1");
    menadzeri[1] = new Menadzer("Menadzer 2");
    menadzeri[2] = new Menadzer("Menadzer 3");

    for (int i = 0; i < sportisti.length; i += 3) {
      menadzeri[0].potpisiUgovorSaKlubom((Sportista) sportisti[i], klubovi, i);
      menadzeri[1].potpisiUgovorSaKlubom(
          (Sportista) sportisti[i + 1],
          klubovi,
          i
        );
      menadzeri[2].potpisiUgovorSaKlubom(
          (Sportista) sportisti[i + 2],
          klubovi,
          i
        );
    }

    Turnir turnir = new Turnir();
    // Primer dodavanja
    turnir.dodajUtakmicu(new Utakmica(klubovi[0], klubovi[1]));
    turnir.dodajUtakmicu(new Utakmica(klubovi[0], klubovi[2]));
    turnir.dodajUtakmicu(new Utakmica(klubovi[1], klubovi[2]));
    turnir.dodajUtakmicu(new Utakmica(klubovi[3], klubovi[4]));
    turnir.dodajUtakmicu(new Utakmica(klubovi[4], klubovi[5]));
    turnir.dodajUtakmicu(new Utakmica(klubovi[3], klubovi[5]));

    turnir.upisiStatistiku(
      klubovi[0] instanceof FudbalskiKlub
        ? TIP_SPORTA.FUDBAL
        : TIP_SPORTA.KOSARKA,
      null,
      null,
      null
    );

    for (int i = 0; i < sportisti.length; i++) {
      for (int j = i + 1; j < sportisti.length; j++) {
        try {
          if ((sportisti[i].uporedi(sportisti[j])) == 1) {
            Osoba s = sportisti[i];
            sportisti[i] = sportisti[j];
            sportisti[j] = s;
          }
        } catch (Neuporedivo error) {
          System.out.print(error.getMessage());
        }
      }
    }
    for (int i = 0; i < sportisti.length; i++) {
      if (sportisti[i] instanceof Sportista) {
        System.out.println(
          sportisti[i].toString() +
          " " +
          ((Sportista) sportisti[i]).indeksKorisnosti()
        );
      }
    }
  }
}
