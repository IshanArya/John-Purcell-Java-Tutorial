package AbstractClasses;

/**
 * Created by ishan on 4/22/2016.
 */
public class Car extends Machine {
	@Override
	public void start() {
		System.out.println("Starting car...");
	}

	public void doStuff(){
		System.out.println("Doing stuff...");
	}

	public void shutdown(){
		System.out.println("I like pie");
	}
}
