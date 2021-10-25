package rushabh;
import java.io.*;
public class FileReaderclass 
{
  public static void main(String args[]) throws Exception
  {
      FileReader fr = new FileReader("/home/rushabh/NetBeansProjects/io/testout.txt");
      
     int i;    
     while((i=fr.read())!=-1)    
     {
       System.out.print((char)i);
     }
     System.out.println();
     fr.close();  
  }
}
