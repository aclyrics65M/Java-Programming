package chapter1;

abstract class Animal {
	
	private String name;
	
	protected int age;
	
	public Animal(String name) {
		this.name = name;
		this.age = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void age();
	
	public int getAge() {
		return age;
	}
	
	public String describe() {
		return "An animal";
	}
	
	public String speak() {
		return "moo";
	}
}


class Dragon extends Animal {
	private String color;
	
	public Dragon(String name, String color) {
		super(name);
		this.color = color;
	}
	
	public void age() {
		System.out.println("A dragon never ages");
	}
	
	public String getColor() {
		return color;
	}
	
	public String describe() {
		return "A " + color + " dragon";
	}
	
	public String speak() {
		return "Die human!";
	}
}

class Fox extends Animal {
	public Fox(String name) {
		super(name);
	}
	public void age() {
		System.out.println("A human year is ~6 fox years");
		age += 6;
	}
	public String speak() {
		return "Gering-ding-ding-ding-dingeringeding!";
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		
		Dragon d1 = new Dragon("Puff", "green");
		System.out.println("Name: " + d1.getName());
		System.out.println("Speak: " + d1.speak());
		System.out.println("Describe: " + d1.describe());
		d1.age();
		System.out.println("Age: " + d1.getAge());
		System.out.println();
		
		Fox f1 = new Fox("Tails");
		System.out.println("Name: " + f1.getName());
		System.out.println("Speak: " + f1.speak());
		System.out.println("Describe: " + f1.describe());
		f1.age();
		System.out.println("Age: " + f1.getAge());
		System.out.println();
		
		Animal a1 = new Fox("Ninetales");
		System.out.println("Speak: " + a1.speak());
		System.out.println("Describe: " + a1.describe());
		
		
	}

}
