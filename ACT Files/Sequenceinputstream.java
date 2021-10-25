package rushabh;
import java.io.*;
public class Sequenceinputstream 
{
  public static void main(String args[]) throws Exception 
  {
      FileInputStream input1 = new FileInputStream("/home/rushabh/NetBeansProjects/io/testout.txt");
      FileInputStream input2 = new FileInputStream("/home/rushabh/NetBeansProjects/io/testin.txt");
      SequenceInputStream inst = new SequenceInputStream(input1,input2);
      
      int j;
      while((j=inst.read())!=-1)
      {
          System.out.println((char)j);
      }
      inst.close();
      input1.close();
      input2.close();
  }
}
