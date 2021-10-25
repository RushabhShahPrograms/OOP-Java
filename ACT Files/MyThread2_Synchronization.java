package rushabh;
class MyThread2_Synchronization extends Thread 
{
    Synchronization s;
      MyThread2_Synchronization(Synchronization s)
      {
          this.s=s;
      }
      
      public void run()
      {
          s.printSynchronization (5);
      }
}
