package rushabh;
import java.io.*;
public class throwdemo 
{
  static void validate(int age)
  {
      if(age<18)
      {
          throw new ArithmeticException("not valid");
      }
      else
      {
          System.out.println("Valid");
      }
  }
      public static void main(String args[])
      {
          validate(19);
      }
}
