package rushabh;
import java.io.*;
public class throwsdemo 
{
    void m() throws IOException
    {
        throw new IOException("device");
    }
    void n() throws IOException
    {
        m();
    }
    void p()
    {
        try
        {
            n();
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String args[])
    {
        throwsdemo obj =new throwsdemo();
        obj.p();
    }
    
}
