package Polymorphism;

/**
 * Created by ishan on 2/21/2016.
 */
public class Tree extends Plant {
    @Override
    public void grow() {
        System.out.println("Tree growing");
    }

    public void shedLeaves(){
        System.out.println("Leaves shedding");
    }
}
