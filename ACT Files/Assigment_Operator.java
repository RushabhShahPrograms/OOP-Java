package rushabh;
import java.util.*;
public class Assigment_Operator 
{
 public static void main(String args[])
 {
     float a,b;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter value of A:");
     a=s.nextFloat();
     b=a;
     System.out.println("a=b: "+b);
     b+=a;
     System.out.println("a+=b: "+b);
     b-=a;
     System.out.println("a-=b: "+b);
     b/=a;
     System.out.println("a/=b: "+b);
     b%=a;
     System.out.println("a%=b: "+b);
 }
 
}
