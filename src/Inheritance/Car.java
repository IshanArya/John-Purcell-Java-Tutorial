package Inheritance;

/**
 * Created by ishan on 1/26/2016.
 */
public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    public void wipeWindshield(){
        System.out.println("Wiping windshield.");
    }

    public void showInfo(){
        System.out.println("Car name: " + name);
    }

}
