package rushabh;
public class Pattern12 
{
    public static void main(String args[])
    { 
       int r,c,t;
        for(r=0;r<=4;r++)
        {
            for(c=4;c>r;c--)
            {
                System.out.print(" ");
               
            }
            for(t=0;t<=r;t++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(r=0;r<=5;r++)
      {
          for(c=0;c<r;c++)
          {
              System.out.print(" ");
          }
          for(t=4;t>r;t--)
          {
              System.out.print(" *");
          }
          System.out.println();
      }
    }
    
}
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * *
  * * *
   * *
    *
*/