package rushabh;
public class Multiple_3_2 implements Multiple_3 
{
    public void draw()
    {
        System.out.println("Circle");
    }
    public static void main(String args[])
    {
        /*Multiple_3_2 obj = new Multiple_3_2();
        obj.draw();
        Multiple_3_1 obj1 = new Multiple_3_1();
        obj1.draw();*/
        Multiple_3 obj = new Multiple_3_1();
        obj.draw();
    }
}
