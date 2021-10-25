package rushabh;
import java.util.*;
public class KrishnamurthyNumber 
{
       int factorial(int n)
    {
        int fact=1;
        while(n>=1)
        {
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String arr[])
    {
        KrishnamurthyNumber obj=new KrishnamurthyNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number :");
        int num=sc.nextInt();
        int temp=num;
        int digit,sum=0;
        while(num>0)
        {
            digit=num%10;
            sum=sum+obj.factorial(digit);
            num=num/10;
        }
        if(temp==sum)
        {
            System.out.println(" NUmber is a Krishnamurti Number ") ;   
        }
        else
        {
             System.out.println(" NUmber is not a Krishnamurti Number ") ;    
        }
    }

}