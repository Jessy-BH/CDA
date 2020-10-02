package DevoirAlgo;

import java.io.IOException;
import java.io.InputStreamReader;

public class FPC {
	
	public static void main(String[] args) {

		int scoreJoueur = 0;
		int scorePnj = 0;
		
		String objet[] = { "La pierre", "Les ciseaux", "La feuille" };
		String message[] = { objet[0] + " casse " + objet[1], objet[2] + " recouvre " + objet[0],
				objet[1] + " coupent " + objet[2] };
		int resultat[] = { 0, 2, 1 };
		// afficher sélection 
		for (int i = 0; i < 3; i++) {
			System.out.println(i + ". " + objet[i]);
		}
		// choix joueur
		int j1 = -1;
		do {
			try {
				j1 = (new InputStreamReader(System.in)).read() - 48; 
			} catch (IOException ioe) {
				ioe.printStackTrace();
				System.exit(0);
			}
		} while (j1 < 0 || j1 > 2);
		int j2 = (int) (Math.random() * 3); // choix PNJ
		System.out.println("Le PNJ a choisi " + objet[j2]);
		if (j1 == j2) {
			System.out.println("On a choisi pareil ! ");
			System.exit(0);
		}
		int i = j1 + j2 - 1;
		System.out.println(message[i]);
		if (j1 == resultat[i]) {
			System.out.println("Je gagne");
			scoreJoueur++;
			
		} else {
			System.out.println("PNJ gagne");
			scorePnj++;
		}
		System.out.println("Votre score : " + scoreJoueur + "Score PNJ  : " + scorePnj);
		while (scoreJoueur != 3 || scorePnj != 3) {
			i++;
		}
	}
}
