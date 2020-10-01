package tp5;

public class MainScriptRobot {
	
	public static void main(String[] arguments) {
		Robot t1000 = new Robot("Explorant", 2, 510);
		t1000.showAttributes();
		
		System.out.println("Augmentation vitesse ... 3.");
		t1000.setSpeed(3);
		t1000.showAttributes();
		
		System.out.println("Changement de température ... 670.");
		t1000.setTemperature(670);
		t1000.showAttributes();
		
		System.out.println("Vérification de la température");
		t1000.checkTemperature();
		t1000.showAttributes();
	}
}
