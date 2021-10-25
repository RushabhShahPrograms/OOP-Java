/*
java finally example where exception occurs and handled
 */
package rushabh;
public class java_finally_block_2 
{
  public static void main(String args[])
  {
      try
      {
          int data = 25/0;
          System.out.println(data);
      }
      catch(ArithmeticException e)
      {
          System.out.println(e);
      }
      finally
      {
          System.out.println("Always executed");
      }
  }
}
