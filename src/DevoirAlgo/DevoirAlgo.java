package DevoirAlgo;

import java.util.Scanner;

public class DevoirAlgo {

	public static void main(String[] args) {
		
		int scoreJoueur = 0;
		int scorePnj = 0;
		
		while (scoreJoueur != 3 || scorePnj != 3) {
			
			choixJoueur();
				
			System.out.println("Player Score :" + scoreJoueur + "NPC score : " + scorePnj);			
		}
	}

	public static int choixJoueur() {
		
		Scanner imput = new Scanner(System.in);
		
		int choix;
		
		do {
			
			System.out.println("1 pour Pierre");
			System.out.println("2 pour Feuille");
			System.out.println("3 pour Ciseaux");
			System.out.println("Choisir");
			choix = imput.nextInt();
		
		} while (choix > 3 || choix < 1); 
			
			return choix;
			
	}

	public static String selectionJoueur (int selection) {
		
		String objet = "";
		
		switch (selection) {
		
		case 1:
			objet = "Pierre";
			
		case 2:
			objet = "Feuille";
			
		case 3:
			objet = "Ciseaux";
			break;
			default:
		}
		return objet;
	}
	
	/*
	public static int tour (int choixJoueur, int choixPnj) {
		
		int resultat;
		
		System.out.println("Vous avez choisi " + selectionJoueur);
	}*/
}
