package rushabh;
import java.util.*;
public class Addititonofarray 
{
  public static void main(String args[])
  {
      int m,n;
      int i,j;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter row and column of matrix: ");
      m=s.nextInt();
      n=s.nextInt();
      int first[][] = new int[m][n];
      int second[][] = new int[m][n];
      int addition[][] = new int [m][n];
      System.out.println("Enter the First Matrix: ");
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
              first[i][j]=s.nextInt();
          }
      }
      System.out.println("Enter the Second Matrix: ");
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
              second[i][j]=s.nextInt();
          }
      }
      System.out.println("-----------------------------");
      System.out.println("Addition of 2 X 2 Matrix: ");
      for(i=0;i<m;i++)
      {
          for(j=0;j<n;j++)
          {
              addition[i][j] = first[i][j]+second[i][j];
              System.out.print(addition[i][j] + "  ");
          }
          System.out.println();
      }
      
  }
  
}
