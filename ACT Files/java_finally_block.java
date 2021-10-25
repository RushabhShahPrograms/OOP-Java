/*
java finally example where exception doesn't occur.
*/
package rushabh;
public class java_finally_block 
{
    public static void main(String args[])
    {
        try
        {
            int data =25/5;
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
