package rushabh;
import java.util.*;
public class Switch_Calc 
{
    public static void main(String args[])
    { 
        float a,b,c;
        char x;
        Scanner s = new Scanner(System.in);
        System.out.println("+  -  *  /  %");
        System.out.println("Enter your choice: ");
        x=s.next().charAt(0);
        System.out.println("Enter any two numbers: ");
        a=s.nextFloat();
        b=s.nextFloat();
        switch(x)
        {
            case '+': c=a+b;
            System.out.println("Addition: "+c);
            break;
            case '-': c=a-b;
            System.out.println("Subtraction: "+c);
            break;
            case '*': c=a*b;
            System.out.println("Multiplication: "+c);
            break;
            case '/': c=a/b;
            System.out.println("Division: "+c);
            break;
            case '%': c=a%b;
            System.out.println("Modulo: "+c);
            break;
            default: System.out.println("Error");
            break;
        }
    }
}
