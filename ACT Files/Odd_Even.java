package rushabh;
import java.util.*;
public class Odd_Even 
{
 public static void main(String args[])
 { 
     int a;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the number to find it is odd or even:");
     a=s.nextInt();
     if(a%2==0)
     {
         System.out.println("Even");
     }
     else
     {
         System.out.println("Odd");
     }
  }
}
