/*
Write a program called SumDigits to sum up the
individual digits of a positive integer, given in the
command line. An example is shown below:
java SumDigits 12345
The sum of digits = 1 + 2 + 3 + 4 + 5 = 15
 */
package rushabh.practicesession;
import java.util.*;
public class SuDigits 
{
  public static void main(String args[])
  {
      int n,sum=0;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number: ");
      n=s.nextInt();
      while(n!=0)
      {
          sum=sum+n%10;
          n=n/10;
      }
      System.out.println(sum);
  }
}
