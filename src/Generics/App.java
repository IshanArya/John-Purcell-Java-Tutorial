package Generics;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by ishan on 3/25/2016.
 */

class Animal{

}
public class App {
    public static void main(String[] args) {
        ////////////////OLD METHOD/////////////////
        ArrayList list = new ArrayList();

        list.add("orange");
        list.add("grapes");
        list.add("apple");

        System.out.println((String)list.get(2));

        ////////////////NEW METHOD/////////////////
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        System.out.println(strings.get(2));

        ////////////There can be more than one type argument/////////////
        HashMap<Integer, String> map = new HashMap<>();

        //////////////Java 7//////////////////
        ArrayList<Animal> someList = new ArrayList<>();
    }
}
