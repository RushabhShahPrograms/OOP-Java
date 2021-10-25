package rushabh;
public class Suspendresumestop_thread extends Thread
{
  public void run()
  {
      for(int i=1;i<5;i++)
      {
          try
          {
              Thread.sleep(500);
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
          System.out.println(i);
      }
  }
  
  public static void main(String args[])
  {
      Suspendresumestop_thread s1 = new Suspendresumestop_thread();
      Suspendresumestop_thread s2 = new Suspendresumestop_thread();
      Suspendresumestop_thread s3 = new Suspendresumestop_thread();
      s1.start();
      s2.start();
      s2.suspend();
      s3.start();
      s2.resume();
      s3.stop();
  }
}
