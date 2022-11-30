public class Fahrplan {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
    
    // Weichestellungen
    int fahrzeit = 0;
    char haltInSpandau = 'j';
    char richtungHamburg = 'j';
    char haltInStendal = 'j';
    char endetIn = 'h';

    fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

    if (haltInSpandau == 'j') {
        fahrzeit = fahrzeit + 2; // Halt in Spandau
    }
    

    if (richtungHamburg == 'j') {
        fahrzeit = fahrzeit + 96; // Fahrt Richtung Hamburg
        System.out.println("Die Fahrzeit für Hamburg beträgt: "  + fahrzeit + " Minuten.");
    }

   
    else  {
        fahrzeit = fahrzeit + 34; // Fahrt Richtung Stendal

        if (haltInStendal == 'j') {
            fahrzeit = fahrzeit + 16; // Halt in Stendal
        }
        else {
            fahrzeit = fahrzeit + 6; // Kein Halt in Stendal
        }

        if (endetIn == 'w') {
            fahrzeit = fahrzeit + 29;
            System.out.println("Die Fahrzeit für Wolfsburg beträgt: "  + fahrzeit + " Minuten."); // Fahrt von Stendal West nach Wolfsburg
        }
        
        else if (endetIn == 'b') {
            fahrzeit = fahrzeit + 50;
            System.out.println("Die Fahrzeit für Braunschweig beträgt: "  + fahrzeit + " Minuten."); // Fahrt von Stendal West nach Braunschweig
        }

        else if (endetIn == 'h')  {
            fahrzeit = fahrzeit + 62;
            System.out.println("Die Fahrzeit für Hannover beträgt: "  + fahrzeit + " Minuten."); // Fahrt von Stendal West nach Hannover
        }

    }

 }
}

