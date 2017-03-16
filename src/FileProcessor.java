import java.io.*;

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
    FileWriter fw;
    BufferedWriter bw;

    /**
     * Introductory method to readin from a file into a String buffer
     */
    public FileProcessor(){
        myFile = new File("Test.txt");
        try{
            //myFile.createNewFile();
            if(myFile.exists()){
                br = new BufferedReader(new FileReader(myFile));
                while((buffer = br.readLine()) != null) {
                    //buffer = br.readLine();
                    System.out.println(buffer);
                }
                br.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            fw = new FileWriter(myFile, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

                pw.println("the text\n");
                //more code
                pw.println("more text\n");
                //more code
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public FileProcessor(File inFile){

    }
}
