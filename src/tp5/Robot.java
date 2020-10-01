package tp5;

public class Robot {

	private String status;
	private int speed;
	private float temperature;
	
	public Robot(String status, int speed, float temperature) {
		
		this.status = status;
		this.speed = speed;
		this.temperature = temperature;
		
	}
	
	public void checkTemperature() {
		if (temperature > 660) {
			status = "retour au bercail";
			speed = 5;
		}		
		
	}
	
	public void showAttributes() {
		System.out.println("Statut : " + status);
		System.out.println("Vitesse : " + speed);
		System.out.println("Température : " + temperature);
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
}
