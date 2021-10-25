package rushabh;
public class Final_Synchronization 
{
    public static void main(String args[])
      {
         Synchronization obj = new Synchronization();
         MyThread1_Synchronization t1 = new MyThread1_Synchronization(obj);
         MyThread2_Synchronization t2 = new MyThread2_Synchronization(obj);
         t1.start();
         t2.start();
      }
  
}
