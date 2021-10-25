package rushabh;
import java.util.*;
public class Factors 
{
    public static void main(String args[])
    {
        int i,n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find its factors");
        n=s.nextInt();
        System.out.println("Factors of " + n + " are: ");

        for (i = 1; i <= n; ++i) 
        {

              if (n % i == 0) 
                {
                    System.out.println(i + " ");
                }
        }
    }
}
