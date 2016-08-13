package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by ishan on 5/27/2016.
 */
public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing objects...");

		Person mike = new Person(543, "Mike");
		Person fred = new Person(345, "Fred");

		System.out.println(mike);
		System.out.println(fred);

		try (FileOutputStream fs = new FileOutputStream("people.bin")) {
			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(mike);
			os.writeObject(fred);

			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
