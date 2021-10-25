package rushabh;
public class MatrixArray 
{
    public static void main(String args[])
    {
      int mat[][] = {{ 1, 2},{ 4, 5}};
      int i,j;
      
      for(i=0;i<2;i++)
      {
          for(j=0;j<2;j++)
          {
              System.out.print(mat[i][j] + " ");
          }
          System.out.println();
      }
    }
}
