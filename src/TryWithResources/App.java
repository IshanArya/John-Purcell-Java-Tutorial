package TryWithResources;

import java.io.File;

/**
 * Created by ishan on 5/7/2016.
 */

class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Closing!");
		//throw new Exception("Oh no!");
	}
	public void hello() throws Exception {
		System.out.println("Hello!");
	}
}
public class App {
	public static void main(String[] args) {
		try(Temp temp = new Temp()){
			temp.hello();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
