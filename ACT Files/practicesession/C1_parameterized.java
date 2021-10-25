package rushabh.practicesession;
import java.util.*;
public class C1_parameterized 
{
    int l,b,a;
    
    C1_parameterized(int x, int y)
    {
        l=x;
        b=y;
    }
    
    void display()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find square: ");
        l=s.nextInt();
        a=l*l;
        System.out.println("Area of square: "+a);
        System.out.println("*********************");
        System.out.println("Enter two numbers to find rectangle: ");
        l=s.nextInt();
        b=s.nextInt();
        a=l*b;
        System.out.println("Area of rectangle: "+a);
    }
}
