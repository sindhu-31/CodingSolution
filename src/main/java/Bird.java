package main.java;

import java.util.HashMap;

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


class Duck extends Bird {

	@Override
	public boolean sing() {
		System.out.println("Ducks say :: Quack, quack");
		return true;
	}

	@Override
	public boolean swim() {
		System.out.println("Ducks can swim :)");
		return true;
	}
}

class Chicken extends Bird {
	@Override
	public boolean sing() {
		System.out.println("Chickens say :: Cluck, cluck");
		return true;
	}

	@Override
	public boolean fly() {
		System.out.println("Chickens cannot fly");
		return false;
	}
}



class Rooster extends Chicken {
	@Override
	public boolean sing() {
		System.out.println("Roosters say :: Cock-a-doodle-doo");
		return true;
	}
	
	
	HashMap<String,String> roosterSounds = new HashMap<String,String>();


	public HashMap<String, String> getRoosterSounds() {
		return roosterSounds;
	}


	public void setRoosterSounds(HashMap<String, String> roosterSounds) {
		this.roosterSounds = roosterSounds;
	}
	
}

class Butterfly extends Bird {

	public String feature;

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	public Butterfly() {
		
	}
	
	public boolean fly() {
		System.out.println("Butterfly can fly");
		return true;
	}
	
}


class Caterpillar extends Butterfly {

	public String feature;

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
	
	public boolean fly() {
		System.out.println("Catterpillar cannot fly");
		return false;
	}
	public boolean walk() {
		System.out.println("Catterpillars can walk");
		return true;
	}
}



