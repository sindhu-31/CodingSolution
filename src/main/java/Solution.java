package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

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
		
		System.out.println("\n==Question E.1==");
		
		countFeatures();
		
		System.out.println("\n==Bonus question 1==");
		roosterSounds();
		
}

	private static void roosterSounds() {
		Rooster rooster1 = new Rooster();
		HashMap<String,String> newList = rooster1.getRoosterSounds();
		
		
		newList.put("Danish","kykyliky");
		newList.put("Dutch","kukeleku");
		newList.put("Finnish","kukko kiekuu");
		newList.put("French","cocorico");
		newList.put("German","kikeriki");
		newList.put("Greek","kikiriki");
		newList.put("Hebrew","coo-koo-ri-koo");
		newList.put("Hungarian", "kukuriku");
		newList.put("Italian","chicchirichi");
		newList.put("Japanese","ko-ke-kok-ko-o");
		newList.put("Portuguese","cucurucu");
		newList.put("Russian","kukareku");
		newList.put("Swedish","kuckeliku");
		newList.put("Turkish","kuk-kurri-kuuu");
		newList.put("Urdu","kuklooku");
												
		
		for (Entry<String, String> entry : newList.entrySet())
		{
			System.out.println( "Key :" +entry.getKey() + " ; Value :" +entry.getValue());
		}
		
		newList.put("Tamil", "cocoracoooookoo");
		
		
		
		for (Entry<String, String> entry : newList.entrySet())
		{
			System.out.println( "After adding new second lang : Key :" +entry.getKey() + " ; Value :" +entry.getValue());
		}
	}

	private static void countFeatures() {
		List<Animal> animalList = new ArrayList<>();
		
		animalList.add(new Bird());
		animalList.add(new Duck());
		animalList.add(new Chicken());
		animalList.add(new Rooster());
		animalList.add(new Parrot());
		animalList.add(new Fish());
		animalList.add(new Shark());
		animalList.add(new ClownFish());
		animalList.add(new Dolphin());
		animalList.add(new Frog());
		animalList.add(new Dog());
		animalList.add(new Butterfly());
		animalList.add(new Caterpillar());
		animalList.add(new Cat());
		
		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;
		
		for (Animal animal : animalList) {
			
			if (animal.fly()) {
				flyCount++;
			}
			if (animal.walk()) {
				walkCount++;
			}
			
			if (animal.sing()) {
				singCount++;
			}
			if (animal.swim()) {
				swimCount++;
			}
			
		}
		
		System.out.println("Animals that can fly count upto :"+flyCount);
		System.out.println("Animals that can swim count upto :"+swimCount);
		System.out.println("Animals that can walk count upto :"+walkCount);
		System.out.println("Animals that can sing count upto :"+singCount);
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