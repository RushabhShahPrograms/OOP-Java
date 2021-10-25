package rushabh;
import java.io.FileOutputStream;
public class FileOutput_Stream_write_string 
{
  public static void main(String args[])
  {
      try
      {
          FileOutputStream fout = new FileOutputStream("/home/rushabh/NetBeansProjects/io/testout.txt");
          String s = "welcome";
          byte b[] = s.getBytes();
          fout.write(b);
          fout.close();
          System.out.println("Success");
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
  }
}
