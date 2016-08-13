package AbstractClasses;

/**
 * Created by ishan on 4/22/2016.
 */
public class Camera extends Machine {
	@Override
	public void start() {
		System.out.println("Starting camera...");
	}

	@Override
	public void doStuff() {
		System.out.println("Doing stuff...");
	}
}
