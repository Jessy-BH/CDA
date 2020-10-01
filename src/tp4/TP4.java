package tp4;

//import java.util.Scanner;

public class TP4 {

	public static void main(String[] args) {
		
		// For
		/*
		// i += 2 pour faire de 2 en 2
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		*/
		
		// while
		/*
		final int fin = 10; //ceci est une constante, mot clé final
		
		int somme = 0;
		
		int i = 0;
		while (i < fin) {
			
			somme += i;
			
			i++;
		
		}
		
		System.out.println("La somme vaut : " + somme);
		*/
		
		
		// Do/While
		/*
		Scanner sc = new Scanner(System.in);
		
		int valeur;
		
		String chaineLue;
		
		try {
			do {
				// Lecture d'une ligne au clavier
				chaineLue = sc.nextLine();
				
				// Conversion de la chaine en entier
				valeur = Integer.parseInt(chaineLue);
				
			}while ((valeur < 5) || (valeur > 10));
			
		}catch (Exception e) {
			System.out.println("Erreur d'entrée/sortie " + e.getMessage());
		}
		*/
		
		// Saut inconditionnel
		/*
		int x = 1;
		
		float a;
		
		while (x <= 10) {
			
			x++;
			
			System.out.println("x = " + x);
			
			if (x == 7) {
				System.out.println("\t Division par zéro");
				continue; // C'est pour continuer la boucle sinon elle s'arrête à une fois
			}
			a = (float) 1 / (x - 7);
			System.out.println("\t a = " + a);
		}
		*/
		
		//Arrêt inconditionnel 
		/*
		int x = 1;
		double a = 0;
		for (x = 1; x <= 10; x++) {
			a = x - 7;
			
			if (a == 0) {
				System.out.println("Divsion par 0");
				break; // Pour arrêter la boucle 
			}
			System.out.println(1 / a);
			
		}
		*/

		// Switch
		/*
		for (int i = 0; i < 12; i++) {
			switch (i) {
			case 9:
			
				System.out.println("neuf");
			
			break;
			
			case 8: 
			
				System.out.print("Huit");
				System.out.println("");
				break;
				
			case 7:
			{
				System.out.print("Sept");
				System.out.println("");
				
			}
			break;
			
			case 6:
				
				System.out.print("six");
				
			case 5:
				System.out.println("cinq");
				break;
				
			case 4:
			case 3:
				System.out.print("quatre trois");
			case 2:
				System.out.println("deux");
				break;
			case 1: 
				System.out.println("un");
				break;
			default:
				System.out.println("zero");
				break;
			}
		}
			System.out.println("fin");
			*/
	
		
		//Exercice 1
		
		/*
		double i, n, som;
		
		som = 0;
		
		for (i = 0; i < 4; i++) {
			System.out.println("Entrer un chiffe");
			
			n = Clavier.lireDouble();
			
			som += n;					
		}
		System.out.println("Somme = " + som);
		*/
		
		// Ex1 While
		/*
		int i = 0;
		
		int n;
		
		int som = 0;
		
		while (i < 4) {
			System.out.println("Entrer un chiffre");
			
			n = Clavier.lireInt();
			
			// Je veux que le i prenne +1 à chaque boucle
			//i = i + 1;
			i++;
			
			som += n;			
		}
		
		System.out.println("Somme = " + som);
		*/
		
		// Exercice 2
		
		/*
		double n1;
		double n2;
		double n3;
		double n4;
		
		double moy;
		
			System.out.println("Entrer une note");
			n1 = Clavier.lireDouble();
			System.out.println("Entrer une note");
			n2 = Clavier.lireDouble();
			System.out.println("Entrer une note");
			n3 = Clavier.lireDouble();
			System.out.println("Entrer une note");
			n4 = Clavier.lireDouble();	
			
			moy = (n1 + n2 + n3 + n4)/4;
					
		System.out.println("Moyenne = " + moy);
		 
		if (moy > 10) {
			System.out.println("Admis");
		}else if (moy >= 8) {
			System.out.println("Admissible");
		}else if (moy < 8) {
			System.out.println("Refusé");
		}
		if (moy > 20) {
			System.out.println("Moyenne incorrecte");
		}
		*/
		
		double som = 0, i, maMoy, n = 0;
		int x,nbNote;
		System.out.println("Nombre de notes :");
		x = Clavier.lireInt();
		nbNote = x; // on stock à part le nombre de notes
		
		for (i = 0; i < x; i++) {
			System.out.println("Entrer une note");
			n = Clavier.lireDouble();
			if (n < 0 || n > 20) {
				System.out.println("Note(s) incorrecte(s)");
				x++; // faire une boucle en plus
			}else {
				som += n;
			}
		} 
		maMoy = som/nbNote;
			System.out.println("Moyenne : " + maMoy);
		
		if (maMoy > 10) {
			System.out.println("Admis");
		}else if (maMoy >= 8) {
			System.out.println("Admissible");
		}else if (maMoy < 8) {
			System.out.println("Refusé");
		}
		if (maMoy > 20) {
			System.out.println("Moyenne incorrecte");
		}
				
		
	}
}
