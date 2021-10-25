/*
java finally example where exception occurs and not handled
 */
package rushabh;
public class java_finally_block_1 
{
   public static void main(String args[])
   {
       try
       {
           int data =25/0;
           System.out.println(data);
       }
       catch(NullPointerException e)
       {
           System.out.println(e);
       }
       finally
       {
           System.out.println("Finally block is always executed");
       }
   }
}
