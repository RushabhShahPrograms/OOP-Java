package rushabh;
import java.util.*;
public class multiplication_table 
{
    public static void main(String args[])
    {
        int i=1,num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        num=s.nextInt();
        while(i<=10)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
            i++;
        }
    }
}
