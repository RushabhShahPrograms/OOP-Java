package rushabh.practicesession;
import java.util.*;
public class c2_default 
{
    int a,b;
    float c;
    char t;
    c2_default()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any of the given choice:");
        System.out.println("+\t-\t*\t/\t%\t");
        System.out.println("Enter your choice: ");
        t=s.next().charAt(0);
        System.out.println("Enter two numbers");
        a=s.nextInt();
        b=s.nextInt();
        if(t=='+')
        {
            c=a+b;
            System.out.println("Addition: "+c);
            
        }
        else if(t=='-')
        {
            c=a-b;
            System.out.println("Subtraction: "+c);
            
        }
        else if(t=='*')
        {
            c=a*b;
            System.out.println("Multiplication: "+c);
        }
        else if(t=='/')
        {
            c=a/b;
            System.out.println("Division: "+c);
            
        }
        else if(t=='%')
        {
            c=a%b;
            System.out.println("Modulo: "+c);
        }   
    }
}
