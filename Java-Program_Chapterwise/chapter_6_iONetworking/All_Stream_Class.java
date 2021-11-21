package chapter_6_iONetworking;
import java.io.*;
class All_Stream_Class {}

class FileOutput
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample.txt");
            fout.write(65);
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class FileOutput_1  //writing string
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample1.txt");
            String s = "welcome";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class FileInput
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample1.txt");
            int i = fin.read();
            System.out.println((char)(i));
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class FileInput_1 //Read all characters
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample1.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.print((char)(i));
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class BufferedOutput
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fout = new FileOutputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample2.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "welcome";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Success");
    }
}

class BufferedInput
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample2.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i=bin.read())!=-1)
            {
                System.out.println((char)(i));
            }
            bin.close();
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class SequenceInput
{
    public static void main(String args[]) throws Exception
    {
        FileInputStream input1 = new FileInputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample1.txt");
        FileInputStream input2 = new FileInputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample2.txt");
        SequenceInputStream inst = new SequenceInputStream(input1,input2);
        int j;
        while((j=inst.read())!=-1)
        {
            System.out.print((char)(j));
        }
        inst.close();
        input1.close();
        input2.close();
    }
}

class ByteArrayOutput
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fout1 = new FileOutputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample3.txt");
        FileOutputStream fout2 = new FileOutputStream("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample4.txt");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);
        bout.close();
        System.out.println("Success");
    }
}

class ByteArrayInput
{
    public static void main(String args[]) throws IOException
    {
        byte[] buf = {35,36,37,38};
        ByteArrayInputStream byt = new ByteArrayInputStream(buf);
        int k=0;
        while((k=byt.read())!=-1)
        {
            char ch = (char)k;
            System.out.println("ASCII value of character is "+k+"; Special char is: "+ch);
        }
    }
}

class Writer
{
    public static void main(String args[])
    {
        try
        {
            FileWriter w = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample5.txt");
            String content = "java";
            w.write(content);
            w.close();
            System.out.println("Done");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Reader
{
    public static void main(String args[])
    {
        try
        {
            FileReader r = new FileReader("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample5.txt");
            int data = r.read();
            while(data!=-1)
            {
                System.out.println((char)data);
                data=r.read();
            }
            r.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Filewriter
{
    public static void main(String args[])
    {
        try
        {
            FileWriter f = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample6.txt");
            f.write("welcome");
            f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Success");
    }
}

class Filereader
{
    public static void main(String args[]) throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample6.txt");
        int i;
        while((i=fr.read())!=-1)
        {
            System.out.println((char)i);
        }
        fr.close();
    }
}

class Bufferedwriter
{
    public static void main(String args[]) throws Exception
    {
        FileWriter w = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample7.txt");
        BufferedWriter b = new BufferedWriter(w);
        b.write("Java");
        b.close();
        System.out.println("Success");
    }
}

class Bufferedreader
{
    public static void main(String args[]) throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample7.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;
        while((i=br.read())!=-1)
        {
            System.out.println((char)i);
        }
        br.close();
        fr.close();
    }
}

class CharArrayreader
{
    public static void main(String args[]) throws Exception
    {
        char[] arr = {'j','a','v','a'};
        CharArrayReader r = new CharArrayReader(arr);
        int k = 0;
        while((k=r.read())!=-1)
        {
            char ch = (char)k;
            System.out.print(ch+": ");
            System.out.println(k);
        }
    }
}

class CharArraywriter
{
    public static void main(String args[]) throws Exception
    {
        CharArrayWriter out = new CharArrayWriter();
        out.write("welcome");
        FileWriter f1 = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample8.txt");
        FileWriter f2 = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample9.txt");
        FileWriter f3 = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample10.txt");
        FileWriter f4 = new FileWriter("C:\\Users\\RUSHABH\\Documents\\NetBeansProjects\\Rushabhshah_Java_Programs\\src\\chapter_6_iONetworking\\sample11.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        System.out.println("Success");

    }
}