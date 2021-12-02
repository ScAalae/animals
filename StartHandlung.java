package Tierpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StartHandlung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Tierhandlungsobjekt erstellen
		Tierhandlung tierhandlungBieler;
		tierhandlungBieler = new Tierhandlung(); //neues Objekt wird erstellt. Passiert nur einmal pro Programmablauf
		
//		Benutzereingaben per Scanner-Klasse
		Scanner sc = new Scanner(System.in);
		
//		Startmeldung
		System.out.println("Willkommen bei der " + tierhandlungBieler.getFirmenname() );
		int eingabe = 0;
		
//		Daten laden
		System.out.println("Lade Daten.");
		tierhandlungBieler.setTierliste(ladeTierDaten());
//		tierhandlungBieler.setKundinnenListe(ladeKundinnenDaten());
		System.out.println("Daten geladen.");
		menüpunkt3(tierhandlungBieler);
		
		
		while (eingabe != 9) {
			System.out.println("---------------------");
			System.out.println("Hauptmenü");
			System.out.println("1. Tier hinzufügen");
			System.out.println("2. Tier verkaufen");
			System.out.println("3. Tiere anzeigen");
			System.out.println("4. Tier löschen");
			System.out.println("9. Programm beenden");
			eingabe = sc.nextInt();
	
			
			switch(eingabe) {
				case 1:
					menüpunkt1(tierhandlungBieler);
					break;
				case 2:					
					menüpunkt2(tierhandlungBieler);
					break;
				case 3:					
					menüpunkt3(tierhandlungBieler);
					break;
				case 4:					
					menüpunkt4(tierhandlungBieler);
					break;
	//			case 5:					
	//				menüpunkt5(tierhandlungBieler);
	//				break;
				case 9:
					System.out.println("Programm wird beendet");
					break;
				default:
					System.out.println("Falsche Eingabe!!!!1");
					break;
			}
	
		}
		System.out.println(  "Daten wurden nicht gespeichert.. :("  );

	}
	
	
	//---Menümethoden---
	
	public static void menüpunkt1(Tierhandlung tierhandlungBieler) {
		
		Scanner sc = new Scanner(System.in);
		String art;
		String name;
		float grösse;
		
		System.out.println("Bitte Daten eingeben. Art:");
		art = sc.next();
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Größe:");
		grösse = sc.nextFloat();
		
		Tier neuesTier = new Tier(art, name, grösse);
		tierhandlungBieler.addTier(neuesTier);
		
		
	}
	public static void menüpunkt2(Tierhandlung tierhandlungBieler) {
		System.out.println("Tier wird glücklich verkauft");
		
	}
	
//	public static void menüpunkt33(Tierhandlung tierhandlungBieler) {
//		
//		for(int i = 0; i< tierhandlungBieler.getTierliste().length; i++ ) {
//			if(tierhandlungBieler.getTierliste()[i] == null) {
//				System.out.println("-------Liste Ende------");
//				break;
//			}
//			
//			System.out.println("---------------");
//			System.out.println( (i+1) + ". Tier");
//			System.out.println("Art: " + tierhandlungBieler.getTierliste()[i].getArt() );
//			System.out.println("Name: " + tierhandlungBieler.getTierliste()[i].getName() );
//			System.out.println("Grösse: " + tierhandlungBieler.getTierliste()[i].getGrösse() );
//		}
//		
//		System.out.println("");	
//	}
	public static void menüpunkt3(Tierhandlung tierhandlungBieler) {
			
			for(int i = 0; i< tierhandlungBieler.getnewtierList().size(); i++ ) {
				Tier animal=tierhandlungBieler.getnewtierList().get(i);
				if(animal== null) {
					System.out.println("-------Liste Ende------");
					break;
				}
				
				System.out.println("---------------");
				System.out.println( (i+1) + ". Tier");
				System.out.println("Art: " + animal.getArt() );
				System.out.println("Name: " + animal.getName() );
				System.out.println("Grösse: " + animal.getGrösse() );
			}
			
			System.out.println("");	
		}
	public static void menüpunkt4(Tierhandlung tierhandlungBieler) {
		// noch zu fuellen
		System.out.println("Bitte Tiernummer wählen");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		
		tierhandlungBieler.entferneTier(index-1);		
	}
	
	public static ArrayList <Tier> ladeTierDaten() {
		ArrayList <Tier> rueckgabe;
		rueckgabe = new ArrayList<Tier>();
				
		rueckgabe.add(new Tier("Katze", "Katze1", (float)1.1));
		rueckgabe.add( new Tier("Hund", "Norbert", (float)1.2));
		rueckgabe.add(new Tier("Pfau", "", (float)1.3));
		rueckgabe.add(new Tier("Kugelfisch", "Kirby", (float)1.4)) ;
		// Array mit Daten füllen. Stattdessen könnte z.B. auch ein Datei- oder DB-Zugriff durchgeführt werden
		
		
		
		return rueckgabe;
	}
	
	public static Person[] ladeKundinnenDaten() {
		Person[] rueckgabe;
		rueckgabe = new Person[100];
				
		rueckgabe[0] = new Person(false, "Kim", new Adresse("Strasse1", 12345, "", "14"), new SimpleDateFormat("01.10.2000"));
		
		// Array mit Daten füllen. Stattdessen könnte z.B. auch ein Datei- oder DB-Zugriff durchgeführt werden
		
		// Arrayfelder 4-99 bleiben erstmal bei null
		
		return rueckgabe;
	}
	
	
	
	//TestMethode - Wie wende ich SimpleDateFormat an?
	public static SimpleDateFormat liesDatum() {
		
		//Beispiel für Datumsformat
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Datum eingeben:");
		String test = sc.next();
		SimpleDateFormat datum = new SimpleDateFormat(test);
		
//		System.out.println("Datum: " + datum.toPattern());
		return datum;
		
	}	
	
}





















