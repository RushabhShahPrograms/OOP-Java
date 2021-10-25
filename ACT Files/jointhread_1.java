package rushabh;
public class jointhread_1 extends jointhread 
{
    public static void main(String args[])
    {
        jointhread obj1 = new jointhread();
        jointhread obj2 = new jointhread();
        jointhread obj3 = new jointhread();
        obj1.start();
            try
            {
                obj1.join();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            obj2.start();
            obj3.start();
    }
}
