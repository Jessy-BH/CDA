package tamagotchi;

public class MainScript {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		Cat myCat = new Cat("Java", "Grise", 11);
		myCat.show();
		
		Cat yourCat = new Cat("Jean-Luc", "Rouge", 19);
		yourCat.show();
		
		Cat otherCat = new Cat("Blanc");
		otherCat.show();
		otherCat.setName("Ez");
		otherCat.show();
		
		System.out.println("Chat 1 : " + myCat.getName() + " " + myCat.getColor() + " " + myCat.getAge());
		System.out.println("Chat 2 : " + yourCat.getName() + " " + yourCat.getColor() + " " + yourCat.getAge());
		System.out.println("Chat 3 : " + otherCat.getName() + " " + otherCat.getColor() + " " + otherCat.getAge());
		
		
		
		
		
		
		/*yourCat.setColor("Rouge"); 
		yourCat.setAge(19);
		yourCat.show();*/
		
	}
}
