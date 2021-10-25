
package rushabh;
public class Synchronization_block 
{  
   void printSynchronization_block(int n)
   {
       synchronized(this)
       {
           for(int i=1;i<=5;i++)
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
}
