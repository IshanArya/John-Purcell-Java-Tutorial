package HandlingExceptions.demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by ishan on 3/28/2016.
 */
public class App {

	public static void main(String[] args) {
		File file = new File("file.txt");

		try {
			FileReader fr = new FileReader(file);

			//Will not run if exception is thrown
			System.out.println("Continuing... ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found: " + file.toString());
		}
		System.out.println("Finished.");
	}
}
