package rushabh;
import java.util.*;
public class Bitwise_Operator 
{
 public static void main(String args[])
 {
     int a,b,c;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter value of A");
     a=s.nextInt();
     System.out.println("Enter value of B");
     b=s.nextInt();
     c=a & b; //And
     System.out.println("a & b: "+c);
     c=a | b; //Or
     System.out.println("a | b: "+c);
     c=a ^ b; //Xor
     System.out.println("a ^ b: "+c);
     int j;
    System.out.println("Enter the one value: ");
    j=s.nextInt();
    c=j>>2;  //Right shift
    System.out.println("Right Shift: "+c);
    c=j<<2;  //Left Shift
    System.out.println("Left Shift: "+c);
    c= ~j; //Compliment
    System.out.println("Compliment: "+c);
 }
 
}
