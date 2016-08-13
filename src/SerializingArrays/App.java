package SerializingArrays;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.io.*;

/**
 * Created by ishan on 5/27/2016.
 */
public class App {
	public static void main(String[] args) {
		writeObjects();
		readObjects();
	}

	public static void writeObjects(){
		Person abe = new Person(0, "Abe Lincoln");
		Person george = new Person(1, "George Washington");
		Person frank = new Person(2, "Franklin Delano Roosevelt");
		Person[] people = {abe, george, frank};

		try(FileOutputStream fo = new FileOutputStream("prez.bin"); ObjectOutputStream os = new ObjectOutputStream(fo)){
			os.writeObject(abe);
			os.writeObject(george);
			os.writeObject(frank);
			os.writeObject(people);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readObjects(){
		Person a;
		Person b;
		Person c;
		Person[] people;

		try(FileInputStream fi = new FileInputStream("prez.bin"); ObjectInputStream os = new ObjectInputStream(fi)){
			a = (Person)os.readObject();
			b = (Person)os.readObject();
			c = (Person)os.readObject();
			people = (Person[])os.readObject();


			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println();
			for(Person x : people)
				System.out.println(x);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}


	}
}
