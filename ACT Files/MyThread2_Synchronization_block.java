package rushabh;
public class MyThread2_Synchronization_block extends Thread
{
  Synchronization_block s;
   MyThread2_Synchronization_block(Synchronization_block s)
   {
       this.s = s;
   }
   
   public void run()
   {
       s.printSynchronization_block(100);
   }   
}
