package rushabh;
import java.util.*;
public class PrimeNumber 
{
    public static void main(String args[])
    {
       
        int n, i, flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        n=s.nextInt();

        for (i = 2; i <= n / 2; ++i) 
        {
            // condition for non-prime
            if (n % i == 0) 
            {
            flag = 1;
            break;
            }
        }

        if (n == 1) 
        {
            System.out.println("1 is neither prime nor composite.");
        } 
        else if(n==0)
        {
            System.out.println("0 is neither prime nor composite.");
        }
        else 
        {
            if (flag == 0)
            {
            System.out.println(n+" is a prime number.");
            }
            else
            {
            System.out.println(n+" is not a prime number.");
            }
        }
     } 
}
       

