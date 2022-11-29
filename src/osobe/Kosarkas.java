package osobe;
import turnir.TIP_STATISTIKE;
import turnir.Statistika;
import izuzeci.SportistaNijeOdgovarajuci;
public class Kosarkas extends Sportista{
	int brojKoseva, brojAsistencija;
	
	public Kosarkas(String ime, int brojNaDresu) {
		super(ime, brojNaDresu);
	}
	@Override
	public int indeksKorisnosti() {
		return brojKoseva+brojAsistencija;
	}
	@Override
	public void dodajStatistiku(Statistika s) throws SportistaNijeOdgovarajuci{
		switch (s.getTipStatistike()) {
		case KOSEVI: 
			brojGolova = s.getOstvareniUcinak();
			break;
		case ASISTENCIJE: 
			brojAsistencija = s.getOstvareniUcinak();
			break;
		default:
			throw new SportistaNijeOdgovarajuci("Nije kosarkas");
		}
	}
}