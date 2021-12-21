package QBJava;
import java.util.*;
class Chapter1 
{}

class PrintPrimeNumbers1to100
{
    public static void main(String args[])
    {
        int temp=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    temp = temp + 1;
                }
            }
            if(temp==0)
            {
                System.out.println(i);
            }
            else
            {
                temp=0;
            }
        }
    }
}

class CheckPrimeNumbers
{
    public static void main(String args[])
    {
        int temp=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to check prime or not: ");
        int num=s.nextInt();
        for(int i=2;i<=num-1;i++)
        {
            if(num%i==0)
            {
                temp = temp+1;
            }
        }
            if(temp==0)
            {
                System.out.println(num+" prime");
            }
            else
            {
                System.out.println(num+" Not prime");
            }
    }
}

//Create two dimensional array named ‘marks’ and initialize it
class Mark
{
    public static void main(String args[])
    {
        int marks[][] = {{1,2},{3,4}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }  
    }
}

//Write a program which takes five numbers as command line argument from user, store them
//in one dimensional array and display count of negative numbers.
class One_D_Array
{
    public static void main(String args[])
    {
        int[] arr = new int[100];
        int n=0,i;
        for(i=0;i<5;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Five Numbers are: ");
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		for(i=0;i<5;i++)
		{
			if(arr[i]<0)
			{
				n++;
			}
		}
        System.out.println("Total negative:"+n);  
    }
}

//Write a program to take three numbers as command line arguments. Display the maximum among them
class Maximum
{
    public static void main(String args[])
    {
          System.out.println("Enter the three number find maximum: ");
          int a = Integer.parseInt(args[0]);
	  int b = Integer.parseInt(args[1]);
	  int c = Integer.parseInt(args[2]);
	  if(a>b && a>c)
	  {
	    System.out.println("A is big");
	  }
	  else if(b>a && b>c)
	  {
	    System.out.println("B is big");
	  }
	  else
	  {
	    System.out.println("C is big");
	  }
    }
}

//Write a program that creates and initializes a four integer element array. 
//Calculate and display the average of its values.

class AverageArray
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[4];
        int avg,sum=0;
        System.out.println("Enter the 4 integer: ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
            sum = sum + arr[i];
        }
        avg = sum/4;
        System.out.println("Avg: "+avg);
    }
}
//Write a program to count occurrence of character in a string

class CharacterCount
{
    public static void main(String args[])
    {
        String str;
        int i, length, counter[] = new int[256];
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        str = scanner.nextLine();
        length = str.length();
        // Count frequency of every character and store
        // it in counter array
        for (i = 0; i < length; i++)
        {
            counter[(int) str.charAt(i)]++;
        }
        // Print Frequency of characters
        for (i = 0; i < 256; i++)
        {
            if (counter[i] != 0)
            {
                System.out.println((char) i + " --> " + counter[i]);
            }
        }
    }
}

//Write a java program which reads a line from -commandline and prints that line in reverse.
class Reverse
{
	public static void main(String args[])
        {
		String name = args[0];
		int len = name.length();
		String rev = " ";
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}
}

//Write a java program to do sum of command line argument passed two Double numbers.
class Sum
{
    public static void main(String args[])
	{
		System.out.println("Enter the two numbers: ");
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double s = a+b;
		System.out.println("Sum of two Double numbers is: "+s);
	}
}

//Write a method for computing first n terms of Fibonacci sequence. 
//Define method main taking value of n as command line argument and calling the method
class Fibonacci_CLA
{
	public static void main(String args[])
	{
		int n,c,i,a=0,b=1;
		System.out.println("Enter the nth term: ");
		n=Integer.parseInt(args[0]);
		System.out.print(a+" "+b);
		for(i=2;i<n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
//Write a program to check whether the input number is a palindrome or not without using
//reverse() method of String class? E.g. a palindrome is a sequence of characters/numbers
//which reads the same backward as forward like 323, 45654 etc.

//Write a program to find whether the given string is palindrome or not.
class Palindrome
{
    public static void main(String args[])
    {
        System.out.println("Enter the number to check the number is palindrome or not: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n,r=0;
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

//Write a JAVA program to implement the Fibonacci series using for loop control structure
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
           System.out.print(" "+n1);
           int n3 = n1 + n2;
           n1 = n2;
           n2 = n3;
        }
    }
}

/* Write an application that generates custom exception if
any value from its command line arguments is negative 
*/
class NegativeNumberException extends Exception
{
    NegativeNumberException(String s)
    {
        super(s);
    }
}
class cstm
{
    static void checkNum(int n)throws NegativeNumberException
    {
        if(n<0)
        {
            throw new NegativeNumberException("not valid number");
        }
        else
        {
            System.out.println(+n+" is not negative");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(args[0]);
            checkNum(num);
        }
        catch(Exception m)
        {
            System.out.println("Exception occured: "+m);
        }
    }
}

/* Write an application that generates custom exception if
any value entered from command line arguments is greater than 100
*/
class GreaterNumberException extends Exception
{
    GreaterNumberException(String s)
    {
        super(s);
    }
}
class cstm2
{
    static void checkNum(int n)throws GreaterNumberException
    {
        if(n>100)
        {
            throw new GreaterNumberException("number is greater then 100");
        }
        else
        {
            System.out.println(+n+" is not big then 100");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            System.out.println("Enter a number: ");
            int num = Integer.parseInt(args[0]);
            checkNum(num);
        }
        catch(Exception m)
        {
            System.out.println("Exception occured: "+m);
        }
    }
}

/* Write a method for computing XY doing repetitive multiplication. X and y are of type integer
and are to be given as command line arguments. Raise and handle exception(s) for invalid
values of X and y
*/

class InvalidNumberException extends Exception
{
	InvalidNumberException()
	{
		System.out.println("Power Is Negative ");
	}
}
class power
{
   public static void main(String a[])
   {
    int x=Integer.parseInt(a[0]);
    int y=Integer.parseInt(a[1]);
    int temp;
    try
    {
        if(y>=0)
	{
            if(y==0)
            {
                System.out.println(+x+" Power "+y+" is: "+1);
            }
            else
            {
		temp=x; 
		int i;
		for(i=1;i<y;i++)
		{
                    temp=temp*x;	
                }
                System.out.println(+x+" Power "+y+" is: "+temp);
            }
        }
	else if(y<0)
	{
            throw new InvalidNumberException();
	}
    }
    catch(InvalidNumberException i)
    {
	double temp1;
	int y1=(-y);
	temp1=1/(double)x;
	for(int j=1;j<y1;j++)
	{
            temp1=temp1*(1/(double)x);
	}
	System.out.println(+(double)x+" Power "+y+" is: "+temp1);
    }
    }
}

