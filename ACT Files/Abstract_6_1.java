package rushabh;
public class Abstract_6_1 extends Abstract_6
{
    void show()
    {
        System.out.println("Hello This is abstract class");
    }
    
    int a=10, b=5;
    Abstract_6_1()  //default constructor
    {
        int c=a+b;
        System.out.println("Add: "+c);
    }
    void display() //method
    {
        System.out.println("This is second practical");
    }
    public static void main(String args[])
    {
        Abstract_6 obj = new Abstract_6_1();
        obj.show();
        Abstract_6_1 obj2 = new Abstract_6_1();
        obj2.display();
    }
}
