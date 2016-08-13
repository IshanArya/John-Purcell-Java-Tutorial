package StaticAndFinal;

/**
 * Created by ishan on 1/23/2016.
 */

class Thing{
    public static final int LUCKY_NUMBER = 1950213;
    public String name;
    public static String description;
    public static int count = 0;
    int id;

    public Thing(){
        count++;
        id = count;
    }

    public void showName(){
        System.out.println(name + "_" + id + " -> " + description);
    }

    public static void showInfo(){
        System.out.println(description);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("1st Count: " + Thing.count);
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Fred";
        thing2.name = "George";

        Thing.description = "I am a thing";

        System.out.println(thing2.description);
        thing1.showName();
        thing2.showName();
        Thing.showInfo();

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
        System.out.println("2nd Count: " + Thing.count);
    }
}
