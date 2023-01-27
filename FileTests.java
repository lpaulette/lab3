import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.util.*;

public class FileTests {

    @Test
    public void testGetFiles() throws IOException{

        File file = new File("some-files/");

        List<File> fileList = FileExample.getFiles(file);

        for(File currentFile : fileList){

            System.out.println(currentFile.toString());   
             }
    }
}
    

