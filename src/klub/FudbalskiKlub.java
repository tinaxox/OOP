package klub;

import izuzeci.NemaDovoljnoNovca;
import izuzeci.SportistaNijeOdgovarajuci;
import osobe.Fudbaler;
import osobe.Sportista;

public class FudbalskiKlub extends Klub{
    public FudbalskiKlub (String naziv, int budzet){
        super(naziv,budzet);
    }

    public boolean potpisiUgovor(Sportista s, int cena) throws NemaDovoljnoNovca, SportistaNijeOdgovarajuci{
        if(!(s instanceof Fudbaler)) throw new SportistaNijeOdgovarajuci("Nije Fudbaler"); 
        if(budzet<cena) throw new NemaDovoljnoNovca("Nema dovoljno novca");
        for(int i=0;i<11; i++) {
            if(igraci[i]==null) {
                igraci[i]=s;
                budzet-=cena;
                return true;
            }
        }
        return false;
    }
}
