package StringBuilderAndStringFormatting;

/**
 * Created by ishan on 1/24/2016.
 */
public class Main {
    public static void main(String[] args){
        String info = "";

        info+= "My name is Fred.";
        info += " ";
        info += "I am a sith.";

        System.out.println(info);

        ////////////StringBuilder/////////////
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Jeff.");
        sb.append(" ");
        sb.append("I am a jedi.");

        System.out.println(sb);

        StringBuilder s = new StringBuilder();
        s.append("My name is Tabzer." + " ")
                .append("I lika da cheeza.");

        System.out.println(s);

        ///////////Formatting/////////////

        System.out.println("Fred is a sith.\n\"Sith\" should be spelled \"syth.\"");
        System.out.println("Unother one, unother one.");

        //formatting integers
        System.out.printf("Total cost $%-10d; quantity is %d\n", 5, 120);

        for(int i = 0; i < 101; i++){
            System.out.printf("%3d: %s\n", i, "soim toixt heer");
        }

        //formatting floating point values
        System.out.printf("Total value: %.2f\n", 5.6857);
        System.out.printf("Total value:%-5.1f\n", 13.13131313131313131313);


    }
}
