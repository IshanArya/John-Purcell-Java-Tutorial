package Constructors;

/**
 * Created by ishan on 1/23/2016.
 */

class Machine{
    private String name = "George";

    public Machine(String name){
        System.out.println("Constructor used!");
        this.name = name;
    }

    //public Machine()
}
public class Main {
    public static void main(String[] args){
        Machine machine = new Machine("R Nee");

    }
}
