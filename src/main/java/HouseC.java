package main.java;

public class HouseC extends Parrot{

	public Rooster rooster;

	@Override
	public boolean sing() {
		System.out.println("A parrot living near a Rooster says : Cock-a-doodle-doo");
		return true;
	}
	
	
}
