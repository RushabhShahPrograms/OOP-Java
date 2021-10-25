package rushabh;
import java.io.*;
public class JoinThread_1 extends JoinThread
{
  public static void main(String args[])
  {
      JoinThread obj1 = new JoinThread();
      JoinThread obj2 = new JoinThread();
      obj2.start();
      obj1.start();
      try
      {
          obj1.join(500);
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
  }
}
