package Polymorphism;

class Animal{
	public void sound() {
		System.out.println("dog");
	}
}

class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("woof woof");
	}
}
public class Polymorphism {
 public static void maini(String[] args) {
	 Animal object=new Dog();
	 object.sound();
 }
}
