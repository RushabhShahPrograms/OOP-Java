package chapter_5_Multithreading;
class Synchronization
{
  synchronized void printSynchronization(int n)
  {
      //synchronized method
      for(int i=1;i<=5;i++)
      {
          System.out.println(n*i);
          try
          {
              Thread.sleep(400);
          }
          catch(Exception e)
          {
              System.out.println(e);
          }
      }
  }
}
  
  class MyThread extends Thread
  {
      Synchronization s;
      MyThread(Synchronization s)
      {
          this.s=s;
      }
      public void run()
      {
          s.printSynchronization(5);
      }
  }
  
  class Mythread2 extends Thread
  {
      Synchronization s1;
      Mythread2(Synchronization s1)
      {
          this.s1=s1;
      }
      public void run()
      {
          s1.printSynchronization(100);
      }
      
      public static void main(String args[])
      {
          Synchronization obj = new Synchronization();
          MyThread m = new MyThread(obj);
          m.start();
          Mythread2 m1 = new Mythread2(obj);
          m1.start();
      }
  }


class Synchronized_Block
{
    void printTable(int n)
    {
        synchronized(this)
        {
            //synchronized block
            for(int i=1;i<=5;i++)
            {
                System.out.println(n*i);
                try
                {
                    Thread.sleep(400);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
class MyThread3 extends Thread
{
    Synchronized_Block t;
    MyThread3(Synchronized_Block t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(5);
    }
}
class MyThread4 extends Thread
{
    Synchronized_Block t;
    MyThread4(Synchronized_Block t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(100);
    }
    public static void main(String args[])
    {
        Synchronized_Block obj = new Synchronized_Block();
        MyThread3 t = new MyThread3(obj);
        MyThread4 t1 = new MyThread4(obj);
        t.start();
        t1.start();
    }
}