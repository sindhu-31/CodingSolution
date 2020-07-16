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
		System.out.println("Cock-a-doodle-doo");
		return true;
	}
	
	
	
	
}


