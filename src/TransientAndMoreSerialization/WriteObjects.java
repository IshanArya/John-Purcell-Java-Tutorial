package TransientAndMoreSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ishan on 5/27/2016.
 */
public class WriteObjects {
	public static void main(String[] args) {
		System.out.println("Writing objects...");

		Person person = new Person(7, "Bob");
		Person.setCount(88);

		try ( ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))) {


			os.writeObject(person);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
