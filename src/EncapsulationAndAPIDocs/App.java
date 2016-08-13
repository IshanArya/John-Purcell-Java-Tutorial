package EncapsulationAndAPIDocs;

/**
 * Created by ishan on 2/24/2016.
 */

class Plant{
    public static final int ID = 13;
    private String type;

    public String getData(){
        String data = "some stuff" + calculateGrowthForecast();
        return data;
    }
    private int calculateGrowthForecast(){
        return 9;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

public class App {
}
