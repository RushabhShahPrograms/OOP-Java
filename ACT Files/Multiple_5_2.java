package rushabh;
public class Multiple_5_2 implements Multiple_5_1
{
    public void one()
    {
        System.out.println("This is First Interface");
    }
    public void second()
    {
        System.out.println("This is Second Interface extends with First Interface");
    }
    
    public static void main(String args[])
    {
        Multiple_5_2 M = new Multiple_5_2();
        M.one();
        M.second();
    }
}
