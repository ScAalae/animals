package Tierpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private boolean statusMA;
	private String name;
	private Adresse adresse;
	private float gehalt;
	private SimpleDateFormat gebDat;
	private Tier[] gekaufteTiere;

//	Konstruktor für Kunden
	public Person(boolean statusMA, String name, Adresse adresse, SimpleDateFormat gebDat) {
		super();
		this.statusMA = statusMA;
		this.name = name;
		this.adresse = adresse;
		this.gehalt = 0; //Kunden bekommen kein Gehalt...
//		this.gebDat = ;
		
		//lade Tierdaten der Kunden
		gekaufteTiere = new Tier[100];
	}
	
//	Konstruktor für Kunden
	public Person(boolean statusMA, String name, Adresse adresse, SimpleDateFormat gebDat, float Gehalt) {
		super();
		this.statusMA = statusMA;
		this.name = name;
		this.adresse = adresse;
		this.gehalt = 0; //Kunden bekommen kein Gehalt...
		this.gebDat = gebDat;
	}
	
	public boolean getStatus() {
		return statusMA;
	}
	public void setstatusMA(boolean statusMA) {
		this.statusMA = statusMA;
	}
	public String getName() {
		return name;
	}
	public void setStatus(String name) {
		this.name = name;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public float getGehalt() {
		return gehalt;
	}
	public void setGehalt(float gehalt) {
		this.gehalt = gehalt;
	}
	public SimpleDateFormat getGebDat() {
		return gebDat;
	}
	public void setGebDat(SimpleDateFormat gebDat) {
		this.gebDat = gebDat;
	}
	
	
	

}
