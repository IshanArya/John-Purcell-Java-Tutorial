package SerializingArrays;

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

		Person[] people = {new Person(1, "Fred"), new Person(99, "Mike"), new Person(7, "Bob")};

		ArrayList<Person> peopleList = new ArrayList<>(Arrays.asList(people));

		try (FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {


			os.writeObject(people);

			os.writeObject(peopleList);

			os.writeInt(peopleList.size());

			for(Person x : peopleList){
				os.writeObject(x);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
