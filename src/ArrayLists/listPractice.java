package ArrayLists;

/**
 * Created by Ishan on 8/15/2015.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class listPractice {

    static Scanner reader = new Scanner(System.in);
    static ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args){
        System.out.println("Please enter an array of numbers. Type in \"0\" when finished.");
        int in = reader.nextInt();

        while(in != 0){
            array.add(in);
            in = reader.nextInt();
        }

        //The user typed in 0
        printArray();


        System.out.println("What number would you like to delete?");
        int del = reader.nextInt();

        for(int i = 0; i < array.size(); i++){
            if(array.get(i) == del){
                array.remove(i);
                break;
            }
        }
        printArray();
    }

    public static void printArray(){
        System.out.println("-------------------------------------");

        for(int i : array){
            System.out.println(i);
        }
    }
}
