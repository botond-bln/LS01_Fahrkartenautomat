import java.util.Scanner; 

public class KursAuftrag {   

  public static void main (String[] args) {

    Scanner tastatur = new Scanner (System.in);

        int stueckzahl;
        

        double gebuehrsatz, gebuehr, kurs, kurswert, haben;     

        //--- Initialisierung

        gebuehrsatz = 0.01;     // entspricht 1%

        haben = 10000.0;    // Annahme alternativ auch eingeben lassen       


        //--- Einlesen der notwendigen Werte
        System.out.println("Bitte geben Sie die Stückzahl ein: ");
        stueckzahl = tastatur.nextInt();

        System.out.println("Bitte geben Sie den Kurs ein: ");
        kurs = tastatur.nextDouble();

        //--- Berechnung der Größen

        kurswert = kurs * stueckzahl;
        gebuehr  = kurswert * gebuehrsatz;
    

    //--- Deklaration der Variablen

    haben    = haben - gebuehr - kurswert;

     //--- Ausgabe des Kontostandes

    System.out.println("Ihr aktueller Kontostand beträgt: " + haben + " Euro");

  }

}