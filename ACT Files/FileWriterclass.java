package rushabh;
import java.io.*;
public class FileWriterclass 
{
  public static void main(String args[])
  {
      try
      {
          FileWriter f = new FileWriter("/home/rushabh/NetBeansProjects/io/testout.txt");
          f.write("Welcome");
          f.close();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      System.out.println("Success ");
  }
}
