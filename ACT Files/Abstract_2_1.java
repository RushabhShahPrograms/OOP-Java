package rushabh;
import java.util.*;
public class Abstract_2_1 extends Abstract_2 
{
    void display()
    {
        int l,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter l and b: ");
        l=s.nextInt();
        b=s.nextInt();
        c=l*b;
        System.out.println("Area of Rectangle: "+c);
    }
}
