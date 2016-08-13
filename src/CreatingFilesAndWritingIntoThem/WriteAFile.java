package CreatingFilesAndWritingIntoThem;

/**
 * Created by ishan on 9/26/2015.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteAFile {

    public static void main(String[] args)throws Exception{
        File newFile = new File("C:/Users/ishan/Desktop/newFile.txt");
        if(newFile.exists()){
            System.out.println("The file already exists.");
            FileWriter fileW = new FileWriter(newFile, true);
            BufferedWriter buffW = new BufferedWriter(fileW);
            buffW.append("Testing... 1... 2... 3... 4...");
            buffW.append("I like cheese!");

            buffW.close();
            System.out.println("File written!");
        }

        else{
            try{
                newFile.createNewFile();
            }
            catch(Exception e){
                e.printStackTrace();
            }

            try{
                FileWriter fileW = new FileWriter(newFile);
                BufferedWriter buffW = new BufferedWriter(fileW);
                buffW.write("Testing... 1... 2...");

                buffW.close();
                System.out.println("File written!");
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
