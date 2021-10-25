package rushabh;
import java.util.*;
public class calc 
{
    public static void main(String args[])
    { 
        float a,b,c;
        char t;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("+  -  /  *  %");
        System.out.println("Enter your choice");
        t=s.next().charAt(0);
        if(t=='+')
         {
            c=a+b;
            System.out.println("Addition"+c);
         }
        else if(t=='-')
         {
            c=a-b;
            System.out.println("Subtraction"+c);
         }
        else if(t=='*')
         {
            c=a*b;
            System.out.println("Multiplication"+c);
         }
        else if(t=='/')
         {
            c=a/b;
            System.out.println("Division"+c);
         }
        else if(t=='%')
         {
            c=a%b;
            System.out.println("Modulo"+c);
         }
      }
    }
    
    

