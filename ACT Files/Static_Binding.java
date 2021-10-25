package rushabh;
public class Static_Binding 
{ 
    private void eat()
    {
        System.out.println("Dog");
    }
    public static void main(String args[])
    {
        Static_Binding obj =  new Static_Binding();
        obj.eat();
    }
}
