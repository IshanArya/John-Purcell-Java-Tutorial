package EnumTypes;

/**
 * Created by ishan on 5/26/2016.
 */
public enum Animal {
	CAT("Sym"), DOG("Seno"), FISH("Alpha");

	private String name;

	Animal(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "This animal is called " + name;
	}
}
