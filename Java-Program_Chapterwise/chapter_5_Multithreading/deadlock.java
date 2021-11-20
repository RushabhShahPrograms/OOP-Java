package chapter_5_Multithreading;
class deadlock 
{ 
  public static void main(String args[])
  {
      final String resource1 = "abc";
      final String resource2 = "xyz";
      
      Thread t1 = new Thread()
      {
          public void run()
          {
              synchronized(resource1)
                      {
                          System.out.println("Thread1: locked resource");
                          try
                          {
                              Thread.sleep(100);
                          }
                          catch(Exception e)
                          {
                              
                          }
                          synchronized(resource2)
                          {
                              System.out.println("Thread2: locked resource");
                          }
                      }
          }
      };
      
      Thread t2 = new Thread()
      {
          public void run()
          {
              synchronized(resource2)
              {
                  System.out.println("Thread2: locked resource 2");
                  try
                  {
                      Thread.sleep(100);
                  }
                  catch(Exception e)
                  {
                      
                  }
                  synchronized(resource1)
                  {
                      System.out.println("Thread2: locked resource 1");
                  }
              }
          }
      };
      t1.start();
      t2.start();
  }
}
