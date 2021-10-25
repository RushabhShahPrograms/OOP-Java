package rushabh;
public class sleepthread_1 extends sleepthread 
{
    public static void main(String args[])
    {
        sleepthread obj = new sleepthread();
        obj.run();
        sleepthread obj1 = new sleepthread();
        obj1.start();
    }
}
