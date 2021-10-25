package rushabh;
import java.io.*;
public class filenotfound 
{
   public static void main(String args[])
   {
       try
       {
           File file = new File("E://file.txt");
           FileReader fr = new FileReader(file);
       }
     catch(FileNotFoundException e)
               {
                   System.out.println("exception");
               }
   }
}
