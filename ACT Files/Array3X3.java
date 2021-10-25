package rushabh;
import java.util.*;
public class Array3X3 
{
    public static void main(String args[])
    {
        int m,n,c,d;
        Scanner s = new Scanner(System.in);
    /*    System.out.println("Enter number of row and column:");
        m=s.nextInt();
        n=s.nextInt(); */
        int first[][]=new int[3][3];
        System.out.println("Enter the elements of 3 X 3 matrix: ");
        for(c=0;c<3;c++)
        {
            for(d=0;d<3;d++)
            {
                first[c][d] = s.nextInt();
            }
        }
        System.out.println("Print The Matrix: ");
        for(c=0;c<3;c++)
        {
            for(d=0;d<3;d++)
            {
                System.out.print(first[c][d] + " ");
                
            }
            System.out.println();
        }
    }
}
