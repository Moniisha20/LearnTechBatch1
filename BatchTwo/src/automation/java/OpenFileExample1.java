package automation.java;

import java.io.File;   
import java.util.Scanner;   
public class OpenFileExample1 
{   
public static void main(String[] args)   
{   
try  
{  
File file=new File("C:\\Users\\monishs\\Desktop\\LearnTech\\Arrays.txt");   
Scanner sc = new Scanner(file);     //file to be scanned  
while (sc.hasNextLine())        //returns true if and only if scanner has another token  
System.out.println(sc.nextLine());    
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}   
}  