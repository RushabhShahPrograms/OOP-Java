package rushabh;
public class Suspend_Resume extends Thread 
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
               System.out.println(e); 
            }
            System.out.println(i);
        }
    }
    
    public static void main(String args[])
    {
        Suspend_Resume sr = new Suspend_Resume();
        Suspend_Resume sr1 = new Suspend_Resume();
        sr.start();
        sr1.start();
        sr1.suspend();
        sr1.resume();
    }
}
