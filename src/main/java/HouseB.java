package main.java;

public class HouseB extends Parrot{

	public Cat cats;

	@Override
	public boolean sing() {
		System.out.println("A parrot living with a cat says : Meow");
		return true;
	}
	
	
}
class Cat implements Animal{

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