package ReadingFilesWithScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ishan on 3/26/2016.
 */
public class App {

	public static void main(String[] args) throws FileNotFoundException{
		//String fileName = "C:\\Users/ishan\\Desktop/file.txt";
		String fileName = "file.txt";

		File textFile = new File(fileName);

		Scanner sc = new Scanner(textFile);

		int value = sc.nextInt();
		System.out.println("Read value: " + value);

		sc.nextLine();
		int count = 2;
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(count + ": " + line);
			count++;
		}

		sc.close();
	}
}
