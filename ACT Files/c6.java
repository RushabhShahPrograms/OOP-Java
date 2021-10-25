package rushabh;
public class c6 
{
    void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    void sum(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        c6 obj = new c6();
        obj.sum(10,20);
        obj.sum(10,20,30);
    }
}
