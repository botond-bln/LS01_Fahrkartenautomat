import java.util.Scanner;
public class Kalender {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String tage = "";
		int monat;
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Wie lautet der Monat (1-12): ");
		monat = tastatur.nextInt();

        switch(monat) {
            case 1:
                tage = "31";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 2:
                tage = "28";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 3:
                tage = "31";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 4:
                tage = "30";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 5:
                tage = "31";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 6:
                tage = "30";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 7:
                tage = "31";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 8:
                tage = "31";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 9:
                tage = "30";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 10:
                tage = "31";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 11:
                tage = "30";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
            case 12:
                tage = "31";
                System.out.printf("Der %d-te Monat im Jahr hat %s Tage.", monat, tage);
                break;
        }

		tastatur.close();
	}
}