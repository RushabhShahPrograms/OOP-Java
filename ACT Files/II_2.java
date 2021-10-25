package rushabh;
public class II_2 implements II_1
{
    public void show()
    {
        System.out.println("Interface inheritance");
    }
    
    public static void main(String args[])
    {
        II obj = new II_2();
        obj.show();
    }
}
