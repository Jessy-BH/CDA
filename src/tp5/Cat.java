package tp5;

public class Cat {
	
	private String name = null;
	private String color = null;
	private int age = 0;
	
	
	//Seul cas où ça commence par une majuscule 
	public Cat(String name, String color, int age) {
		
		this.name = name;
		this.color = color;
		this.age = age;
		
	}
	
	public Cat(String color) {
		this.color = color;
		this.name = "Chat " + this.color;
	}
	
	
	
	
	
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	// Fournir le nom qui est en private
	public String getName() {
		
		return this.name;
	}
	
	public String getColor() {
		
		return this.color;
				
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public void show() {
		
		System.out.println("Chat nommé " + this.name + " de couleur " + this.color + " a " + this.age + " ans.");
	}

}
