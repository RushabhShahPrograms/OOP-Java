//Write a program to take three numbers as command line argument. Display
//the maximum among them?
package rushabh.practicesession;
import java.util.*;
public class Finding_max 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.println("Give Three numbers: ");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is max");
            }
            else
            {
                System.out.println("C is max");
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
                System.out.println("B is max");
                
            }
            else
            {
                System.out.println("C is max");
            }
        }
    }
    
}
