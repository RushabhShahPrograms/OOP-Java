package chapter_4_package_exception_handling;
class nested_try_and_catch{}


class Multiple_Catch
{
  public static void main(String args[])
  {
      try
      {
          int a[] = new int [5];
          a[5] = 30/0;
      }
      catch(ArithmeticException e)
      {
          System.out.println(e);
      }
      catch(ArrayIndexOutOfBoundsException e1)
      {
          System.out.println(e1);
      }
      catch(Exception e3)
      {
          System.out.println(e3);
      }
      System.out.println("Exception...");
  }
}

class Multiple_Try
{
    public static void main(String args[])
    {
        try
        {
            try
            {
                System.out.println("Going to divided");
                int b = 39/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
            try
            {
                int a[] = new int[5];
                a[6] = 4;
            }
            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println(e1);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}