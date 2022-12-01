package turnir;

import klub.*; //sve iz paketa

public class Turnir {

  Utakmica kosarkaskeUtakmice[], fudbalskeUtakmice[];

  public Turnir() {
    kosarkaskeUtakmice = new Utakmica[10];
    fudbalskeUtakmice = new Utakmica[10];
  }

  public void dodajUtakmicu(Utakmica u) {
    if (u.domacin instanceof FudbalskiKlub) {
      for (int i = 0; i < fudbalskeUtakmice.length; i++) {
        if (fudbalskeUtakmice[i] == null) {
          fudbalskeUtakmice[i] = u;
          return;
        } else if (u.domacin instanceof KosarkaskiKlub) {
          for (int j = 0; j < kosarkaskeUtakmice.length; j++) {
            if (kosarkaskeUtakmice[i] == null) {
              kosarkaskeUtakmice[i] = u;
              return;
            }
          }
        }
      }
    }
  }

  public void upisiStatistiku(
    TIP_SPORTA tipSport,
    String domacin,
    String Gost,
    Statistika s
  ) {
    //     switch (tipSport){
    //         case FUDBAL:
    //         for(int i=0;i<fudbalskeUtakmice.length;i++){
    //             if(fudbalskeUtakmice[i].equals(domacin, Gost)){
    //                 fudbalskeUtakmice[i].dodajStatistiku(s);
    //                 return;
    //             };
    //             break;
    //         case KOSARKA:
    //         for(int i=0;i<kosarkaskeUtakmice.length;i++){
    //             if(kosarkaskeUtakmice[i].equals(domacin, Gost)){
    //                 kosarkaskeUtakmice[i].dodajStatistiku(s);
    //                 return;
    //             }
    //             break;
    //     }
    // }
    // }
    Utakmica utakmice[] = null;
    switch (tipSport) {
      case FUDBAL:
        utakmice = fudbalskeUtakmice;
        break;
      case KOSARKA:
        utakmice = kosarkaskeUtakmice;
        break;
    }
    for (int i = 0; i < utakmice.length; i++) {
      if (utakmice[i].equals(domacin, Gost)) {
        utakmice[i].dodajStatistiku(s);
        return;
      }
    }
  }
}
