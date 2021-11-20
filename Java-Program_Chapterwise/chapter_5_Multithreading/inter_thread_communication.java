package chapter_5_Multithreading;
class inter_thread_communication 
{
  int amount = 10000;
  synchronized void withdraw(int amount)
  {
      System.out.println("Going to withdraw");
      if(this.amount<amount)
      {
          System.out.println("Less Balance");
          try
          {
              wait();
          }
          catch(Exception e)
          {
              
          }
      }
      this.amount-=amount;
      System.out.println("Withdraw Completed: ");
  }
  synchronized void deposit(int amount)
  {
      System.out.println("Going to Deposit");
      this.amount += amount;
      System.out.println("Deposit completed");
      notify();
  }
}
class Test
{    
    public static void main(String args[])
    {    
        final inter_thread_communication c=new inter_thread_communication();    
        new Thread()
        {    
            public void run()
            {
                c.withdraw(15000);
            }    
        }.start();    
        new Thread()
        {    
            public void run()
            {
                c.deposit(10000);
            }    
        }.start();    
    
    }
}    