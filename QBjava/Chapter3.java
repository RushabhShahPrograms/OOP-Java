package QBJava;
import java.util.*;
class Chapter3 {}

//Explain dynamic method dispatch with example
class Dynamic_Method
{
    void draw()
    {
        System.out.println("Draw");
    }
}
class Dynamis_Method extends Dynamic_Method
{
    void draw()
    {
        System.out.println("Draw");
    }
}
class Dynamis_Method1 extends Dynamic_Method
{
    void draw()
    {
        System.out.println("Dynamis1");
    }
    
    public static void main(String args[])
    {
        Dynamic_Method dm;
        dm=new Dynamis_Method();
        dm.draw();
        dm=new Dynamis_Method1();
        dm.draw();
    }
}

//Write a program which shows an example of function overriding.
//Explain method overriding with example.

class Method_Override
{
    void run()
    {
        System.out.println("Running");
    }
}
class Method_Override1 extends Method_Override
{
    void run()
    {
        System.out.println("run");
    }
    
    public static void main(String args[])
    {
        Method_Override1 obj = new Method_Override1();
        obj.run();
    }
}

//What is polymorphism? Explain static and dynamic binging with example
class Poly{}

class Static
{
    private void eat()
    {
        System.out.println("Dog");
    }
    public static void main(String args[])
    {
        Static obj = new Static();
        obj.eat();
    }
}

class Dynamic
{
    void eat()
    {
        System.out.println("Hello");
    }
}
class Dynamic1 extends Dynamic
{
    void eat()
    {
        System.out.println("Hello java");
    }
    public static void main(String args[])
    {
        Dynamic obj = new Dynamic1();
        obj.eat();
    }
}

/* The abstract Vegetable class has three subclasses named Potato, Brinjal and Tomato. Write an
application that demonstrates how to establish this class hierarchy. Declare one instance
variable of type String that indicates the color of a vegetable. Create and display instances of
these objects. Override the toString() method of Object to return a string with the name of the
vegetable and its color
*/
abstract class Vegetable
{
    public String color;
}
class Potato extends Vegetable
{
    public String toString()
    {
        color = "Brown";
        return "Potato color: "+this.color;
    }
}
class Brinjal extends Vegetable
{
    public String toString()
    {
        color = "Purple";
        return "Brinjal color: "+this.color;
    }
}
class Tomato extends Vegetable
{
    public String toString()
    {
        color = "Red";
        return "Tomato color: "+this.color;
    }
    
    public static void main(String args[])
    {
        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();
        
        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }
}

/* Write a program that illustrates interface inheritance. Interface P is extended by P1
And P2. Interface P12 inherits from both P1 and P2.Each interface declares one constant and
one method. Class Q implements P12.Instantiate Q and invokes each of its methods. Each
method displays one of the constants
*/
interface P
{
    int p = 1;
    void displayp();
}
interface P1 extends P
{
    int p1 = 2;
    void displayp1();
}
interface P2 extends P
{
    int p2 = 3;
    void displayp2();
}
interface P12 extends P1,P2
{
    int p12 = 4;
    void displayp12();
}
class Q implements P12
{
    public static final int q = 5;
    public void displayp12()
    {
        System.out.println("P12: "+p12);
    }
    public void displayp2()
    {
        System.out.println("P2: "+p2);
    }
    public void displayp1()
    {
        System.out.println("P1: "+p1);
    }
    public void displayp()
    {
        System.out.println("P12: "+p);
    }
    public void displaypq()
    {
        System.out.println("Q: "+q);
    }
    
    
    public static void main(String args[])
    {
        Q obj = new Q();
        obj.displayp();
        obj.displayp1();
        obj.displayp2();
        obj.displayp12();
        obj.displaypq();
    }
}

/* The Transport interface declares a deliver() method. The abstract class Animal is the
superclass of the Tiger, Camel, Deer and Donkey classes. The Transport interface is
implemented by the Camel and Donkey classes. Write a test program that initialize an array
of four Animal objects. If the object implements the Transport interface, the deliver() method
is invoked 
*/
interface Transport
{
    void deliver();
}
abstract class Animal
{
    abstract void show();
}
class Tiger extends Animal
{
    public void show()
    {
        System.out.println("Tiger is in the show");
    }
}
class Camel extends Animal implements Transport
{
    public void show() {}
    public void deliver()
    {
        System.out.println("Camel is in deliver method");
    }
}
class Deer extends Animal
{
    public void show()
    {
        System.out.println("Deer is in the show");
    }
}
class Donkey extends Animal implements Transport
{
    public void show() {}
    public void deliver()
    {
        System.out.println("Donkey is in deliver method");
    }
    
    public static void main(String args[])
    {
        Tiger t = new Tiger();
        t.show();
        Camel c = new Camel();
        c.deliver();
        Donkey d = new Donkey();
        d.deliver();
        Deer de = new Deer();
        de.show();
    }
}

/* Explain single level and multiple inheritances in java. Write a program to demonstrate
combination of both types of inheritance as shown in figure 1. i.e. hybrid inheritance .

(A,B)->C->D
*/
interface A
{ 
   void show();
}
interface B
{
    void show();
}
class C implements A,B
{
    public void show()
    {
        System.out.println("C");
    }
}
class Hybrid_D extends C
{
    public void display()
    {
        System.out.println("D");
    }
    
