package Interfaces;

/**
 * Created by ishan on 1/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        Machine mach1 = new Machine();
        mach1.start();

        Person person1 = new Person("Fred");
        person1.greet();

        Info info1 = new Machine();
        info1.showInfo();
        Info info2 = person1;
        info2.showInfo();

        outputInfo(mach1);
        outputInfo(person1);

    }

    private static void outputInfo(Info info){
        info.showInfo();
    }
}
