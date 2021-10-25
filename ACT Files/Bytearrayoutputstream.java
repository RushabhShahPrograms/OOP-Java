package rushabh;
import java.io.*;
public class Bytearrayoutputstream
{
    public static void main(String args[]) throws Exception
    {
        FileOutputStream fout1 = new FileOutputStream("/home/rushabh/NetBeansProjects/io/f1.txt");
        FileOutputStream fout2 = new FileOutputStream("/home/rushabh/NetBeansProjects/io/f2.txt");
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);
        bout.close();
        System.out.println("Success...");
    }
                
}
