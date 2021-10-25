package rushabh;
import java.io.*;
public class JoinThread extends Thread
{
   public void display()
    {
        for(int i=1;i<=5;i++)
        {
          try
          {
              Thread.sleep(100);
          }
          catch(InterruptedException e)
          {
              System.out.println(e);
          }
          System.out.println(i);
        }
    }
}
