package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ishan on 6/5/2016.
 */
public class App {
	public static void main(String[] args) {
		//HashSet does not retain order
		//Set<String> set1 = new HashSet<>();

		//LinkedHashSet remembers the order you put it in
		//Set<String> set1 = new LinkedHashSet<>();

		//TreeSet remembers in natural order
		Set<String> set1 = new TreeSet<>();

		if(set1.isEmpty())
			System.out.println("Set is empty");

		set1.add("dog");
		set1.add("cat");
		set1.add("tigah");
		set1.add("snake");
		set1.add("bear");
		//Adding duplicate items does nothing
		set1.add("tigah");

		if(set1.isEmpty())
			System.out.println("Set is empty");

		System.out.println(set1);
		////////////////Iteration//////////////////
		for(String x : set1){
			System.out.println(x);
		}

		////////////////Does Set contain a given item/////////////////
		if(set1.contains("aardvark")){
			System.out.println("Contains \"aardvark\"");
		}
		else if(set1.contains("cat")){
			System.out.println("Contains \"cat\"");
		}

		System.out.println("=========================================================================================");
		//set2 contains some elements from set1 and some new elements
		Set<String> set2 = new TreeSet<>();

		set2.add("dog");
		set2.add("cat");
		set2.add("unicorn");
		set2.add("pegasus");
		set2.add("dragon");

		////////////////Intersection//////////////////
		Set<String> intr = new HashSet<>(set1);
		System.out.println(intr);
		intr.retainAll(set2);
		System.out.println(intr);

		////////////////Difference//////////////////
		Set<String> diff = new HashSet<>(set1);
		diff.removeAll(set1);
		System.out.println(diff);
	}
}
