package chapter_5_Multithreading;
import java.io.*;
class methods {}

class sleep_method extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(3000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String args[])
    {
        sleep_method s = new sleep_method();
        s.start();
    }
}

class join_method extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String args[])
    {
        join_method j = new join_method();
        j.start();
        try
        {
            j.join(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class get_set_id extends Thread
{
    public void run()
    {
        System.out.println("Running");
    }
    
    public static void main(String args[])
    {
        get_set_id t = new get_set_id();
        get_set_id t1 = new get_set_id();
        System.out.println("Name of t: "+t.getName());
        System.out.println("Name of t1: "+t1.getName());
        System.out.println("id of t1: "+t1.getId());
        t.start();
        t1.start();
        t1.setName("JAVA");
        System.out.println("After changing name of t1: "+t1.getName());
    }
}

class Current extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        Current c = new Current();
        Current c1 = new Current();
        c.start();
        c1.start();
    }
}

class Priority extends Thread
{
    public void run()
    {
        System.out.println("Running");
    }
    
    public static void main(String args[])
    {
        Priority p = new Priority();
        Priority p1 = new Priority();
        p.setPriority(4); // Priority of thread will be between values 1 to 10 only
        p1.setPriority(7);
        System.out.println("P is: "+p.getPriority());
        System.out.println("P1 is: "+p1.getPriority());
        p1.start();
    }
}

class suspend_resume_stop extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String args[])
    {
        suspend_resume_stop s = new suspend_resume_stop();
        suspend_resume_stop s1 = new suspend_resume_stop();
        suspend_resume_stop s2 = new suspend_resume_stop();
        s.start();
        s1.start();
        s2.start();
        s1.suspend();
        s2.stop();
    }
}