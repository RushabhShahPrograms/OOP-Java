package rushabh;
import java.io.FileOutputStream;
public class FileOutput_Stream 
{
     public static void main(String args[])
     {
         try
         {
             FileOutputStream fout = new FileOutputStream("/home/rushabh/NetBeansProjects/io/testout.txt");
             fout.write(65);
             fout.close();
             System.out.println("Success...");
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
     }
}
