package RuntimeVSCheckedExceptions;

/**
 * Created by ishan on 4/21/2016.
 */
public class App {
	public static void main(String[] args) {
		String[] texts = {"one", "two", "three"};

		try{
			System.out.println(texts[3]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
	}
}
