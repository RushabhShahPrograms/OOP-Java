package rushabh;
public class threadextend extends Thread 
{
      public void run()
      {
          System.out.println("Thread is running");
      }
      public static void main(String args[])
      {
          threadextend obj = new threadextend();
          obj.run();
      }
}
