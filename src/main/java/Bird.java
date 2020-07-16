package main.java;


public class Bird implements Animal{

	@Override
	public boolean walk() {
		return false;
	}

	@Override
	public boolean fly() {
		return true;
	}

	@Override
	public boolean swim() {
		return false;
	}

	@Override
	public boolean sing() {
		return true;
	}

}



