package tp5;


public class Ex2_Robot {
	String status;
	int speed;
	float temperature;
	
	void checkTemperature() {
		if (temperature > 660) {
			status = "retour au bercail";
			speed = 5;
		}
	}
	
	void showAttributes() {
		System.out.println("Statut : " + status);
		System.out.println("Vitesse : " + speed);
		System.out.println("Température : " + temperature);
	}
	
	public static void main(String[] arguments) {
		Ex2_Robot t1000 = new Ex2_Robot();
		t1000.status = "explorant";
		t1000.speed = 2;
		t1000.temperature = 510;
		t1000.showAttributes();
		
		System.out.println("Augmentation vitesse ... 3.");
		t1000.speed = 3;
		t1000.showAttributes();
		
		System.out.println("Changement de température ... 670.");
		t1000.temperature = 670;
		t1000.showAttributes();
		
		System.out.println("Vérification de la température");
		t1000.checkTemperature();
		t1000.showAttributes();

	}
}