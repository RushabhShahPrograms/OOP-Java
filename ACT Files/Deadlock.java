package rushabh;
import java.io.*;
public class Deadlock extends Thread 
{
  public static void main(String args[])
  {
     final String r1 = "Abc";
     final String r2 = "Xyz";
      
      Thread t1 = new Thread()
      {
          public void run()
          {
            synchronized(r1)
           {
             System.out.println("T1: Lock");           
                    
            try
            {
                Thread.sleep(300);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            synchronized(r2)
            {
               System.out.println("T2:Lock");
            }
           }
          }
      };
      
      Thread t2 = new Thread()
      {
         public void run()
          {
            synchronized(r2)
           {
             System.out.println("T1: Lock");           
                    
            try
            {
                Thread.sleep(300);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            synchronized(r1)
            {
               System.out.println("T2:Lock");
            }
           }
          } 
      };
      
      t1.start();
      t2.start();
  }
}
