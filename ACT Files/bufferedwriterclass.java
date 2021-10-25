package rushabh;
import java.io.*;
public class bufferedwriterclass 
{
  public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("/home/rushabh/NetBeansProjects/io/testout.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to javaTpoint.");  
    buffer.close();  
    System.out.println("Success");  
    }     
}
