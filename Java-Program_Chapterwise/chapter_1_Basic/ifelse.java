package chapter_1_Basic;
import java.util.*;
class ifelse 
{
  public static void main(String args[]) 
  {
      int a=10,b=5;
      if(a>b)
      {
          System.out.println("A is big");
      }
      else if(a<b)
      {
          System.out.println("B is big");
      }
      else
      {
          System.out.println("Both are same");
      }
  }
}

class if_else_number_sorting
{
    public static void main(String args[])
    {
        int p=0,z=0,n=0,c=1,i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter total 6 random numbers to separate the forms: ");
        while(c<=6)
        {
            i=s.nextInt();
            if(i==0)
            {
                z+=1;
            }
            else if(i<0)
            {
                n+=1;
            }
            else if(i>0)
            {
                p+=1;
            }
            c+=1;
        }
        System.out.println("Positive numbers: "+p+"\nNegative Numbers: "+n+"\nZeros: "+z);
    }
}

class ifelse_LeapYear
{
    public static void main(String args[])
    {
        System.out.println("Enter the year");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
    }
}

class ifelse_OddEven
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number for odd even: ");
        int a = s.nextInt();
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}