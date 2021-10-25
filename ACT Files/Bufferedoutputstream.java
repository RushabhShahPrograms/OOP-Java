package rushabh;
import java.io.*;
public class Bufferedoutputstream 
{
  public static void main(String args[]) throws Exception
  {
      FileOutputStream fout = new FileOutputStream("/home/rushabh/NetBeansProjects/io/testout.txt");
      BufferedOutputStream bout = new BufferedOutputStream(fout);
      String s = "welcome";
      byte b[] = s.getBytes();
      bout.write(b);
      bout.close();
      fout.close();
      System.out.println("Success");
  }
}
