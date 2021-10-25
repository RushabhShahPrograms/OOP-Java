package rushabh;
public class Pattern11 
{
  public static void main(String args[])
  {
      int r,c,t;
      for(r=0;r<=5;r++)
      {
          for(c=0;c<r;c++)
          {
              System.out.print(" ");
          }
          for(t=5;t>r;t--)
          {
              System.out.print("* ");
          }
          System.out.println();
      }
  }
}
/*
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
*/