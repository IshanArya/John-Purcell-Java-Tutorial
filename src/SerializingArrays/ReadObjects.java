package SerializingArrays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by ishan on 5/27/2016.
 */
public class ReadObjects {
	public static void main(String[] args) {
		System.out.println("Reading objects...");

		try(FileInputStream fi = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fi)){

			Person[] people = (Person[])os.readObject();
			@SuppressWarnings("unchecked")
			ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();

			for(Person x : people)
				System.out.println(x);
			for(Person x : peopleList)
				System.out.println(x);

			int num = os.readInt();
			for(int i = 0; i < num; i++){
				System.out.println((Person)os.readObject());
			}


			os.close();

		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
