package tp3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TP3 {
	public static void main(String[] args) {

		
		
		
		
		/*
		 * 
		 * int i; // on initialise i comme un entier
		 * 
		 * System.out.println("Saisissez un nombre");
		 * 
		 * i = Clavier.lireInt(); // on utilise la méthode lireInt
		 * 
		 * if (i != 1) // si i est différent de 1 alors
		 * 
		 * { System.out.println("Vous avez saisi : " + i); System.exit(-1); }
		 * 
		 * else // sinon { System.out.println("bravo"); }
		 * 
		 */

		/*
		 * 
		 * int i; System.out.println("Saisissez un nombre"); i = Clavier.lireInt();
		 * System.out.println(i != 1 ? "Vous avez saisi : " + i : "bravo"); // si i =/=
		 * 1 alors ça met "vous avez saisi", si i = 1 ça met bravo
		 * 
		 */

		// Exercice 1 

		/*
		double i;

		System.out.println("Sasissez la note");

		i = Clavier.lireDouble();

		if (i >= 10) {
		
			System.out.println("Vous êtes admis");

			if (i >= 16) {

				System.out.println("Votre mention est très bien");
				
			} else if (i >= 14) {

				System.out.println("Votre mention est bien");
				
			} else if (i >= 12) {
			
				System.out.println("Votre mention est assez bien");
				
			}

		} else if (i >= 8) {
		
			System.out.println("Rattrapage");
			
		} else if (i < 8) {
			
			System.out.println("Refusé");
			
		}
		*/
		
		
		
		
		
		
		//Exercice 2
		
		// Algo avec if else if
		/*
		double a;
		double b;
				
		a = Clavier.lireDouble();
		b = Clavier.lireDouble();
		
		if (a < b) {
			System.out.println("Le plus grand est : " + b);
		}
		else if (a > b) {
			System.out.println("Le plus grand est : " + a);
		}
		*/
		
		// Algo avec if uniquement
		/*
		double a;
		double b;
		double x;
		
		a = Clavier.lireDouble();
		b = Clavier.lireDouble();
		
		x = a;
		
		if (a < b) {
			x = b;
		}
		System.out.println("Le plus grand est : " + x);
		*/
		
		// Exercice 3 
		
		
		//Date maDate = new Date();		 
		// aujourdhui(maDate);
		 
		//Date monHeure = new Date();
		//maintenant(monHeure);
	
	
		// Saisir jour mois année un par un
		/*
		 int j;
		 int m;
		 int a;
		 
		 System.out.println("Saisissez un jour");
			j = Clavier.lireInt();
		
		System.out.println("Saisissez un mois");
			m = Clavier.lireInt();
			
		System.out.println("Saisissez une année");
			a = Clavier.lireInt();
			
		System.out.println(j + " " + m + " " + a);
		*/
	
		// Algo vérifier les dates
		
		
		saisirDate(29, 02, 2000);
			
	}

	public static void aujourdhui(Date uneDate) {
		SimpleDateFormat monFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(monFormat.format(uneDate));
		}

	public static void maintenant(Date uneHeure) {
		SimpleDateFormat monFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(monFormat.format(uneHeure));
	}
	
	public static boolean saisirDate(int jour, int mois, int annee) {
		
		System.out.println("Vous êtes né le : " + jour + "/" + mois + "/" + annee);
		
		if (mois == 1 | mois == 3 | mois == 5 | mois == 7 | mois == 8 | mois == 10 | mois == 12 && jour >= 1 && jour <= 31) {
			
			System.out.println("Date ok");
			
		}else if (mois == 4 | mois == 6 | mois == 9 | mois == 11 && jour >= 1 && jour <= 30){
			
			System.out.println("Date ok");
			
		}
		if (mois == 2 && jour >= 1 && jour <= 28) {
			
			System.out.println("Date ok");
		
		}if (mois == 2 && jour >= 1 && jour > 29) {
			
			System.out.println("Date incorrecte, il n'y a pas plus de 29 jours en février");
			
		}else if (mois == 4 | mois == 6 | mois == 9 | mois == 11 && jour >= 1 && jour > 30){
			
			System.out.println("Date incorrecte, le mois renseigné ne comporte pas plus de 30 jours");
		
		}else if (mois == 1 | mois == 3 | mois == 5 | mois == 7 | mois == 8 | mois == 10 | mois == 12 && jour >= 1 && jour > 31) {
			
			System.out.println("Date incorrecte, le mois renseigné ne comporte pas plus de 31 jours");
		}
			
		boolean leap = false;
		
			if (annee % 400 == 0 || (annee % 100 != 0 && annee % 4 == 0)) {
			
					leap = true;
						
					System.out.println("Année bissextile");
					
					
				}
		
			else {
					System.out.println("Année non bissextile");
		}
		return leap;
		
	}
}
