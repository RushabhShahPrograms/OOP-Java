package rushabh;
public class numberformat 
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
          System.out.println("Number format exception");
      }
  }
}
