package rushabh;
import java.util.*;
public class Abstract_2_2 extends Abstract_2_1
{
    void display()
    {
        int a,b,h;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        a=s.nextInt();
        b=s.nextInt();
        h=a+b;
        System.out.println("Add: "+h);
    }
}
