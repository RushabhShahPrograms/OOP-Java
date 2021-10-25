package rushabh;
public class Pattern10 
{
    public static void main(String args[])
    {
        int r,c,t;
        for(r=0;r<=4;r++)
        {
            for(c=5;c>r;c--)
            {
                System.out.print(" ");
               
            }
            for(t=0;t<=r;t++)
            {
                System.out.print("* ");
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
*/