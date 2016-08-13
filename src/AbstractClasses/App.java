package AbstractClasses;

/**
 * Created by ishan on 4/22/2016.
 */
public class App {
	public static void main(String[] args){
		Camera cam1 = new Camera();
		cam1.setId(1);
		cam1.run();

		Car car1 = new Car();
		car1.setId(4);
		car1.run();

		//Machine machine = new Machine();
	}
}
