package chapter_1_Basic;

import java.util.Scanner;

class Array 
{
  public static void main(String args[])
  {
      int arr[] = {10,20,30,40};
      for(int i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
  }
}

class Array2
{
    public static void main(String args[])
    {
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(i);
        }
    }
}

class Array_2x2 
{
  public static void main(String args[])
  {
    int arr[][] = {{1,2},{3,4}};
    for(int i=0;i<2;i++)
    {
        for(int j=0;j<2;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
  }
}

class Array_3x3 
{
  public static void main(String args[])
  {
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
                System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
  }   
}

class Array_2x2_Addition 
{
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      int first[][] = new int[2][2]; //1st 2x2 array
      System.out.println("Enter the elements of first array matrix: ");
      for(int c=0;c<2;c++)
      {
          for(int n=0;n<2;n++)
          {
              first[c][n]=s.nextInt();
          }
      }
      System.out.println("Enter the elements of second array matrix: ");
      int second[][] = new int[2][2]; //2nd 2x2 array
      for(int i=0;i<2;i++)
      {
          for(int j=0;j<2;j++)
          {
              second[i][j]=s.nextInt();
          }
      }
      
      System.out.println("Addition of both matrix: ");
      int third[][] = new int[2][2];
      for(int k=0;k<2;k++)
      {
          for(int r=0;r<2;r++)
          {
              third[k][r]=first[k][r]+second[k][r];
          }
      }
      for(int k=0;k<2;k++)
      {
          for(int r=0;r<2;r++)
          {
              System.out.print(third[k][r]+" ");
          }
          System.out.println();
      }
   }
}

class Array_Ascending 
{
   public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      int arr[] = new int[5];
      int i,temp=0;
      System.out.println("Enter the 5 values: ");
      for(i=0;i<arr.length;i++)
      {
         arr[i]=s.nextInt();
      }
      System.out.println("Numbers are: ");
      for(i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
      System.out.println("Numbers in acending order are like: ");
      for(i=0;i<arr.length;i++)
      {
          for(int j=i+1;j<arr.length;j++)
          {
              if(arr[i]>arr[j])
              {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
      }
      
      for(i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
  }   
}


class Array_Decending 
{ 
   public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      int arr[] = new int[5];
      int i,temp=0;
      System.out.println("Enter the 5 values: ");
      for(i=0;i<arr.length;i++)
      {
         arr[i]=s.nextInt();
      }
      System.out.println("Numbers are: ");
      for(i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
      
      System.out.println("Numbers in decending order are like: ");
      for(i=0;i<arr.length;i++)
      {
          for(int j=i+1;j<arr.length;j++)
          {
              if(arr[i]<arr[j])
              {
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
          }
      }
      
      for(i=0;i<arr.length;i++)
      {
          System.out.println(arr[i]);
      }
  }
}





