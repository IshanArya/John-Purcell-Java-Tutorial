package SerializingArrays;

import java.io.Serializable;

/**
 * Created by ishan on 5/27/2016.
 */
public class Person implements Serializable {

	private int id;
	private String name;

	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}

	public String toString(){
		return "Person -> name: " + name + "; id: " + id;
	}


}
