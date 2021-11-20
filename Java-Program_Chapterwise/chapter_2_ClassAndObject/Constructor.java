package chapter_2_ClassAndObject;
import java.util.*;
class Constructor 
{}

class Default_Constructor
{
  int a=10,b=5;
  Default_Constructor()
  {
      System.out.println(a);
      System.out.println(b);
  }
  
  public static void main(String args[])
  {
      Default_Constructor obj = new Default_Constructor();
  }
}

class Parameterized_Constructor
{
    int id;
    String name;
    Parameterized_Constructor(int i,String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    
    public static void main(String args[])
    {
        Parameterized_Constructor PC = new Parameterized_Constructor(16,"Rushabh");
        PC.display();
    }
}

class Constructor_Overloading
{
    int id,age;
    String name;
    
    Constructor_Overloading(int i,String n)
    {
        id=i;
        name=n;
    }
    Constructor_Overloading(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age);
    }
    
    public static void main(String args[])
    {
        Constructor_Overloading s1 = new Constructor_Overloading(16,"Rushabh");
        Constructor_Overloading s2 = new Constructor_Overloading(27,"Rushabh",20);
        s1.display();
        s2.display();
    }
}
