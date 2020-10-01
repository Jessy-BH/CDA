package tp3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exo3 {
	
	public static void main(String[] args) throws ParseException {

		aujourdhui();
		maintenant();
		System.out.println("Saisir un jour");
		int j = Clavier.lireInt();
		System.out.println("Saisir un mois");
		int m = Clavier.lireInt();
		System.out.println("Saisir une année");
		int a = Clavier.lireInt();
		Date dateSaisie = saisirDate(j, m, a);
		System.out.println(dateSaisie);

	}

	public static void aujourdhui() {

		Date dateDuJour = new Date();
		SimpleDateFormat formatDeDate = new SimpleDateFormat("dd/MM/yyyy");
		String jour = formatDeDate.format(dateDuJour);
		System.out.println("Aujourd hui, nous sommes le " + jour);
	}

	public static void maintenant() {
		Date dateDuJour = new Date();
		int heure = dateDuJour.getHours();
		int min = dateDuJour.getMinutes();
		System.out.println("Il est " + heure + " heures et " + min + " minutes");

	}

	public static Date saisirDate(int j, int m, int a) throws ParseException {
		Date dateSaisie = null;
                
		if (j < 1 || j > 31 || m < 1 || m > 12) {
			System.out.println("ERREUR");
		} else if (m == 2) { 
                        
			if ((isBissextile(a) == true && j > 29) || (isBissextile(a) == false && j > 28)) {
				System.out.println("ERREUR");

			}
		} else if (j == 31 && (m == 4 || m == 6 || m == 9 || m == 11)){
			System.out.println("ERREUR");
		} else {
			String dateString = j + "/" + m + "/" + a;
			SimpleDateFormat formatDeDate = new SimpleDateFormat("dd/MM/yyyy");
			dateSaisie = formatDeDate.parse(dateString);

		}if (isBissextile(a) == true) {
			System.out.println("Année bissextile");
		}else {
			System.out.println("Année non bissextile");
		}
		return dateSaisie;
		
		
	}

	public static boolean isBissextile(int y) {
		return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
	}

}