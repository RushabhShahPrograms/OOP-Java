package rushabh;
import java.util.*;
public class Matrix_2X2 
{
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      int m,n;
      System.out.println("Enter row and column of matrix: ");
      m=s.nextInt();
      n=s.nextInt();
      int first[][] = new int[m][n];
      int second[][] = new int[m][n];
      int sum[][] = new int[m][n];
      int i,j;
      
      System.out.println("Enter First Matrix: ");
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
              first[i][j] = s.nextInt();
          }
      }
      
      System.out.println("Enter Second Matrix: ");
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
              second[i][j] = s.nextInt();
          }
      }
      
      System.out.println("Summation of 2x2 Matrix: ");
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
              sum[i][j] = first[i][j]+second[i][j];
              System.out.print(sum[i][j]+ " ");
          }
          System.out.println();
      }
  }
}
