package CreatingAndWritingFiles;

import java.io.*;

/**
 * Created by ishan on 5/7/2016.
 */
public class App {
	public static void main(String[] args) {
		File file = new File("file.txt");
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write("This is line one");
			bw.newLine();
			bw.write("This is line two");
			bw.newLine();
			bw.write("Last line");
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
	}
}
