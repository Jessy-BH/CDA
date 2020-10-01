package DevoirAlgo;

import java.util.Random;
import java.util.Scanner;

public class DevoirAlgo {

	public static void main(String[] args) {
		Random random = new Random();
		int scoreJoueur = 0;
		int scorePnj = 0;
		choixJoueur();
				
		while (scoreJoueur != 3 && scorePnj != 3) {
			switch (tour(choixJoueur(), random.nextInt(3)+1)){
			case 1 : 
				scoreJoueur++;
				break;
			case 2 :
				scorePnj++;
				break;
			}
			System.out.println("Votre score : " + scoreJoueur + " " + "Score PNJ : " + scorePnj);
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
	
	
	public static int tour (int choixJoueur, int choixPnj) {
		
		int resultat;
		
		System.out.println("Vous avez choisi " + selectionJoueur(choixJoueur) + " le choix du PNJ est : " + selectionJoueur(choixPnj));
		
		if (choixJoueur ==1 && choixPnj == 3 || choixJoueur == 2 && choixPnj == 1 || choixJoueur == 3 && choixPnj == 2) {
			System.out.println("Vous avez gagné !");
			resultat = 1;	
		}else if (choixJoueur == choixPnj) {
			System.out.println("Égalité, il n'y a pas de vainqueur.");
			resultat = 0;
		}else {
			System.out.println("Vous avez perdu.");
			resultat = 2;
		}
		return resultat;
	}
}
