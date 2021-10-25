/*
Write a method for computing X^y doing repetitive multiplication. X and y are of
type integer and are to be given as command line arguments. Raise and handle
exception(s) for invalid values of X and y.
 */
/*
For now I have done by command line input.
*/
package rushabh.practicesession;
import java.util.*;
public class exeption2 
{
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      int x,y,mul;
      try
	{
            System.out.println("Enter value of x and y");
            x=s.nextInt();
            y=s.nextInt();
            mul = 1;
            for(int i=0;i<y;i++)
            {
                mul = mul*x;
            }
            System.out.println(x+"^"+y+" : " + mul);
	}
       catch(NumberFormatException e)
	{
            System.out.println("Exception : "+e);
	}
  }
}
