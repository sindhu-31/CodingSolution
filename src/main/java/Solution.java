package main.java;

public class Solution {

	public static void main(String[] args) {
		 
		Bird bird = new Bird();
		 
		bird.walk();
		 
		bird.fly();
		 
		System.out.println("==Question A.1==");
		// bird.sing(); //Sing method cannot be implemented here since the Bird class or
				// the base class Animal have this method.
				// It will throw a compilation error when we try to call a method that never
				// existed.
		
		// In order to not throw an error --> include a sing method in the super interface Animal;
		 
		bird.sing();
		
		System.out.println("==Question A.2==");

		Bird duck = new Duck();
		duck.sing();
		duck.swim();

		Bird chicken = new Chicken();
		chicken.sing();
		chicken.fly();
}
	
}