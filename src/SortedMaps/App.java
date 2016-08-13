package SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by ishan on 6/4/2016.
 */

public class App {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();

		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map){
		map.put(0, "Tiger");
		map.put(4, "Phoenix");
		map.put(2, "Fox");
		map.put(8, "Dragon");
		map.put(15, "Pegasus");
		map.put(11, "Unicorn");
		map.put(9, "Dog");
		map.put(20, "Cat");

		for(Integer key : map.keySet()){
			System.out.println(key + ", " + map.get(key));
		}
	}
}
