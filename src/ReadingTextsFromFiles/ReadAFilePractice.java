package ReadingTextsFromFiles;

/**
 * Created by ishan on 9/26/2015.
 */
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAFilePractice {

    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader("C:/Users/ishan/IdeaProjects/Tutorials/ProjectFiles/readmePractice.txt");
        BufferedReader reader = new BufferedReader(file);
        System.out.println("Trial 1: " + reader.readLine());

        String text = "";
        String line = reader.readLine();
        while(line != null){
            text += line + "\n";
            line = reader.readLine();
        }

        reader.close();
        System.out.println("Trial 2: " + text);
    }
}
