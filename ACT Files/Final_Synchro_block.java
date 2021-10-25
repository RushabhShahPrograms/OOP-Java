package rushabh;
public class Final_Synchro_block 
{
  public static void main(String args[])
  {
      Synchronization_block obj =new Synchronization_block();
      MyThread1_Synchronization_block t1 = new MyThread1_Synchronization_block(obj);
      MyThread2_Synchronization_block t2 = new MyThread2_Synchronization_block(obj);
      t1.start();
      t2.start();
  }
}
