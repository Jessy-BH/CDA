package tp2;

public class TP2 {
	public static void main(String[] args) {

		// Comment ajouter un entier à un décimal
		// Par exemple : 1 + 2,5
		/*
		 * int entier = 1; double d = 2.5; double resultat = entier + d;
		 * 
		 * System.out.println("Mon résultat : " + resultat);
		 */

		
		// Truc chelou avec Integer
		// int a = 6;
		// Integer b = new Integer(0);
		// b = a -> 6
		// System.out.println(b = a);
		// a = b -> 0
		// System.out.println(a = b);

		
		/* a++ ++a 
		
		int a = 10;

		//Le ++a est incrémenté dans le calcul
		System.out.println("a = " + a + ";\t (++a*2) = " + (++a * 2) + ";\t a = " + a + ";");

		a = 10;
		// Le a++ n'est pas incrémenté dans le calcul mais le sera par la suite 
		System.out.println("a = " + a + ";\t (a++*2) = " + (a++ * 2) + ";\t a = " + a + ";");
		*/
		
		// Exo booléen
		
		boolean egal=(3==4);
		
		System.out.println(egal);
		
		
		int a = 3 , b = 4;
		
		boolean diff=((a < b) || (a > b));
		
		System.out.println(diff);
		
		
		boolean bool1 = (3 == 4);
		
		System.out.println(bool1);
		
		
		boolean bool2 = (3.0 == 4.0);
		
		System.out.println(bool2);
		
		
		/* Les affectations et les opérateurs associés
		
		int a;
		
		System.out.println("Premier = " + (a = 10)*2 + ";\t" + "Second = " + a + ";");
		*/
		
		
		// TP 25
		/*
		int n;
		double x;
		double y;
		n = 5;
		x = 2*n + 1.5;
		y = n*x +12;
		
		System.out.println("n = " + n);
		System.out.println("x = " + x);		
		System.out.println("y = " + y);
		*/
		
		// TP 26
		/*
		char code='Z';
		int index = code - 'A';
		System.out.println("index = " + index);
		*/
		
		// TP 27
		/*
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("n1 = " + n1 +"\t n2 = " + n2);
		
		n1 = n2++;
		
		System.out.println("n1 = " + n1 +"\t n2 = " + n2);
		
		n1 = ++n2;
		
		System.out.println("n1 = " + n1 +"\t n2 = " + n2);
		
		n1 = n1++; 
		
		System.out.println("n1 = " + n1 +"\t n2 = " + n2);
		*/
		
		// TP 28
		/*
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		*/
		
		// TP 29
		/*
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		
		System.out.println(n1.equals(n2));
	*/
				
	}
}

