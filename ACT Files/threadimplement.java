package rushabh;
public class threadimplement implements Runnable 
{
     public void run()
     {
         System.out.println("ABB");
     }
     public static void main(String args[])
     {
         threadimplement m1 = new threadimplement();
         Thread t1 = new Thread(m1);
         t1.start();
     }
}
