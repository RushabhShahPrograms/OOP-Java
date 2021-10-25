package rushabh;
import java.util.*;
public class Arithmetic_Operator 
{
    public static void main(String args[])
    {
     float a,b,c;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter value of A:");
     a=s.nextFloat();
     System.out.println("Enter value of B:");
     b=s.nextFloat();
     c=a+b;
     System.out.println("Addition:"+c);
     c=a-b;
     System.out.println("Subtraction:"+c);
     c=a*b;
     System.out.println("Multiplication:"+c);
     c=a/b;
     System.out.println("Division:"+c);
     c=a%b;
     System.out.println("Modulo:"+c);
    }
    
}