    public static void main(String args[])
    {
        C c = new C();
        c.show();
        Hybrid_D d = new Hybrid_D();
        d.display();
    }
}

/* Write a program to demonstrate the multipath inheritance for the classes having relations as
shown in figure 2 A-> (B, C) ->D 
*/
interface M_a
{
    void show();
}
interface M_b extends M_a
{
    void show();
}
class M_c implements M_a
{
    public void show()
    {
        System.out.println("C");
    }
}
class M_d extends M_c implements M_b
{
    public void show()
    {
        System.out.println("D");
    }
    public static void main(String args[])
    {
        M_d d = new M_d();
        d.show();
        M_c c = new M_c();
        c.show();
    }
}

/* 
Declare a class called Book having book title & author name as members. Create a sub-class
of it, called BookDetails having price & current stock of book as members. Create an array
for storing details of n books. Define methods to achieve following: - Initialization of members
- To query availability of a book by author name / book title
- To update stock of a book on purchase and sell
Define method main to show usage of above methods 
*/
class Book
{
 String BookTitle,AuthorName;   
}
class BookDetails extends Book
{
    int price,currentstock;
}
class GetBookDetails extends BookDetails
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        GetBookDetails g = new GetBookDetails();
        System.out.println("Enter total number of books: ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter details book number: "+i);
            System.out.println("Enter booktitle: ");
            g.BookTitle=s.next();
            System.out.println("Enter name of author: ");
            g.AuthorName=s.next();
            System.out.println("Enter price of the book: ");
            g.price=s.nextInt();
            System.out.println("Enter the total stock of it: ");
            g.currentstock=s.nextInt();
        }
        System.out.println("Search the book according to 1)BookTitle or 2)Author: ");
        int x = s.nextInt();
        switch(x)
        {
            case 1:
             System.out.println("Enter BookTitle: ");
             g.BookTitle=s.next();
             System.out.println("Name of book is: "+g.BookTitle+"\nName of Author: "
                     +g.AuthorName+"\nBook Price: "+g.price+"\nStock of Book: "+g.currentstock);
             break;
            case 2:
                System.out.println("Enter Author name: ");
                g.AuthorName=s.next();
                System.out.println("Name of book is: "+g.BookTitle+"\nName of Author: "
                     +g.AuthorName+"\nBook Price: "+g.price+"\nStock of Book: "+g.currentstock);
                break;
        }
        //sell and purchase
    }
}

/*  
Write a java program to explain runtime polymorphism using interfaces
*/
interface shape
{
    public void shape();
}
class Rect implements shape
{
    public void shape()
    {
        System.out.println("It is rectangle");
    }
}
class Cir implements shape
{
    public void shape()
    {
        System.out.println("It is circle");
    }
    
    public static void main(String args[])
    {
        shape s;
        s = new Rect();
        s.shape();
        s = new Cir();
        s.shape();
    }
}

/*  
Write an abstract class named Person and its two subclasses named Student and Employee.
A person has a name, address, phone number, and email address. A student has enrollment,
course. An employee has an office, salary, and designation. Define constructors and methods
for input and display for both classes. Write a main program to give demonstration of all
*/
abstract class Person
{
    String name,address,email_address;
    int phone_number;
}
class Student extends Person
{
    String course;
    int enrollment;
}
class Employe extends Student
{
    String office,designation;
    int salary;
}
class PersonDetails extends Employe
{
    PersonDetails(String name,String address,String email_address,int phone_number,
            String course,int enrollment,String office,String designation,int salary)
    {
      this.address=address;
      this.designation=designation;
      this.email_address=email_address;
      this.name=name;
      this.course=course;
      this.enrollment=enrollment;
      this.office=office;
      this.phone_number=phone_number;
      this.salary=salary;
    }
    void Student_Details_Display()
    {
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Email Address: "+email_address);
        System.out.println("Course: "+course);
        System.out.println("Enrollment: "+enrollment);
    }
    void Employee_Details_Display()
    {
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Email Address: "+email_address);
        System.out.println("Office: "+office);
        System.out.println("Designation: "+designation);
    }
    public static void main(String args[])
    {
        PersonDetails pd = new PersonDetails("Rushabh Shah","Ohio","rtv@gmail.com",
                3456123,"ICT",12345690,"","",0);
        pd.Student_Details_Display();
        PersonDetails pd1 = new PersonDetails("Rushabh Shah","Ohio","rtv@gmail.com",
                3456123,"",0,"Ace Creates","Digital Creator",50000);
        pd1.Employee_Details_Display();
    }
}

/*  
Write a JAVA program to create a super class called figure that stores the dimensions of a
two-dimensional object. It also defines a method called area () that computes the area of an
object. The program derives two sub classes from figure. The first is rectangle and the second
is Triangle. Each of these subclasses overrides area (), so that it returns the area of a rectangle
and a triangle respectively
*/
class Figure
{
    int l=10,b=3;
    void area()
    {
        System.out.println("Dimensions");
    }
}
class rectangle extends Figure
{
    void area()
    {
        System.out.println("Area of Rectangle: "+(l*b));
    }
}
class Triangle extends Figure
{
    void area()
    {
        System.out.println("Area of Triangle: "+(0.5*(l*b)));
    }
    
    public static void main(String args[])
    {
        rectangle r = new rectangle();
        r.area();
        Triangle t = new Triangle();
        t.area();
    }
}