package rushabh;
import java.util.*;
public class c1 
{
    int id;
    String name;
    public static void main(String args[])
    {
        c1 e= new c1();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id");
        e.name = s.nextLine();
         e.id = s.nextInt();
        System.out.println("Id: "+e.id);
        System.out.println("NAme: "+e.name);   
    }
}
