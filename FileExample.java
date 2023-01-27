import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileExample {

  /*
  Given a File (which can represent either a file or directory), return a list
  of all the files in that directory and all its subdirectories.

  If given the path of a file (rather than a directory), it returns a list with
  just that element.
  
  For example, for the following structure:

  some-files/
  |-  a.txt
  |-  more-files/
      |-  b.txt
      |-  c.java
  |-  even-more-files/
      |-  d.java
      |-  a.txt

  Given new File("some-files/") as a parameter, we'd expect [some-files/a.txt,
  some-files/more-files/b.txt, some-files/more-files/c.java,
  some-files/even-more-files/d.java, some-files/even-more-files/a.txt] as results

  Given new File("some-files/more-files") as a parameter, we'd expect
  [some-files/more-files/b.txt, some-files/more-files/c.java] as results

  Given new File("some-files/a.txt") as a parameter, we'd expect
  [some-files/a.txt] and a result

  See the File documentation here: https://docs.oracle.com/javase/8/docs/api/java/io/File.html

  */

	static List<File> getFiles(File start) throws IOException {
	  List<File> result = new ArrayList<>();
	  result.add(start);
	  if(start.isDirectory()) {
	    
      readFile(start, result);
      /*File[] paths = start.listFiles();

      for(File subFile: paths) {
        result.add(subFile);
	    }*/
	  }
	  return result;
	}

  public static void readFile(File currentFile, List<File> currentList) throws IOException {

    File[] paths2 = currentFile.listFiles();

    if(paths2 == null){
      return;
    }

      for(File currentSubFile : paths2){

        currentList.add(currentSubFile);
        readFile(currentSubFile, currentList);

      }
  }
}


