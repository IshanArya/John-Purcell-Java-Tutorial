package ReadingTextsFromFiles;

/**
 * Created by ishan on 9/25/2015.
 */

import java.io.BufferedReader; //Scanner
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadAFile {

    public static void main(String[] args) throws Exception{

        FileReader file = new FileReader("C:/Users/ishan/IdeaProjects/Tutorials/ProjectFiles/readme.txt");
        BufferedReader reader = new BufferedReader(file);

        String text = "";
        String line = reader.readLine();
        while (line != null){
            text += line + "/n";
            line = reader.readLine();
        }

        reader.close();
        System.out.println(text);
    }
}
