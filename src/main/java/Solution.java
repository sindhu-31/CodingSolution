package main.java;

public class Solution {

	public static void main(String[] args) {
		 
		Bird bird = new Bird();
		 
		bird.walk();
		 
		bird.fly();
		 
		System.out.println("\n==Question A.1==");
		// bird.sing(); //Sing method cannot be implemented here since the Bird class or
				// the base class Animal have this method.
				// It will throw a compilation error when we try to call a method that never
				// existed.
		
		// In order to not throw an error --> include a sing method in the super interface Animal;
		 
		bird.sing();
		
		System.out.println("\n==Question A.2==");

		Bird duck = new Duck();
		duck.sing();
		duck.swim();

		Bird chicken = new Chicken();
		chicken.sing();
		chicken.fly();
		
		System.out.println("\n==Question A.3==");

		Chicken rooster = new Rooster();
		rooster.sing();

		System.out.println("\n==Question A.4==");

		parrotMethods();

		System.out.println("\n==Question B.1 , B.2 , B.3==");

		fishMethods();
		
		System.out.println("\n==Question D.1, D.2==");

		butterFlyFeatures();
		
}

	private static void butterFlyFeatures() {
		Butterfly butterfly = new Butterfly();
		
		butterfly.fly();
		butterfly.setFeature("A butterfly does not make a sound");
		
		System.out.println(butterfly.getFeature());
		Caterpillar caterpillar = new Caterpillar();
		
		caterpillar.fly();
		caterpillar.walk();
	}

	private static void parrotMethods() {
		Parrot parrotWithDogs = new HouseA();
		parrotWithDogs.sing();

		Parrot parrotWithCats = new HouseB();
		parrotWithCats.sing();

		Parrot parrotInaFarm = new HouseC();
		parrotInaFarm.sing();

		Parrot parrotWithPhone = new HouseD();
		parrotWithPhone.sing();

		Parrot parrotWithDuck = new HouseE();
		parrotWithDuck.sing();
	}

	private static void fishMethods() {
		boolean canSwim = false;
		boolean canSing = false;
		boolean canWalk = false;

		Fish fish = new Fish();
		canSwim = fish.swim();
		canSing = fish.sing();
		canWalk = fish.walk();
		System.out.println("\nCan fish swim ? :" + canSwim);
		System.out.println("Can fish sing ? :" + canSing);
		System.out.println("Can fish walk ? :" + canWalk);
	
		
		
		Shark shark = new Shark();

		shark.setLarge(true);
		shark.setColor("Grey");
		shark.setFeature("Sharks eat other fish");
		canSwim = shark.swim();
		canSing = shark.sing();
		canWalk = shark.walk();
		System.out.println("\nCan sharks swim ? :" + canSwim);
		System.out.println("Can sharks sing ? :" + canSing);
		System.out.println("Can sharks walk ? :" + canWalk);
		System.out.println("Shark :" + shark.toString());

		ClownFish clownFish = new ClownFish();

		clownFish.setLarge(false);
		clownFish.setColor("Colourful");
		clownFish.setFeature("ClownFish make jokes");

		canSwim = clownFish.swim();
		canSing = clownFish.sing();
		canWalk = clownFish.walk();
		System.out.println("\nCan clownFish swim ? :" + canSwim);
		System.out.println("Can clownFish sing ? :" + canSing);
		System.out.println("Can clownFish walk ? :" + canWalk);
		System.out.println("clownFish :" + clownFish.toString() + "\n");

		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		
		
		
	}
	
}