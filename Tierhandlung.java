package Tierpackage;

import java.util.ArrayList;

public class Tierhandlung {

	private String firmenname = "Tierhandlung Bieler";
	private String adresse = "Marie-Bautz-Weg";
	private int telefon = 12345;
	private Tier[] tierliste = new Tier[10];
	ArrayList <Tier> newtierList = new ArrayList <Tier>(); 
	
	
	public void verkaufen(Tier verkaufstier) {
		//hier wird Code stehen
		System.out.println(verkaufstier.getName() + " wurde verkauft!");
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		//Prüfung, ob echte Adresse
		
		this.adresse = adresse;
	}
	
	public String getFirmenname() {
		return firmenname;
	}
	
	public Tier[] getTierliste() {
		return tierliste;
	}
	
	public Tier getTier(int index) {
		return tierliste[index];
	}
	
	
	public void setTierliste(ArrayList<Tier> newtierList) {
		this.newtierList = newtierList;
	}
	public void addTierElement(Tier neuesElement) {
		newtierList.add(neuesElement);
	}
	public void addTier(Tier neuesTier) {
		boolean eingefügt = false;
		
		for(int index = 0; index < tierliste.length; index++ ) {
			if(tierliste[index] == null) {
				tierliste[index] = neuesTier;
				eingefügt = true;
				break;
			} 
		}
		if(!eingefügt) {
			System.out.println("Tier wurde nicht hinzugefügt. Zu wenig Platz.");
		}
	}

	public void entferneTierElement(Tier altesTier) {
		// TODO Auto-generated method stub
		newtierList.remove(altesTier);
		
	}

	public ArrayList<Tier> getnewtierList() {
		// TODO Auto-generated method stub
		return newtierList;
	}
	
	
	
	
	
	
	
}
