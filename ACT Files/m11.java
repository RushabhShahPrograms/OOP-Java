package rushabh;
public class m11 
{
    void get(int a, int b)
    {
        System.out.println(a+b);
    }
    void get(int a, int b, int c)
    {
        System.out.println(a*b*c);
    }
    public static void main(String args[])
    {
      m11 m = new m11();
      m.get(2, 5);
      m.get(1,3,6);
    }
}
