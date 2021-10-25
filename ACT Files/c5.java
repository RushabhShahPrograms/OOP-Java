package rushabh;
public class c5 
{
    void a(int a, int b)
    {
        System.out.println(a+b);
    }
    void a(double a, double b, double c)
    {
        System.out.println(a+b+c);
    }
    void a(float a, float b)
    {
        System.out.println(a*b);
    }
    public static void main(String args[])
    {
        c5 e = new c5();
        e.a(10,20);
        e.a(10.0, 11.1, 13.67);
        e.a(5,4);
    }
}
