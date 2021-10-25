package rushabh.practicesession;
import java.util.*;
public class c8_constructoroverloading 
{
    float a,b,c;
    c8_constructoroverloading()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your two numbers:");
        a=s.nextFloat();
        b=s.nextFloat();
        
    }
    c8_constructoroverloading(float x, float y, float z)
    {
        a=x;
        b=y;
        c=z;
    }
    
    void display()
    {
        System.out.println("The Results are: ");
        c=a+b;
        System.out.println("Addition: "+c);
        c=a-b;
        System.out.println("Subtraction: "+c);
        c=a*b;
        System.out.println("Multiplication: "+c);
    }
    
    public static void main(String argsp[])
    {
        c8_constructoroverloading e = new c8_constructoroverloading();
        e.display();
    }
}
