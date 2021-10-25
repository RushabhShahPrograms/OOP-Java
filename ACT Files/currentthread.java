package rushabh;
public class currentthread extends Thread
{
  public void run()
  {
      System.out.println(Thread.currentThread().getName());
  }
  public static void main(String args[])
  {
      currentthread c1 = new currentthread();
      currentthread c2 = new currentthread();
      currentthread c3 = new currentthread();
      c1.start();
      c2.start();
      c3.start();
   }
}
