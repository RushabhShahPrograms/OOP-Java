package rushabh.practicesession;
class MyException extends Exception 
{
  public MyException(String str)
  {
     super(str);
  }
}

class ExceptionDemo
{
     
    static void compute(double n) throws MyException
    {
      if(n>10)
      {
          throw new MyException("Number is greater than 10");
      }
      else
      {
          System.out.println("Number is in the range");
      }
    }
    
    public static void main(String args[])
    {
         try
         {
             compute(3);
         }
         catch(MyException ex)
         {
             System.out.println(ex);
         }
    }
}
