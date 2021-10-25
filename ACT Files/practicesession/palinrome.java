/*
Write a program to check whether the input number is a
palindrome or not without using reverse() method of
String class? E.g. a palindrome is a sequence of
characters/numbers which reads the same backward as
forward like 323, 45654 etc.
 */
package rushabh.practicesession;
import java.util.*;
public class palinrome 
{
    public static void main(String args[])
    {
      int n,r=0,t;
      Scanner s =new Scanner(System.in);
      System.out.println("Enter the number: ");
      n=s.nextInt();
      t=n;
      while(t!=0)
      {
          r=r*10;
          r=r+t%10;
          t=t/10;
      }
      if(n==r)
      {
          System.out.println(n+" is palindrome");
      }
      else
      {
          System.out.println(n+" not palindrome");
      }
    }
    
}
