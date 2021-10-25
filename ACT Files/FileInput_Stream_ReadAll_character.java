package rushabh;
import java.io.FileInputStream;
public class FileInput_Stream_ReadAll_character 
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream fin = new FileInputStream("/home/rushabh/NetBeansProjects/io/testout.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
