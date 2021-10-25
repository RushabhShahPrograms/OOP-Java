package rushabh;
public class Dynamic_Binding_1 extends Dynamic_Binding 
{
    void eat()
    {
        System.out.println("hello java");
    }
    public static void main(String args[])
    {
        Dynamic_Binding obj1 = new Dynamic_Binding();
        Dynamic_Binding obj = new Dynamic_Binding_1();
        obj.eat();
        obj1.eat();
    }
}
