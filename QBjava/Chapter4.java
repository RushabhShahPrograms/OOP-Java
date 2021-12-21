package QBJava;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class Chapter4 {}

/*  
Explain the following keywords with example:
1. throw
2. throws

Explain use of throw in exception handling with example
*/
class Throw
{
    static void validate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not valid");
        }
        else
        {
            System.out.println("vote");
        }
    }
        public static void main(String args[])
        {
            validate(15);
        }
}

class Throws
{
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main.");
        }
    }
}

//Explain use of finally in exception handling
class Finally
{
    public static void main(String args[])
    {
        try
        {
            int data=25/0;
            System.out.println("data");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Always executed");
        }
    }
}

//Give output of the following program for value of y=0 and y=2: [LJIET]
class Testt  //y=0
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("calling method a");
            a();
            System.out.println("return from method a");
        }
        catch(ArithmeticException e)
        {
            System.out.println("main: catch");
        }    
        finally
        {
            System.out.println("main: finally");
        }
    }
    public static void a()
    {
        try
        {
            int x=8,y=0;
            int z=x/y;
            System.out.println("value of z="+z);
        } 
        catch(NumberFormatException e)
        {
            System.out.println("method a:catch");
        } 
        finally 
        {
            System.out.println("method a:finally");
        }
    }
}
class Testt1  //y=2
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("calling method a");
            a();
            System.out.println("return from method a");
        }
        catch(ArithmeticException e)
        {
            System.out.println("main: catch");
        }    
        finally
        {
            System.out.println("main: finally");
        }
    }
    public static void a()
    {
        try
        {
            int x=8,y=2;
            int z=x/y;
            System.out.println("value of z="+z);
        } 
        catch(NumberFormatException e)
        {
            System.out.println("method a:catch");
        } 
        finally 
        {
            System.out.println("method a:finally");
        }
    }
}

/*  
Consider the following code fragment:
try{
statement1;
statement2;
}
catch (Exception1 ex1){
}
finally{
statement4;
}
statement5;
1. Which statements will execute if no exception occurs?
Ans. statement 1,2,4,5
2. Which statements will execute if Exception1 occurs in statement2?
Ans. statement 1,4,5
*/

/*Write a JAVA program to generate and
handle division by zero arithmetic exception.
*/

class Arith_Exception
{
    public static void main(String args[])
    {
        try
        {
            int data=25/0;
            System.out.println("data");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}

/* Write an application that generates custom exception if
any value from its command line arguments is negative 
*/
class negativeNumberException extends Exception
{
    negativeNumberException(String s)
    {
        super(s);
    }
}
class cst
{
    static void checkNum(int n)throws negativeNumberException
    {
        if(n<0)
        {
            throw new negativeNumberException("not valid number");
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
class greaterNumberException extends Exception
{
    greaterNumberException(String s)
    {
        super(s);
    }
}
class stm2
{
    static void checkNum(int n)throws greaterNumberException
    {
        if(n>100)
        {
            throw new greaterNumberException("number is greater then 100");
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
class invalidNumberException extends Exception
{
	invalidNumberException()
	{
		System.out.println("Power Is Negative ");
	}
}
class Powers
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
                throw new invalidNumberException();
            }
	}
	catch(invalidNumberException i)
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

/*
Write an application that searches through its command-line argument. If an argument is
found that does not begin with and upper case letter, display error message and terminate.
*/


/*  
It is required to maintain and process the status of total 9 resources. The status value is to be
stored in an integer array of dimension 3x3. The valid status of a resource can be one of the
2 followings: free: indicated by integer value 0
occupied: indicated by integer value 1
inaccessible: indicated by integer value 2
Declare a class called ResourcesStatus, having data member called statusRef, referring to a
two dimensional array (3x3) of integers to be used to refer to the above mentioned status
values.
Define a member method called processStausCount that counts and displays total number of
free resources, total number of occupied resources and total number of inaccessible resources.
The exception to be raised and handled if total number of occupied resources exceeds total
number of free resources. The handler marks status of all inaccessible resources as free.
Accept initial status values from command line arguments and initialize the array. Raise and
handle user defined exception if invalid status value given.
*/

/*  
Write a program to create user define exception MyException. Define a class ExceptionDemo
that has a method named compute( ) which throws a MyException object, when compute( )’s
integer parameter is greater than 10.
*/
class MyException extends Exception
{
	MyException()
	{
		System.out.println("number is greater then 10");
	}

    MyException(String not_valid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class ExceptionDemo
{
    void compute(int n) throws MyException
    {
            if(n>10)
            {
                throw new MyException("Not valid");
            }
            else
            {
                System.out.println("Good");
            }
    }
    public static void main(String args[]) throws MyException
    {
        ExceptionDemo e = new ExceptionDemo();
        System.out.println("enter a number: ");
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        e.compute(num);
    }
}

