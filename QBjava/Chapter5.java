package QBJava;
import java.util.*;
public class Chapter5 {}

/*  
Write a multithreaded program to explain the use
of join() method

Explain use of following methods with suitable examples: isAlive(), join(), setPriority()
*/
class Multithread extends Thread
{
    public void run()
    {
        System.out.println("Rushabh ");
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("Shah");
    }
    public static void main(String args[])
    {
        Multithread obj = new Multithread();
        obj.start();
        System.out.println(obj.isAlive());
        try
        {
            obj.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        obj.setPriority(4);
        System.out.println("Priority of Multithread is: "+obj.getPriority());
    }
}

/*  
List and Explain Methods for Inter-thread communication
*/
class Customer{    
int amount=10000;    
    
synchronized void withdraw(int amount){    
System.out.println("going to withdraw...");    
    
if(this.amount<amount){    
System.out.println("Less balance; waiting for deposit...");    
try{wait();}catch(Exception e){}    
}    
this.amount-=amount;    
System.out.println("withdraw completed...");    
}    
    
synchronized void deposit(int amount){    
System.out.println("going to deposit...");    
this.amount+=amount;    
System.out.println("deposit completed... ");    
notify();    
}    
}    
    
class Test4{    
public static void main(String args[]){    
final Customer c=new Customer();    
new Thread(){    
public void run(){c.withdraw(15000);}    
}.start();    
new Thread(){    
public void run(){c.deposit(10000);}    
}.start();    
    
}}    

/* 
Write a complete multi-threaded program to meet following requirements: - Read matrix [A] m x n
- Create m number of threads
- Each thread computes summation of elements of one row, i.e. i th row of the matrix
is processed by i th thread. Where 0 <= i < m. - Print the results.
*/
class Matrix extends Thread
{
    public void run()
    {
        
    }
}

/*
 Write an application that creates and starts three threads. Each thread is instantiated from the
same class. It executes a loop with 10 iterations. Each iteration displays string "HELLO",
sleeps for 300 milliseconds. The application waits for all the threads to complete & displays
the message "Good Bye..."
*/
class Hello extends Thread
{
    String name;
    Hello(String threadname)
    {
        name=threadname;
    }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
           try
           {
              System.out.println(name+"Hello");
              sleep(300);
           }
           catch(InterruptedException e)
           {
               System.out.println("This is the error: "+e);
           }
        }
    }
    public static void main(String args[])
    {
        Hello obj = new Hello("Thread1");
        obj.start();
        Hello obj1 = new Hello("Thread2");
        obj1.start();
        Hello obj2 = new Hello("Thread3");
        obj2.start();
        try
        {
            obj.join();
            obj1.join();
            obj2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("The error is: "+e);
        }
        System.out.println("GoodBye");
    }
}

/*
Write an application that executes two threads. One thread displays "Good Morning" every
1000 milliseconds & another thread displays "Good Afternoon" every 3000 milliseconds.
Create the threads by implementing the Runnable interface.
*/
class GoodMorning implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("The error is: "+e);
            }
        }
    }
}
class GoodAfternoon implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(3000);
                System.out.println("Good Afternoon");
            }
            catch(InterruptedException e)
            {
                System.out.println("The error is: "+e);
            }
        }
    }
        public static void main(String args[])
        {
            GoodMorning gm = new GoodMorning();
            Thread t1 = new Thread(gm);
            t1.start();
            GoodAfternoon ga = new GoodAfternoon();
            Thread t2 = new Thread(ga);
            t2.start();
        }
}

/*  
Write an application that executes two threads. One thread displays "Welcome" every 1000
milliseconds & another thread displays "Good Bye" every 5000 milliseconds. Create the
threads by implementing the Runnable interface
*/
class Welcome implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                System.out.println("Welcome");
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("The error is: "+e);
            }
        }
    }
}
class GoodBye implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                Thread.sleep(5000);
                System.out.println("Good Bye");
            }
            catch(InterruptedException e)
            {
                System.out.println("The error is: "+e);
            }
        }
    }
        public static void main(String args[])
        {
            Welcome w = new Welcome();
            Thread t1 = new Thread(w);
            t1.start();
            GoodBye gb = new GoodBye();
            Thread t2 = new Thread(gb);
            t2.start();
        }
}

