package rushabh;
import java.io.*;
public class Bufferedreaderclass 
{
  public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("/home/rushabh/NetBeansProjects/io/testout.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          System.out.println();
          br.close();    
          fr.close();    
    }       
}
