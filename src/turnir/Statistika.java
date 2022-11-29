package turnir;

public class Statistika {
	private TIP_STATISTIKE tipStatistike;
	private int BrojNaDresu;
	private String nazivKluba;
	private int ostvareniUcinak;
	
	public Statistika(TIP_STATISTIKE tipStatistike,int BrojNaDresu,String nazivKluba,int ostvareniUcinak) {
		this.tipStatistike = tipStatistike;
		this.BrojNaDresu = BrojNaDresu;
		this.nazivKluba = nazivKluba;
		this.ostvareniUcinak = ostvareniUcinak;
	}
	
	public TIP_STATISTIKE getTipStatistike() {
		return tipStatistike;
	}
	public int getBrojNaDresu() {
		return BrojNaDresu;
	}
	public String getNazivKluba() {
		return nazivKluba;
	}
	public int getOstvareniUcinak() {
		return ostvareniUcinak;
	}
}
