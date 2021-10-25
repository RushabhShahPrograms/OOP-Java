package rushabh;
import java .util.*;
public class Factorial 
{
    public static void main(String args[])
    {
        int i,n,f=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        n=s.nextInt();
        for(i=n;i>0;i--)
        {
            f=f*i;
        }
        System.out.printf("Factorial of %d is %d\n",n,f);
    }  
}
