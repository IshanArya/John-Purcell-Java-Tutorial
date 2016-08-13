package TransientAndMoreSerialization;

import java.io.Serializable;

/**
 * Created by ishan on 5/27/2016.
 */
public class Person implements Serializable {


	private transient int id;
	private String name;

	private static int count;

	public Person(){
		System.out.println("Default constructor");
	}

	public Person(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("Two-argument constructor");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public String toString(){
		return "Person -> name: " + name + "; id: " + id + "; count: " + count;
	}


}
