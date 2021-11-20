package chapter_4_package_exception_handling;
import java.io.*;
class finally_throw_throws {}

class Finally
{
    public static void main(String args[])
    {
        try
        {
            int data = 25/0;
            System.out.println(data);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("This block will always execute");
        }
    }
}

class Throw
{
    static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not Valid");
        }
        else
        {
            System.out.println("Vote");
        }
    }
    
    public static void main(String args[])
    {
        validate(24);
    }
}

class Throws
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
            System.out.println(e);
        }
    }
    
    public static void main(String args[])
    {
        Throws obj = new Throws();
        obj.p();
    }
}