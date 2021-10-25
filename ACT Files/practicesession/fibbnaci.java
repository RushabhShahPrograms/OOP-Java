/*
Write a JAVA program to implement the Fibonacci series using for
loop control structure.
 */
package rushabh.practicesession;
import java.util.*;
public class fibbnaci 
{
   public static void main(String args[])
   {
       int a=0,b=1,c,i,n;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the number: ");
       n=s.nextInt();
       System.out.println("The series is: ");
       System.out.printf("%d\t%d",a,b);
       for(i=0;i<n;i++)
       {
           c=a+b;
           a=b;
           b=c;
           System.out.printf("\t%d",c);
       }
       System.out.println();
   }
}
