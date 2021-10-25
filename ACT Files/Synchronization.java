package rushabh;
public class Synchronization 
{
  synchronized void printSynchronization(int n)
  {
       for(int i=0;i<=5;i++)
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
