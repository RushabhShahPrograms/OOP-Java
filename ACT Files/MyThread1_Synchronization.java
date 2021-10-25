package rushabh;
class MyThread1_Synchronization extends Thread 
{
    Synchronization s;
      MyThread1_Synchronization(Synchronization s)
      {
          this.s=s;
      }
      
      public void run()
      {
          s.printSynchronization (5);
      }
}
