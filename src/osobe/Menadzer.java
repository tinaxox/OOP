package osobe;
import izuzeci.MerljivUcinak;

public class Menadzer extends Osoba implements MerljivUcinak{
    Sportista sportisti[];

    public Menadzer(String ime){
        super(ime);
        sportisti = new Sportista[10];
    }

    public int indeksKorisnosti(){
        int suma=0;
        for(int i=0;i<10;i++){
            if(sportisti[i]!=null)
                suma+=sportisti[i].indeksKorisnosti();
        }
    }

    public boolean potpisiUgovorSaKlubom(Sportista s, Klub klubovi[]){

    }


}