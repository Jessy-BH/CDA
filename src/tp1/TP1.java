package tp1;

import java.util.Date;

import java.text.SimpleDateFormat;

import java.util.Scanner;

public class TP1 {

	public static void main(String[] args) {

		// aujourdhui();

		/*
		 * System.out.print("Hello, ");
		 * 
		 * int jour = 22; String mois = "Août"; int annee = 2020;
		 * 
		 * System.out.print("aujourd'hui nous sommes le " + jour + " " + mois + " " +
		 * annee + ".");
		 * 
		 * System.out.println(Exo2("Jessy")); }
		 * 
		 * public static String Exo2(String prenom) { return "Bonjour " + prenom;
		 */

		 Date maDate = new Date();
		 long time = maDate.getTime();
		 System.out.println("Date : " + maDate);
		 System.out.println("Résultat : " + time);
		 afficheDate(maDate);
		
		//etatCivil("Berthault", "Jessy", "19/04/1998", "Montpellier");
		//exoScanner();
	}

	// Saisir nom etc

	public static void exoScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir nom");
		String nom = sc.nextLine();
		System.out.println("Saisir prenom");
		String prenom = sc.nextLine();
		System.out.println("Saisir date de naissance");
		String date = sc.nextLine();
		System.out.println("Saisir ville de naissance");
		String ville = sc.nextLine();
		System.out.println(nom + " " + prenom + " " + "\n" + date + " " + ville);

	}

	public static void afficheDate(Date uneDate) {
		SimpleDateFormat monFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(monFormat.format(uneDate));
	}

	public static void etatCivil(String nom, String prenom, String dateNaissance, String ville) {
		System.out.println(nom + " " + prenom + " " + "\n" + dateNaissance + " " + ville);

	}

	// Donne la date d'aujourd'hui

	public static Date aujourdhui() {
		Date maDate = new Date();
		long time = maDate.getTime();
		System.out.println("aujourd'hui nous sommes le " + maDate);
		System.out.println(time);
		// afficher le type de class (regarder le dernier mot pour le type, Date etc...)
		System.out.println(maDate.getClass());
		return maDate;
	}

}
