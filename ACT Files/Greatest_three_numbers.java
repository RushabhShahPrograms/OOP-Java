package rushabh;
import java.util.*;
public class Greatest_three_numbers 
{
    public static void main(String args[])
    {
    int a,b,c;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter three number of your choice");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    if(a>b)
    {
        if(a>c)
        {
            System.out.println("A is Greater");
        }
        else
               {
                    System.out.println("C is Greater");
               }
        
    }
        else
        if(b>c)
          {
            System.out.println("B is Greater");
          }
    else
        {
            System.out.println("C is Greater");
        }
    }
}
    
    
