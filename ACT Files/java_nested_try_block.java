package rushabh;
public class java_nested_try_block 
{
   public static void main(String args[])
   {
       try
       {
           try
           {
               System.out.println("Going to Divided");
               int b=39/0;
           }
           catch(ArithmeticException e)
           {
               System.out.println(e);
           }
           try
           {
               int a[] = new int[5];
               a[5]=8;
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
               System.out.println(e);
           }
           System.out.println("Other statement");
       }
       catch(Exception e)
       {
           System.out.println("Exception ");
       }
   }
}
