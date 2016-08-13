package GettingUserInput;

import java.util.Scanner;

/**
 * Created by ishan on 3/26/2016.
 */
public class App {
	public static void main(String[] args) {
		//Create scanner object
		Scanner sc = new Scanner(System.in);

		//Output the prompt
		System.out.println("Enter a floating point value: ");
		//Wait for the user to enter a line of text
		double value = sc.nextDouble();

		//Tell them what they entered
		System.out.println("You entered: " + value);
	}
}
