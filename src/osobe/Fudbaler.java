package osobe;
import turnir.TIP_STATISTIKE;
import turnir.Statistika;
import izuzeci.SportistaNijeOdgovarajuci;
public class Fudbaler extends Sportista{
	int brojGolova, brojAsistencija;
	
	public Fudbaler(String ime, int brojNaDresu) {
		super(ime, brojNaDresu);
	}
	@Override
	public int indeksKorisnosti() {
		return brojGolova*10+brojAsistencija*5;
	}
	@Override
	public void dodajStatistiku(Statistika s) throws SportistaNijeOdgovarajuci{
		switch (s.getTipStatistike()) {
		case GOLOVI: 
			brojGolova = s.getOstvareniUcinak();
			break;
		case ASISTENCIJE: 
			brojAsistencija = s.getOstvareniUcinak();
			break;
		default:
			throw new SportistaNijeOdgovarajuci("Nije fudbaler");
		}
	}
}
