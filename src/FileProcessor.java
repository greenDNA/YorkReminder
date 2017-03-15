import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * Created by Trayvont on 3/12/2017.
 *
 * Class created to control and process files read into the application that is also able to
 * handle writing back to files
 */
public class FileProcessor {
    File myFile;
    BufferedReader br;
    PrintWriter pw;
    String buffer;

    /**
     * Introductory method to readin from a file into a String buffer
     */
    public FileProcessor(){
        myFile = new File("Test.txt");
        try{
            if(myFile.exists()){
                br = new BufferedReader(new FileReader(myFile));
                buffer = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public FileProcessor(File inFile){

    }
}
