package UsingCustomObjectsInSetsAndKeys;

import java.util.*;

/**
 * Created by ishan on 6/6/2016.
 */

class Person{
	private int id;
	private String name;

	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}

	public String toString(){
		return id + ": " + name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;

		Person person = (Person) o;

		if (id != person.id) return false;
		return name != null ? name.equals(person.name) : person.name == null;

	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
}

public class App {

	public static void main(String[] args) {

		Person p1 = new Person(0, "A");
		Person p2 = new Person(1, "B");
		Person p3 = new Person(2, "C");
		Person p4 = new Person(1, "B");

		Map<Person, Integer> map = new LinkedHashMap<>();

		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 2);

		for(Person x : map.keySet())
			System.out.println(x + " -> " + map.get(x));


		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		System.out.println(set);



	}
}
