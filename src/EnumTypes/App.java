package EnumTypes;

/**
 * Created by ishan on 5/26/2016.
 */
public class App {

	public static void main(String[] args) {
		Animal animal = Animal.DOG;

		switch (animal){
			case CAT:
				System.out.println("cat");
				break;
			case DOG:
				System.out.println("dog");
				break;
			case FISH:
				break;
		}

		System.out.println(Animal.DOG);
		System.out.println("Enum name as a string: " + Animal.DOG.name());

		System.out.println(Animal.DOG.getClass());

		System.out.println(Animal.DOG instanceof Object);

		System.out.println(Animal.FISH.getName());

		Animal animal2 = Animal.valueOf("CAT");
		System.out.println(animal2);
	}
}
