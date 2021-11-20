package chapter_5_Multithreading;
class extends_and_implements {}

class Extends extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String args[])
    {
        Extends obj = new Extends();
        obj.start();
    }
}

class Implement implements Runnable
{
    public void run()
    {
        System.out.println("abab");
    }
    public static void main(String args[])
    {
        Implement m = new Implement();
        Thread t = new Thread(m);
        t.start();
    }
}