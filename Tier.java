package Tierpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Date;

public class Tier {
	private String art;
	private String name;
	private float grösse;
	private float gewicht = 0;
	private boolean satt = false;
	private SimpleDateFormat gebDatum;
	
	public Tier(String art, String name, float grösse) {
		 super();
		 this.art = art;
		 this.name = name;
		 this.satt = false;
		 this.grösse = grösse;
	}

	
	//hier fehlen noch Getter und Setter
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getGrösse() {
		return grösse;
	}
	public void setGrösse(float grösse) {
		this.grösse = grösse;
	}
	
	public float getGewicht() {
		return gewicht;
	}
	public void setGewicht(float gewicht) {
		this.grösse = gewicht;
	}
	
	public SimpleDateFormat getDate() {
		return gebDatum;
	}
	public void setDate(SimpleDateFormat date) {
		this.gebDatum = date;
	}
	
	
	public boolean füttern(){
		if(satt){
			return false;
		} else {
			//Fütterungsprozess
			System.out.println("Bitte " +art +" namens " +name +" füttern");
			return true;
		}

	}
	
	public void schlafen() {
		//Licht aus
		
	}
	
	public int beschäftigen() {
		int beschäftigungswert;
		
		//Beschäftigungsprozedur (errechnet Beschäftigungswert)
		beschäftigungswert = 5;
		
		return beschäftigungswert;	
	}
	
	public void entwurmen() {
		
	}

}
