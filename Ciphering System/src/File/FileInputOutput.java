package File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.*;

public class FileInputOutput {
    public static String Data ;
    static FileWriter FW ;
    public static Boolean SaveToFile(String Filename , String to_be_saved){
        try{
            FW = new FileWriter(Filename) ;
            FW.write(to_be_saved) ;
            FW.close();
            return true ;
        }
        catch ( Exception e ){
            return false ;
        }
    }
    public static String LoadFromFile(String fileName) {
        try{
            Data = new String(Files.readAllBytes(Paths.get(fileName)));
            return Data;
        }
        catch (Exception e ){
            return new String ( "File Doesn't exist Please check the file name");
        }
    }
}
