package rushabh;

public class ArrayMAtrix2 
{
    public static void main(String args[])
    {
      int arr[][] = {{1,2,3},{2,4,6},{5,8,9}};
      int i,j;
      for(i=0;i<3;i++)
      {
          for(j=0;j<3;j++)
          {
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
        
    }
}
