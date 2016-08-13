package AccessModifiers;

import AccessModifiers.world.*;

/**
 * Created by ishan on 2/7/2016.
 */
public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        System.out.println(plant.name);
        plant.name = "Fred";
    }
}
