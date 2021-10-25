package rushabh;
import java.io.*;
public class chararraywriterclass 
{
  public static void main(String args[])throws Exception{    
          CharArrayWriter out=new CharArrayWriter();    
          out.write("Welcome to javaTpoint");    
          FileWriter f1=new FileWriter("/home/rushabh/NetBeansProjects/io/A.txt");    
          FileWriter f2=new FileWriter("/home/rushabh/NetBeansProjects/io/B.txt");    
          FileWriter f3=new FileWriter("/home/rushabh/NetBeansProjects/io/C.txt");    
          FileWriter f4=new FileWriter("/home/rushabh/NetBeansProjects/io/D.txt");    
          out.writeTo(f1);    
          out.writeTo(f2);    
          out.writeTo(f3);    
          out.writeTo(f4);    
          f1.close();    
          f2.close();    
          f3.close();    
          f4.close();    
          System.out.println("Success...");    
         }    
}
