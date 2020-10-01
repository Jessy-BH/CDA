package DevoirAlgo;

import java.io.IOException;
import java.io.InputStreamReader;

public class FPC {
	
	public static void main(String[] args) {

		String arme[] = { "la pierre", "les ciseaux", "la feuille" };
		String message[] = { arme[0] + " casse " + arme[1], arme[2] + " recouvre " + arme[0],
				arme[1] + " coupent " + arme[2] };
		int resultat[] = { 0, 2, 1 };
		// affichage menu
		for (int i = 0; i < 3; i++) {
			System.out.println(i + ". " + arme[i]);
		}
		// choix du joueur 1 : l'humain
		int j1 = -1;
		do {
			try {
				j1 = (new InputStreamReader(System.in)).read() - 48; // ascii
			} catch (IOException ioe) {
				ioe.printStackTrace();
				System.exit(0);
			}
		} while (j1 < 0 || j1 > 2);
		int j2 = (int) (Math.random() * 3); // choix du joueur 2 : la machine
		System.out.println("J'ai choisi " + arme[j2]);
		if (j1 == j2) {
			System.out.println("On a choisi pareil ! ");
			System.exit(0);
		}
		int i = j1 + j2 - 1;
		System.out.println(message[i]);
		if (j1 == resultat[i]) {
			System.out.println("Tu gagnes");
		} else {
			System.out.println("Je gagne");
		}
	}
}
