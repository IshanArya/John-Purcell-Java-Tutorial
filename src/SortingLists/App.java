package SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ishan on 6/8/2016.
 */

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() > s2.length())
			return 1;
		if(s2.length() > s1.length())
			return -1;
		return 0;
	}
}

class ReverseAlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
}

public class App {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();

		animals.add("cat");
		animals.add("dog");
		animals.add("tiger");
		animals.add("elephant");
		animals.add("dragon");
		animals.add("pegasus");
		animals.add("unicorn");

		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());

		for(String x : animals)
			System.out.println(x);

		List<Integer> numbers = new ArrayList<>();

		numbers.add(3);
		numbers.add(0);
		numbers.add(130);
		numbers.add(13);
		numbers.add(279);

		Collections.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
		});

		for(int x : numbers)
			System.out.println(x);
	}
}
