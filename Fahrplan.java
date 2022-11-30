public class Fahrplan {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
    
    // Weichestellungen
    int fahrzeit = 0;
    char haltInSpandau = 'j';
    char richtungHamburg = 'n';
    char haltInStendal = 'j';
    char endetInWolfsburg = 'j';
    char endetInbraunschweig = 'j';
    char endetInHannover = 'j';

    fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau

    if (haltInSpandau == 'j') {
        fahrzeit = fahrzeit + 2; // Halt in Spandau
    }
    

    if (richtungHamburg == 'j') {
        fahrzeit = fahrzeit + 96; // Fahrt Richtung Hamburg
        System.out.println("Fahrzeit für Hamburg: "  + fahrzeit);
    }

   
    else  {
        fahrzeit = fahrzeit + 34; // Fahrt Richtung Stendal

        if (haltInStendal == 'j') {
            fahrzeit = fahrzeit + 16; // Halt in Stendal
        }
        else {
            fahrzeit = fahrzeit + 6; // Kein Halt in Stendal
        }

        if (endetInWolfsburg == 'j') {
            fahrzeit = fahrzeit + 29;
            System.out.println("Fahrzeit für Wolfsburg: " + fahrzeit); // Fahrt von Stendal West nach Wolfsburg
        }
        
        if (endetInbraunschweig == 'j') {
            fahrzeit = fahrzeit + 50;
            System.out.println("Fahrzeit für Braunschweig: " + fahrzeit); // Fahrt von Stendal West nach Braunschweig
        }

        if (endetInHannover == 'j') {
            fahrzeit = fahrzeit + 62;
            System.out.println("Fahrzeit für Hannover: " + fahrzeit); // Fahrt von Stendal West nach Hannover
        }

    }

 }
}

