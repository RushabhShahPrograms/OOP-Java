/*
Write a JAVA
program to generate and handle division by zero arithmetic exception.
 */
package rushabh.practicesession;
public class exeption1 
{
   public static void main(String args[])
   {
       try
       {
           int a=50/0;
       }
       catch(ArithmeticException e)
       {
           System.out.println("Can't Divide By Zero");
       }
   }
}
