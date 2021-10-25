package rushabh;
import java.io.*;
public class printstreamclass 
{
  public static void main(String args[])throws Exception{  
   FileOutputStream fout=new FileOutputStream("/home/rushabh/NetBeansProjects/io/mfile.txt");  
   PrintStream pout=new PrintStream(fout);  
   pout.println(1900);  
   pout.println("Hello Java");  
   pout.println("Welcome to Java");  
   pout.close();  
   fout.close();  
 }     
}
