package ToStringMethod;

/**
 * Created by ishan on 1/25/2016.
 */

class Frog{

    private String name;
    private int id;

    public Frog(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return String.format("%-10d: %s", id, name);
        //return new StringBuilder().append(id).append(": ").append(name).toString();
    }

}
public class Main {
    public static void main(String[] args) {
        Frog frog1 = new Frog(13, "George");
        Frog frog2 = new Frog(12, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);
    }
}
