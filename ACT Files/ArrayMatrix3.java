package rushabh;
import java.util.*;
public class ArrayMatrix3 
{
    public static void main(String args[])
    {
        int m,n,c,d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of row and column:");
        m=s.nextInt();
        n=s.nextInt();
        int first[][]=new int[m][n];
        System.out.println("Enter the elements of matrix: ");
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            {
                first[c][d] = s.nextInt();
            }
        }
        System.out.println("Print The Matrix: ");
        for(c=0;c<m;c++)
        {
            for(d=0;d<n;d++)
            {
                System.out.print(first[c][d] + " ");
                
            }
            System.out.println();
        }

    }
}
