package rushabh;
import java.util.*;
public class Armstrongnumbers 
{
    public static void main(String args[])
    {
        
        int a,n,b=0,t;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        n=s.nextInt();
        for(t=n;n>0;n=n/10)
        {
            a=n%10;
            b=b+a*a*a;
        }
        if(b==t)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
