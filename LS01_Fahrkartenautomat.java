public class LS01_Fahrkartenautomat {

	public static void main(String[] args) {
		
		String typ = "Automat AVR";
		String bezeichnung = "Q2021_FAB_A";
		String name = typ + " " + bezeichnung;		
		
		char sprachModul = 'd';		
		
		final byte PRUEFNR = 4;		
		
		double maximum = 100.00;
		double patrone = 46.24;
		double prozent = maximum - patrone;
		
		int muenzenCent = 1280;
		int muenzenEuro = 130;
		int summe = muenzenCent + muenzenEuro * 100;
		int euro = summe / 100;
		int cent = summe % 100;
		
		boolean status = false;
		status = false;

		status = ((euro <= 150) && (prozent >= 50.00) && (euro >= 50) && (cent != 0) && (sprachModul == 'd') &&  (!(PRUEFNR == 5 || PRUEFNR == 6)));
		
		System.out.println("Name: " + name);
		System.out.println("Sprache: " + sprachModul);
		System.out.println("Pruefnummer : " + PRUEFNR);
		System.out.println("Fuellstand Patrone: " + prozent + " %");
		System.out.println("Summe Euro: " + euro +  " Euro");
		System.out.println("Summe Rest: " + cent +  " Cent");
		System.out.println("Status: " + status);
	}

}