/*
Write a program to create two threads, one thread will print odd numbers and second thread
will print even numbers between 1 to 100 numbers
*/
class OddNumbers extends Thread
{
    String name;
    OddNumbers(String threadname)
    {
        name=threadname;
    }
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
            {
                try
                {
                    System.out.println(name+": "+i);
                    sleep(300);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Error is: "+e);
                }
            }
        }
    }
}
class EvenNumbers extends Thread
{
    String name;
    EvenNumbers(String threadname)
    {
        name=threadname;
    }
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                try
                {
                    System.out.println(name+": "+i);
                    sleep(600);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Error is: "+e);
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        OddNumbers o = new OddNumbers("Odd Number: ");
        EvenNumbers s = new EvenNumbers("Even Number: ");
        o.start();
        s.start();
    }
}

/*
Write a program to create two threads. One displays alphabets from A to Z and the other
displays number from 1 to 100.
*/
class Alphabet extends Thread
{
    String name;
    Alphabet(String threadname)
    {
        name=threadname;
    }
    public void run()
    {
        char ch;
        for(ch='A';ch<='Z';ch++)
        {
            try
            {
                System.out.println(name+": "+ch);
                sleep(100);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error: "+e);
            }
        }
    }
}
class Numbers extends Thread
{
    String name;
    Numbers(String threadname)
    {
        name=threadname;
    }
    public void run()
    {
        int i;
        for(i=1;i<=100;i++)
        {
            try
            {
                System.out.println(name+": "+i);
                sleep(10);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error: "+e);
            }
        }
    }
    
    public static void main(String args[])
    {
        Alphabet a = new Alphabet("Alphabet Thread: ");
        a.start();
        Numbers n = new Numbers("NUmbers Thread: ");
        n.start();
    }
}

/*
Write an application that read limit from user and executes two threads. One thread displays
total of first n even numbers & another thread displays total of first n odd numbers. Create the
threads by implementing the Runnable interface
*/
class oddnumbers implements Runnable
{
    public void run()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit for odd numbers: ");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                try
                {
                    System.out.println("Odd number is: "+i);
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("The error is: "+e);
                }
            }
        }
    }
}
class evennumbers implements Runnable
{
    public void run()
    {
        System.out.println("Enter the limit for even numbers: ");
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                try
                {
                    Thread.sleep(500);
                    System.out.println("Even number is: "+i);
                }
                catch(InterruptedException e)
                {
                    System.out.println("The error is: "+e);
                }
            }
        }
    }
        public static void main(String args[])
        {
            evennumbers e = new evennumbers();
            Thread t1 = new Thread(e);
            t1.start();
            oddnumbers o = new oddnumbers();
            Thread t2 = new Thread(o);
            t2.start();
        }
}

/*
Write a program to create two threads, one thread will check whether given number
is prime or not and second thread will print prime numbers between 0 to 100.
*/
class CheckPrime extends Thread
{
    public void run()
    {
       int i =0,num =0;
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       try
       {
            System.out.println("Checking prime numbers: ");
            sleep(20);
       }
       catch(Exception e)
       { }
    }
}
class PrintPrime extends Thread
{
    public void run()
    {
       int i =0,num =0;
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
          {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }
       try
       {
            System.out.println("Prime numbers from 1 to 100 are :");
            System.out.println(primeNumbers);
            sleep(500);
       }
       catch(Exception e)
       { }
    }
    
    public static void main(String args[])
    {
        CheckPrime c = new CheckPrime();
        c.start();
        PrintPrime p = new PrintPrime();
        p.start();
    }
}