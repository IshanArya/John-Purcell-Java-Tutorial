package Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ishan on 6/4/2016.
 */
public class App {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(5, "Hole");


		String text = map.get(5);

		System.out.println(text);

		for(Map.Entry<Integer, String> x : map.entrySet()){
			System.out.println(x.getKey() + ", " + x.getValue());
		}
	}
}
