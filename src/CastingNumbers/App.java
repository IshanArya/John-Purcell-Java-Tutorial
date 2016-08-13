package CastingNumbers;

/**
 * Created by ishan on 2/25/2016.
 */
public class App {
    public static void main(String[] args) {
        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.3f;
        float floatValue2 = (float)99.3;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int)longValue;
        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue);

        //Wraps around;
        byteValue = (byte)129;
        System.out.println(byteValue);
    }
}
