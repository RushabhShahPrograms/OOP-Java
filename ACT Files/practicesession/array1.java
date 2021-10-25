/*
Write a program which takes five numbers as command line
argument from user, store them in one dimensional array and
display count of negative numbers.
 */
package rushabh.practicesession;
import java.util.*;
public class array1 
{
    public static void main(String args[])
    {
       int[] arr = new int[10];
       Scanner s = new Scanner(System.in);
       System.out.println("Enter 5 numbers: ");
       for(int i=1;i<=5;i++)
       {
          arr[i]=s.nextInt();
       }
       System.out.println("Negative count is: ");
       for(int i=5;i>=1;i--)
       {
           System.out.println(arr[i]);
       }
    }
}  
