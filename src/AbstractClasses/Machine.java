package AbstractClasses;

/**
 * Created by ishan on 4/22/2016.
 */
public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void start();
	public abstract void doStuff();
	public void shutdown(){
		System.out.println("Shutting down...");
	}

	public void run(){
		start();
		doStuff();
		shutdown();
	}

}
