package Interfaces;

/**
 * Created by ishan on 1/29/2016.
 */
public class Machine implements Info {

    private int id = 7;

    public void start() {
        System.out.println("Machine started.");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}
