package main.java;

public class HouseD extends Parrot{

	public Phone phone;

	@Override
	public boolean sing() {
		System.out.println("A parrot living near a phone says : Tring, tring");
		return true;
	}
	
	
}
class Phone {

}