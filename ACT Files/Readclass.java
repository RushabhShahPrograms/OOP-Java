package rushabh;
import java.io.*;
public class Readclass 
{
  public static void main(String args[])
  {
      try
      {
          Reader r = new FileReader("/home/rushabh/NetBeansProjects/io/output.txt");
          int data = r.read();
          while(data!=-1)
          {
              System.out.println((char)data);
              data = r.read();
          }
          r.close();
      }
      
      catch(IOException e)
      {
          
      }
  }
}
