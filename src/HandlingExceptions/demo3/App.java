package HandlingExceptions.demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by ishan on 3/28/2016.
 */
public class App {
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			//This is too vague
			System.out.println("Could not open file.");
		}
		System.out.println("Finished.");
	}

	public static String openFile() throws FileNotFoundException {
		File file = new File("test.txt");

		FileReader fr = new FileReader(file);
		return "I like pie";
	}
}
