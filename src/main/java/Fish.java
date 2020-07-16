package main.java;

public class Fish implements Animal {

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
		
		return true;
	}

	@Override
	public boolean sing() {
		
		return false;
	}

}
