package rushabh;
public class sleepthread extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(30);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
