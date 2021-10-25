package rushabh;
import java.io.FileInputStream;
public class FileInput_Stream 
{
  public static void main(String args[])
  {
      try
      {
          FileInputStream fin = new FileInputStream("/home/rushabh/NetBeansProjects/io/testout.txt");
          int i = fin.read();
          System.out.println((char)(i));
          fin.close();
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
  }
}
