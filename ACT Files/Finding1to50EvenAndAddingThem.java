package rushabh;
import java.util.*;
public class Finding1to50EvenAndAddingThem 
{
    public static void main(String args[])
    {
        int i,sum=0,z=0;
        int[] arr = new int[50];
        for(i=1;i<arr.length;i++)
        {
            if(i%2==0)
            {
              z++;
              sum=sum+i;
            }
        }
        System.out.println(z+" total even numbers from 1 to 50");
        System.out.println("Summation: "+sum);
    }
}
