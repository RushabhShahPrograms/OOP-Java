package rushabh;
import java.util.*;
public class calc_classandobject 
{
    float a,b,c;
    char x;
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        calc_classandobject e= new calc_classandobject();
        System.out.println("+  -  *  /  %");
        System.out.println("Enter your choice: ");
        e.x=s.next().charAt(0);
        System.out.println("Enter two numbers:");
        e.a = s.nextFloat();
        e.b = s.nextFloat();
         switch(e.x)
      { 
             case '+' : e.c= e.a+e.b;
            System.out.println("Addition of two numbers: "+e.c);
            break;
             case '-' : e.c= e.a-e.b;
            System.out.println("Subtraction of two numbers: "+e.c);
            break; 
             case '*' : e.c= e.a*e.b;
            System.out.println("Multiplication of two numbers: "+e.c);
            break;       
             case '/' : e.c= e.a/e.b;
            System.out.println("Division of two numbers: "+e.c);
            break;
            case '%': e.c=e.a%e.b;
            System.out.println("Modulo: "+e.c);
            break;
            default: System.out.println("Error");
            break;
      }
    }
    
}
