package Switch;

import java.util.Scanner;

/**
 * Created by ishan on 1/12/2016.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a command: ");
        String text = sc.nextLine();

        switch(text.toLowerCase()){
            case "start":
                System.out.println("Machine started!");
                break;

            case "stop":
                System.out.println("Machine stopped.");
                break;

            default:
                System.out.println("Command not recognized");
        }
    }
}
