package chapter_2_ClassAndObject;
import java.util.*;
class Class_And_Object 
{
  int id = 25;
  String name = "Rushabh";
  
  public static void main(String args[])
  {
      Class_And_Object e = new Class_And_Object();
      System.out.println("ID: "+e.id);
      System.out.println("Name: "+e.name);
  }
}

class Reference_Variable
{
    int id;
    String name;
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Reference_Variable e = new Reference_Variable();
        System.out.println("Enter the id: ");
        e.id = s.nextInt();
        System.out.println("Enter the name: ");
        e.name = s.next();
        System.out.println("reference variable id: "+e.id);
        System.out.println("reference variable name: "+e.name);
    }
}


class Method
{
    int rollno;
    String name;
    
    void get(int r, String n)
    {
        rollno = r;
        name = n;
    }
    void put()
    {
        System.out.println(rollno+" "+name);
    }
    
    public static void main(String args[])
    {
        Method e = new Method();
        e.get(16,"Rushabh");
        e.put();
    }
}


class Accessing_Class_Member
{
    int h,w;
    void area()
    {
        int r = h*w;
        System.out.println("Area is: "+r);
    }
    
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbers for multiplication: ");
        Accessing_Class_Member e = new Accessing_Class_Member();
        e.h=s.nextInt();
        e.w=s.nextInt();
        e.area();
    }
}


class Creating_Multiple_Object
{
    int rollno;
    String name;
    
    void get(int r, String n)
    {
        rollno = r;
        name = n;
    }
    void put()
    {
        System.out.println(rollno+" "+name);
    }
    
    public static void main(String args[])
    {
        
         Creating_Multiple_Object obj = new Creating_Multiple_Object();
         Creating_Multiple_Object obj1 = new Creating_Multiple_Object();
         obj.get(11,"Rushabh");
         obj1.get(22, "Shah");
         obj.put();
         obj1.put();
    }
}
