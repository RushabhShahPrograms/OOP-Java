package chapter_1_Basic;
import java.util.*;
class Loops_Special_Programs 
{
  public static void main(String args[])
  {
      //krishnamurthy number
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number to find the krishnamurthy number: ");
      int num = s.nextInt();
      int temp,sum=0,fact;
      temp=num;
      while(temp>0)
      {
          int digit = temp%10;
          fact=1;
          for(int i=digit;i>=1;i--)
          {
              fact = fact * i;
          }
          sum = sum + fact;
          digit = digit / 10;
      }
      if(sum == num)
      {
          System.out.println("Krishnamurthy number");
      }
      else
      {
          System.out.println("Not Krishnamurthy number");
      }
  }
}

class Factorial
{
    public static void main(String args[])
    {
        int f=1,t;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        int a = s.nextInt();
        t=a;
        while(a>0)
        {
            f = f*a;
            a = a-1;
        }
        System.out.println("Factorial of "+t+" is: "+f);
    }
}

class Factors
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to find factors of it: ");
        int i = s.nextInt();
        int j=1;
        while(j<=i)
        {
            if(i%j==0)
            {
                System.out.println(j);
            }
            j += 1;
        }
    }
}

class Multiplication_Table
{
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number to find table of it: ");
      int a = s.nextInt();
      for(int i=1;i<1111111111;i++)
      {
          System.out.println(a+" * "+i+" : "+(a*i));
      }
  }
}

class Armstrong
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check armstrong: ");
        int num = s.nextInt();
        int sum = 0;
        int temp = num;
        while(temp>0)
        {
            int digit = temp%10;
            sum = sum +digit*digit*digit;
            temp = temp/10;
        }
        if(num == sum)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong number");
        }
    }
}

class Reverse
{
    public static void main(String args[])
    {
        int num = 1234;
        int r = 0;
        while(num!=0)
        {
            int digit = num % 10;
            r = r*10+digit;
            num = num/10;
        }
        System.out.println("Reversed number is: "+r);
    }
}

class Palindrome
{
    public static void main(String args[])
    {
        System.out.println("Enter the number to check the number is palindrome or not: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int r=0;
        while(n>0)
        {
            int digit = n%10;
            r=r*10+digit;
            n = n/10;
        }
        if(temp==r)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
    }
}

class Prime 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to check prime or not: ");
        int num = s.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) 
        {
            if (num % i == 0) 
            {
              flag = true;
              break;
            }
        }

        if (!flag)
        {
        System.out.println(num + " is a prime number.");
        }
        else
        {
        System.out.println(num + " is not a prime number.");
        }
    }
}

class Fibonacci
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        int n1=0,n2=1;
        for (int i = 1; i <= n; ++i) 
        {
           System.out.println(n1);
           int n3 = n1 + n2;
           n1 = n2;
           n2 = n3;
        }
    }
}