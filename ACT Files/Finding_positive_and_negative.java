package rushabh;
import java.util.*;
public class Finding_positive_and_negative 
{ 
    public static void main(String args[])
    {
        int i=1,x=0,z=0,y=0;
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 10 random numbers");
        do
        {
            num=s.nextInt();
            if(num<0)
            {
                x++;
            }
            else if(num==0)
            {
                y++;
            }
            else if(num>0)
            {
                z++;
            }
            i++;
        }while(i<=10);
               
        System.out.println(z+"  Positive numbers");
        System.out.println(x+"  Negative Numbers");
        System.out.println(y+"  Zeros");
    }
}
