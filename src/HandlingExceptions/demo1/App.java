package HandlingExceptions.demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by ishan on 3/28/2016.
 */
public class App {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("test.txt");

		FileReader fr = new FileReader(file);
	}
}
