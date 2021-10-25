package rushabh;
public class Multiple_4_2 implements Multiple_4, Multiple_4_1
{
    public void sketch()
    {
        System.out.println("hello");
    }
    public void sket()
    {
      System.out.println("Second Interface");
    }
    public static void main(String args[])
    {
        Multiple_4_2 obj = new Multiple_4_2();
        obj.sketch();
        obj.sket();
    }
}
