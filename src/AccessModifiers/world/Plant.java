package AccessModifiers.world;

/**
 * Created by ishan on 2/9/2016.
 */
public class Plant {
    public String name;
    public final static int ID = 8;
    private String type;
    protected String size;
    int height;

    public Plant(){
        name = "I'm a plant.";
        type = "plant";
        System.out.println(ID);
        this.height = 8;
        this.size = "medium";
        Tree tree = new Tree();
    }
}
