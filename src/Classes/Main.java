package Classes;

/**
 * Created by ishan on 1/17/2016.
 */

class Person{
    String name;
    int age;

    void speak(){
        for(int i = 3; i > 0; i--)
            System.out.println("Hello! My name is " + name + ", and I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args){

        Person person1 = new Person();
        person1.name = "Joe Bloggs";
        person1.age = 37;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;

        System.out.println(person2.name);
    }
}
