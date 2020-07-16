package main.java;

public class HouseA extends Parrot{

	public Dog dogs;
	
	@Override
	public boolean sing() {
		System.out.println("A parrot living with a dog says : Woof, woof");
		return true;
	}

}

class Dog implements Animal{

	@Override
	public boolean walk() {
		return false;
	}

	@Override
	public boolean fly() {
		return false;
	}

	@Override
	public boolean swim() {
		return false;
	}

	@Override
	public boolean sing() {
		return false;
	}

}