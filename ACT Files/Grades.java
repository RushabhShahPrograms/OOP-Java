package rushabh;
import java.util.*;
public class Grades 
{
 public static void main(String args[])
 { 
     int a;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter your marks");
     a=s.nextInt();
     if(a>90)
     {
         System.out.println("Grade A");
     }
     else if(a>70)
     {
         System.out.println("Grade B");
     }
     else if(a>50)
     {
         System.out.println("Grade C");
     }
     else if(a>30)
     {
         System.out.println("Grade D");
     }
     else
     {
         System.out.println("Grade F");
     }
          
 }
}
