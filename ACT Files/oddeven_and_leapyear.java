package rushabh;
import java.util.*;
public class oddeven_and_leapyear 
{ 
    public static void main(String args[])
    {
        int a,x;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter case 1 or 2");
        x=s.nextInt();
        switch(x)
        {
            case 1: System.out.println("Enter the number to find odd or even:");
            a=s.nextInt();
            if(a%2==0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
            break;
            case 2: System.out.println("Enter the year");
            a=s.nextInt();
            if(a%4==0)
            {
                System.out.println("Leap Year");
            }
            else
            {
                System.out.println("Not Leap Year");
            }
            break;
        
        }
    }
}
