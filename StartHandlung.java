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
		men�punkt3(tierhandlungBieler);
		
		
		while (eingabe != 9) {
			System.out.println("---------------------");
			System.out.println("Hauptmen�");
			System.out.println("1. Tier hinzuf�gen");
			System.out.println("2. Tier verkaufen");
			System.out.println("3. Tiere anzeigen");
			System.out.println("4. Tier l�schen");
			System.out.println("9. Programm beenden");
			eingabe = sc.nextInt();
	
			
			switch(eingabe) {
				case 1:
					men�punkt1(tierhandlungBieler);
					break;
				case 2:					
					men�punkt2(tierhandlungBieler);
					break;
				case 3:					
					men�punkt3(tierhandlungBieler);
					break;
				case 4:					
					men�punkt4(tierhandlungBieler);
					break;
	//			case 5:					
	//				men�punkt5(tierhandlungBieler);
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
	
	
	//---Men�methoden---
	
	public static void men�punkt1(Tierhandlung tierhandlungBieler) {
		
		Scanner sc = new Scanner(System.in);
		String art;
		String name;
		float gr�sse;
		
		System.out.println("Bitte Daten eingeben. Art:");
		art = sc.next();
		System.out.println("Name:");
		name = sc.next();
		System.out.println("Gr��e:");
		gr�sse = sc.nextFloat();
		
		Tier neuesTier = new Tier(art, name, gr�sse);
		tierhandlungBieler.addTier(neuesTier);
		
		
	}
	public static void men�punkt2(Tierhandlung tierhandlungBieler) {
		System.out.println("Tier wird gl�cklich verkauft");
		
	}
	
//	public static void men�punkt33(Tierhandlung tierhandlungBieler) {
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
//			System.out.println("Gr�sse: " + tierhandlungBieler.getTierliste()[i].getGr�sse() );
//		}
//		
//		System.out.println("");	
//	}
	public static void men�punkt3(Tierhandlung tierhandlungBieler) {
			
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
				System.out.println("Gr�sse: " + animal.getGr�sse() );
			}
			
			System.out.println("");	
		}
	public static void men�punkt4(Tierhandlung tierhandlungBieler) {
		// noch zu fuellen
		System.out.println("Bitte Tiernummer w�hlen");
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
		// Array mit Daten f�llen. Stattdessen k�nnte z.B. auch ein Datei- oder DB-Zugriff durchgef�hrt werden
		
		
		
		return rueckgabe;
	}
	
	public static Person[] ladeKundinnenDaten() {
		Person[] rueckgabe;
		rueckgabe = new Person[100];
				
		rueckgabe[0] = new Person(false, "Kim", new Adresse("Strasse1", 12345, "", "14"), new SimpleDateFormat("01.10.2000"));
		
		// Array mit Daten f�llen. Stattdessen k�nnte z.B. auch ein Datei- oder DB-Zugriff durchgef�hrt werden
		
		// Arrayfelder 4-99 bleiben erstmal bei null
		
		return rueckgabe;
	}
	
	
	
	//TestMethode - Wie wende ich SimpleDateFormat an?
	public static SimpleDateFormat liesDatum() {
		
		//Beispiel f�r Datumsformat
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Datum eingeben:");
		String test = sc.next();
		SimpleDateFormat datum = new SimpleDateFormat(test);
		
//		System.out.println("Datum: " + datum.toPattern());
		return datum;
		
	}	
	
}





















