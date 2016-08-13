package EnumTypes;

/**
 * Created by ishan on 5/27/2016.
 */

import java.util.Scanner;

public class WhereToPlayToday {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Choose where you want to play volleyball today: ");
		Options choice = Options.valueOf(sc.nextLine().toUpperCase());

		switch(choice){
			case LIVINGSTON:
				System.out.println("@ Rutgers");
				break;
			case TJ:
				System.out.println("Are all the noobs here or are there real players?");
				break;
			case EHS:
				System.out.println("OPEN GYM!!!");
				break;
			case BEACH:
				System.out.println("Break out the guns!");
				break;
			default:
				System.out.println("Pick one of the options!");
		}
	}
}
