package chapter_1_Basic;
import java.util.*;

//Operators

class Arithmetic_Operator 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c;
        
        c=a+b;
        System.out.println("Addition is: "+c);
        c=a-b;
        System.out.println("Subtraction is: "+c);
        c=a*b;
        System.out.println("Multiplication is: "+c);
        c=a/b;
        System.out.println("Division is: "+c);
        c=a%b;
        System.out.println("Modulo is: "+c);
    }
}

class Assignment_Operator 
{ 
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        
        a+=b;
        System.out.println("Addition is: "+a);
        a-=b;
        System.out.println("Subtraction is: "+a);
        a*=b;
        System.out.println("Multiplication is: "+a);
        a/=b;
        System.out.println("Division is: "+a);
        a%=b;
        System.out.println("Modulo is: "+a);
        a&=b;
        System.out.println("And is: "+a);
        a^=b;
        System.out.println("Or is: "+a);
        a|=b;
        System.out.println("Not is: "+a);
        a<<=b;
        System.out.println("Left Shift is: "+a);
        a>>=b;
        System.out.println("Right Shift is: "+a);
        a>>>=b;
        System.out.println("Right Most Shift is: "+a);
    }
}


class Bitwise_Operator 
{
  public static void main(String args[])
  {
      int a=245,w=3567;
      System.out.println("Bitwise Complement "+(~a));
      w=w<<a;
      System.out.println("Left Shift: "+w);
      w=w>>a;
      System.out.println("Right Shift: "+w);
      w=w>>>a;
      System.out.println("Unsigned Right Shift: "+w);
      w=w&a;
      System.out.println("Bitwise And: "+w);
      w=w^a;
      System.out.println("Bitwise exclusive OR: "+w);
  }
}

class Instanceof_Operator 
{
  public static void main(String args[])
  {
    String str = "Rushabh Shah";
    boolean result;
    result = str instanceof String;
    System.out.println("Is str an object of String? " + result);
  }
}


class Logical_Operator 
{
  public static void main(String args[])
  {
      // && operator
    System.out.println((5 > 3) && (8 > 5));
    System.out.println((5 > 3) && (8 < 5));

    // || operator
    System.out.println((5 < 3) || (8 > 5));
    System.out.println((5 > 3) || (8 < 5));
    System.out.println((5 < 3) || (8 < 5));

    // ! operator
    System.out.println(!(5 == 3));
    System.out.println(!(5 > 3));
  }
}

class Relational_Operator 
{
   public static void main(String args[])
   {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the two number: ");
       int a = s.nextInt();
       int b = s.nextInt();
       
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
       
       System.out.println("Again enter two numbers: ");
       int c = s.nextInt();
       int d = s.nextInt();
       
       if(c==d)
       {
           System.out.println("Both are same");
       }
       else if(c!=d)
       {
           System.out.println("Bot are not same");
       }
       
   }
}
