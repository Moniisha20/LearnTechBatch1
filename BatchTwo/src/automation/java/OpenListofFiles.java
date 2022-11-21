package automation.java;

import java.io.File;
import java.io.IOException;
public class OpenListofFiles {
   public static void main(String args[]) throws IOException {
      //Creating a File object for directory
	   try {
      File directoryPath = new File("C:\\Users\\monishs\\Desktop\\LearnTech");
      //List of all files and directories
      String contents[] = directoryPath.list();
      System.out.println("List of files and directories in the specified directory:");
      for(int i=0; i<contents.length; i++) {
         System.out.println(contents[i]);
      }
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
}