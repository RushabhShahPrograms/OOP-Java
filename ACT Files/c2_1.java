package rushabh;
import java.util.*;
public class c2_1 
{
    public static void main(String args[])
    {
        
        Scanner s = new Scanner(System.in);
        c2 e = new c2();
        System.out.println("Square\tRectangle\tcircle\tcylinder");
        System.out.println("Which area you want to find?");
        e.x=s.nextLine();
        switch(e.x)
        {
            case "Square" : 
                System.out.println("Enter the length");
                e.l=s.nextFloat();
                e.a=e.l*e.l;
                System.out.println("Area of Square: "+e.a);
                break;
                case "Rectangle" : 
                System.out.println("Enter the length and breath");
                e.l=s.nextFloat();
                e.b=s.nextFloat();
                e.a=e.l*e.b;
                System.out.println("Area of Rectangle: "+e.a);
                break;
                case "Circle" : 
                System.out.println("Enter the Radius");
                e.r=s.nextFloat();
                e.a=e.pi*e.r*e.r;
                System.out.println("Area of Circle: "+e.a);
                break;
                case "Cylinder" : 
                System.out.println("Enter the radius and height");
                e.r=s.nextFloat();
                e.h=s.nextFloat();
                e.a=e.pi*e.r*e.r*e.h;
                System.out.println("Area of Cylinder: "+e.a);
                break;
                default: System.out.println("Error");
            break;
        }
    }
}
