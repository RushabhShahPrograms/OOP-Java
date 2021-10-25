package rushabh;
import java.util.*;
public class conditional_operator 
{
 public static void main(String args[])
 { 
     int n;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the vlaue:");
     n=s.nextInt();
     String answer = (n>35)?"Pass":"Fail" ;
     System.out.println("Answer"+answer);   
 }
}
