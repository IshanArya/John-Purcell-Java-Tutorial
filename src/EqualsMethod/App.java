package EqualsMethod;

/**
 * Created by ishan on 5/9/2016.
 */
class Person{
	private int id;
	private String name;

	public Person(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

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
		Person person1 = new Person(5, "Bob");
		Person person2 = new Person(5, "Bob");

		//person2 = person1;

		System.out.println(person1.equals(person2));

		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1.equals(value2));

		Integer number1 = 6;
		Integer number2 = 6;
		System.out.println(number1.equals(number2));
		number2 = 7;
		System.out.println(number1 + "" + number2);

		String str1 = "Hello";
		String str2 = "Hellofdsa".substring(0, 5);
		System.out.println(str1.equals(str2));

		System.out.println(person1.hashCode());
	}
}
