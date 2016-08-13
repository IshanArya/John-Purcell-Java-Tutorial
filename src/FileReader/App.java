package FileReader;

import java.io.*;

/**
 * Created by ishan on 4/29/2016.
 */
public class App {
	public static void main(String[] args){
		File file = new File("file.txtd");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file: " + file.toString());
		}
		finally {
			try{
				br.close();
			}catch (IOException e){
				System.out.println("Unable to close file: " + file.toString());
			} catch(NullPointerException e) {
				//File was never opened!
			}
		}
	}
}
