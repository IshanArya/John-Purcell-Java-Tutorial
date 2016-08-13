package ComplexDataStructures;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by ishan on 6/9/2016.
 */
public class App {
	public static String[] vehicles = {
			"ambulance", "helicopter", "lifeboat"
	};

	public static String[][] drivers = {
			{"Fred", "Sue", "Pete"},
			{"Sue", "Richard", "Bob", "Fred"},
			{"Pete", "Mary", "Bob"}
	};

	public static void main(String[] args) {
		Map<String, Set<String>> personnel = new HashMap<>();

		for(int i = 0; i < vehicles.length; i++){
			String vehicle = vehicles[i];
			String[] driverList = drivers[i];

			Set<String> driverSet = new LinkedHashSet<>(driverList.length);

			for(String driver : driverList){
				driverSet.add(driver);
				//System.out.println(driver);
			}
			personnel.put(vehicle, driverSet);
		}


		//Example usage
		Set<String> driversList = personnel.get("helicopter");
		System.out.println(driversList);


		//Iterate through whole thing
		for(String vehicle : personnel.keySet()){
			System.out.println(vehicle);
			for(String driver : personnel.get(vehicle)){
				System.out.println(driver);
			}
			System.out.println("==========================");
		}
	}


}
