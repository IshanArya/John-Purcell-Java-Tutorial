package EnumTypes;

/**
 * Created by ishan on 5/27/2016.
 */
public enum Options {

	LIVINGSTON, TJ, EHS, BEACH;

	private static int counter = 0;
	int id;

	Options(){
		idPlus();
	}

	private void idPlus(){
		id = counter;
		counter++;
	}
}
