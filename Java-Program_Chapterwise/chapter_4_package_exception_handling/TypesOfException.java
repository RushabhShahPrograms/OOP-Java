package chapter_4_package_exception_handling;
import java.io.*;
class TypesOfException {}

class Arithmetic
{
    public static void main(String args[])
    {
        try
        {
            int a=30,b=0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
    }
}

class NullPointer
{
    public static void main(String args[])
    {
        try
        {
            String a = null;
            System.out.println(a.charAt(0));
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer Exception");
        }
    }
}

class StringIndexOutOfBound
{
    public static void main(String args[])
    {
        try
        {
            String a = "act";
            char c = a.charAt(5);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("String Index Out Of Bounds Exception");
        }
    }
}


class FileNotFound
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("D://file.txt");
            FileReader fr = new FileReader(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found Exception");
        }
    }
}

class NumberFormat
{
    public static void main(String args[])
    {
        try
        {
            int num = Integer.parseInt("act");
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number Format Exception");
        }
    }
}

class ArrayIndexOutOfBound
{
    public static void main(String args[])
    {
        try
        {
            int a[] = new int[5];
            a[6] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out Of Bounds");
        }
    }
}