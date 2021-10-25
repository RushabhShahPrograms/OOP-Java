package rushabh;
import java.util.*;
public class Final_keyword 
{
    public static final double Pi = 3.14;
    public static void main(String args[])
    {
        double r,f;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter r");
        r=s.nextDouble();
        f=Pi*r*r;
        System.out.println("Area: "+f);
    }
}
