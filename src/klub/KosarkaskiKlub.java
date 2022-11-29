package klub;

import izuzeci.NemaDovoljnoNovca;
import izuzeci.SportistaNijeOdgovarajuci;
import osobe.Kosarkas;
import osobe.Sportista;

public class KosarkaskiKlub extends Klub{
    public KosarkaskiKlub(String naziv, int budzet){
        super(naziv,budzet);
    }

    public boolean potpisiUgovor(Sportista s, int cena) throws NemaDovoljnoNovca, SportistaNijeOdgovarajuci{
        if(!(s instanceof Kosarkas)) throw new SportistaNijeOdgovarajuci("Nije Kosarkas"); 
        if(budzet<cena) throw new NemaDovoljnoNovca("Nema dovoljno novca");
        for(int i=0;i<5; i++) {
            if(igraci[i]==null) {
                igraci[i]=s;
                budzet-=cena;
                return true;
            }
        }
        return false;
    }
}
