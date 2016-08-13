package UpcastingAndDowncasting;

/**
 * Created by ishan on 2/25/2016.
 */
class Machine{
    public void start(){
        System.out.println("Machine started");
    }
}
class Camera extends Machine{
    public void start(){
        System.out.println("Camera started.");
    }
    public void snap(){
        System.out.println("Photo taken.");
    }
}//just checking
public class App {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        //Upcasting
        Machine machine2 = camera1;
        machine2.start();
        //error: machine2.snap();
        //type of variable decides which methods can be called

        //Downcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;
        camera2.start();
        camera2.snap();

        /*
        Machine machine4 = new Machine();
        Camera camera3 = (Camera)machine4;
        camera3.start();
        */
    }
}
