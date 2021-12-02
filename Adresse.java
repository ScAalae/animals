package Tierpackage;

public class Adresse {
	String strasse;
	int plz;
	String adresszusatz;
	String hausnummer;
	
	public Adresse(String strasse, int plz, String adresszusatz, String hausnummer) {
		super();
		this.strasse = strasse;
		this.plz = plz;
		this.adresszusatz = adresszusatz;
		this.hausnummer = hausnummer;
	}
	
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	public int getPlz() {
		return plz;
	}

}
