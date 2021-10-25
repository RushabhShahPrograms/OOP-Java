package rushabh;
public class getsetidthread extends Thread 
{
    public void run()
    {
        System.out.println("running");
    }
    public static void main(String args[])
    {
        getsetidthread t1 = new getsetidthread();
        getsetidthread t2 = new getsetidthread();
        System.out.println("Name of T1: "+t1.getName());
        System.out.println("Name of T2: "+t2.getName());
        System.out.println("Id of T1: "+t1.getId());
        t1.start();
        t2.start();
        t1.setName("Javaaaaa");
        System.out.println("After changing the name of T1: "+t1.getName());
    }
}
