package QBJava;
import java.util.*;
import java.lang.*;
class Chapter2 {}

// constructor overloading
class CO
{
    String name;
    int number,age;
    CO(int n,String na)
    {
        name = na;
        number = n;
    }
    CO(int n,String na, int a)
    {
        number = n;
        name = na;
        age = a;
    }
    void display()
    {
        System.out.println("number: "+number+"\nName: "+name+"\nAge: "+age);
    }
    
    public static void main(String args[])
    {
        CO c = new CO(11,"Rushabh");
        CO c2 = new CO(22,"Rushabh",21);
        c.display();
        c2.display();
    }
}

//With the help of program show how to pass object as an argument of method
class PassArgument
{
    int a,b;
    PassArgument(int c, int e)
    {
        a=c;
        b=e;
    }
    void display()
    {
        System.out.println("Add: "+(a+b));
    }
    
    public static void main(String args[])
    {
        PassArgument pa = new PassArgument(2,5);
        pa.display();
    }
}

//Define a recursive method for computing x raised to power y by doing repetitive
//multiplication where x and y are positive integer numbers. Define main to use above method
class Power
{
     public static void main(String[] args)
     { 
         Scanner s = new Scanner(System.in);
         System.out.println("enter the value of base and power: ");
        int b = s.nextInt(), p = s.nextInt();
        int result = power(b, p);
        System.out.println(b + "^" + p + "=" + result);
     }

    public static int power(int base, int powerRaised)
    {
        if (powerRaised != 0)
        {
            return (base * power(base, powerRaised - 1));
        }
        else
        {
             return 1;
        }
    }
}
/* working on this */
//It is required to compute SPI (semester performance index) of n students of a class for their
//registered subjects in a semester. Assume that all students register for 6 subjects and each
//subject carry 5 credits. Also, follow GTU convention and method for computation of SPI.
//Declare a class called student having following data members:
//id_no, grades_obtained and spi.
//Define constructor, display and calculate_spi methods. Define main to process data of n
//students
/* class Student
{
    int id_no, grades_obtained,sum=0,sum1=0,credits=5;
    double spi;
    int grade_point;
    String[] subjects = new String[6];
    String[] grade_obtain;
    String[] sub_code;
    String[] sub_credit;
    
    Student()
    {
        subjects[1] = "ANP";
        subjects[2] = "OR";
        subjects[3] = "ADa";
        subjects[4] = "PDS";
        subjects[5] = "OOPJ";
        subjects[6] = "IPDc";
    }
    void display()
    {
    }

    void calculate_spi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  */

//Write a class named Rectangle to represent a rectangle. It contains the following members:
//Data: width (double) and height (double) that specify the width and height of the rectangle.
//Methods:
//1. A no-arg constructor that creates a default rectangle.
//2. A constructor that creates a rectangle with the specified width and height.
//3. A method named getArea() that returns the area of this rectangle.
//4. A method named getPerimeter() that returns the perimeter.
class Rectangle
{
    double width,height;
    Rectangle(double w,double h)
    {
       width = w;
       height = h;
    }
    Rectangle()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of widht and height: ");
        width=s.nextDouble();
        height=s.nextDouble();
    }
    void getArea()
    {
        double area = width*height;
        System.out.println("Area of Rectangle: "+area);
    }
    void getPerimeter()
    {
        double perimeter = 2*(width+height);
        System.out.println("Perimeter of Rectangle is: "+perimeter);
    }
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.getArea();
        r.getPerimeter();
    }
}

//what will be the output
//1
class evaluate {
public static void main(String args[])
{
int arr[] = new int[] {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
int n = 6;
n = arr[arr[n] / 2];
System.out.println(arr[n] / 2);
}
}

//2
class equality {
int x;
int y;
boolean isequal()
{
return(x == y);
}
}
class Output {
public static void main(String args[])
{
equality obj = new equality();
obj.x = 5;
obj.y = 5;
System.out.println(obj.isequal());
}
}

//3
class Test
{
    public static void main(String args[])
    {
        Count myCount = new Count();
        int times=0;
        for(int i=0;i<100;i++)
        increment(myCount,times);
        System.out.println("count is "+myCount.count);
        System.out.println("times is "+times);
    }
    public static void increment(Count c,int times)
    {
        c.count++;
        times++;
    }
}
class Count
{
    public int count;
    Count(int c){ count=c; }
    Count(){ count=1; }
}

//Write a program called SumDigits to sum up the individual digits of a positive
//integer, given in the command line. An example is shown below: (Feb-2021 Old) [LJIET]
//java SumDigits 12345
//The sum of digits = 1 + 2 + 3 + 4 + 5
class SumDigits
{
	public static void main(String args[])
	{
		int sum=0,n,digit;
		System.out.println("Enter the digit: ");
		n=Integer.parseInt(args[0]);
		while(n>0)
		{
			digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		System.out.println("The Sum of Digits: "+sum);
	}
}

/* Design a class named Fan to represent a fan. The class contains: - Three constants named SLOW, MEDIUM and FAST with values 1, 2 and 3 to denote
the fan speed. - An int data field named speed that specifies the speed of the fan (default SLOW). - A boolean data field named f_on that specifies whether the fan is on (default false). - A double data field named radius that specifies the radius of the fan (default 4). - A data field named color that specifies the color of the fan (default blue). - A no-arg constructor that creates a default fan. - A parameterized constructor initializes the fan objects to given values. - A method named display() will display description for the fan. If the fan is on, the
display() method displays speed, color and radius. If the fan is not on, the method returns fan
color and radius along with the message “fan is off”. Write a test program that creates two
Fan objects. One with default values and the other with medium speed, radius 6, color brown,
and turned on status true. Display the descriptions for two created Fan objects
*/
class Fan
{
    public static final int SLOW = 1,MEDIUM = 2, FAST = 3;
    int speed;
    boolean f_on;
    double radius;
    String color;
    Fan()
    {
        speed =SLOW;
        f_on=false;
        radius=4;
        color="blue";
    }
    Fan(int speed,boolean f_on,double radius,String color)
    {
       this.speed=speed;
       this.f_on=f_on;
       this.radius=radius;
       this.color=color;
    }
    void display()
    {
        if(f_on==true)
        {
            System.out.println("Fan is on\nSpeed of fan is: "+speed+"\nRadius is: "+radius+"\nColor is: "+color);
        }
        else
        {
            System.out.println("Fan is off\nThe speed of fan is: "+speed+"\nRadius is: "+radius+"\nColor is: "+color);
        }
    }
    public static void main(String args[])
    {
        Fan f = new Fan();
        Fan f1 = new Fan(FAST,true,6,"Brown");
        f.display();
        f1.display();
    }
}

/*  Define the Rectangle
class that contains:
Two double fields x and y that specify the center of the rectangle, the data field width
and height , A no-arg constructor that creates the default rectangle with (0,0) for (x,y)
and 1 for both width and height. 2 A parameterized constructor creates a rectangle
with the specified x,y,height and width.
A method getArea() that returns the area of the rectangle.
A method getPerimeter() that returns the perimeter of the rectangle.
A method contains(double x, double y) that returns true if the specified point (x,y) is
inside this rectangle.
Write a test program that creates two rectangle objects. One with default values and other
with user specified values. Test all the methods of the class for both the objects.
*/
class Rectangle1
{
    double x,y,height,width;
    Rectangle1()
    {
        x=0;
        y=0;
        height=1;
        width=1;
    }
    Rectangle1(double x,double y, double height, double width)
    {
        this.height=height;
        this.width=width;
        this.x=x;
        this.y=y;
    }
    double getArea()
    {
       return(height*width); 
    }
    double getPerimeter()
    {
      return(2*(height+width));
    }
    boolean point(double x,double y)
    {
	  double pointX = x;
          double pointY = y;
          if (pointX < (this.x + (this.width)) && pointX > (this.x - (this.width)) &&
           pointY < (this.y + (this.height)) && pointY > (this.y - (this.height)))
           return true;
          else
           return false;
    }
    public static void main(String args[])
    {
                Rectangle1 r = new Rectangle1();
		System.out.println("For default values: ");
		System.out.println("Area: "+r.getArea());
		System.out.println("Perimeter: "+r.getPerimeter());
		System.out.println("Points: "+r.point(0,0));
		
		Rectangle1 r1 = new Rectangle1(2,2,5,4);
		System.out.println("For user specified values: ");
		System.out.println("Area: "+r1.getArea());
		System.out.println("Perimeter: "+r1.getPerimeter());
		System.out.println("Points: "+r1.point(5,4));
    }
}

/* It is required to compute SPI (semester performance index) of n students of your college for
their registered subjects in a semester. Declare a class called student having following data
members: id_no , no_of_subjects_registered, subject_code , subject_credits, grade_obtained
and spi. - Define constructor and calculate_spi methods. - Define main to instantiate an array for objects of class student to process data of n students
to be given as command line arguments
*/
class Student1
{
  int id_no,no_of_sub_registered;
  int[] sub_code=new int[7];
  int[] sub_credit=new int[7];
  String[] grade_obtain=new String[10];
  int[] grade_point=new int[10];
  double spi;
  int sum=0,sum1=0;
  
  Student1()
  {
   no_of_sub_registered=7;
   sub_code[0]=150001;
   sub_credit[0]=2;
   sub_code[1]=150701;
   sub_credit[1]=5;
   sub_code[2]=150702;
   sub_credit[2]=6;
   sub_code[3]=150703;
   sub_credit[3]=6;
   sub_code[4]=150704;
   sub_credit[4]=4;
   sub_code[5]=150705;
   sub_credit[5]=1;
   sub_code[6]=150606;
   sub_credit[6]=6;
  }
  
  void calculate_spi()
  {  
   for(int i=0;i<=6;i++)
   { 
    if(grade_obtain[i].equals("AA"))
    grade_point[i]=10;
    else if(grade_obtain[i].equals("AB"))
    grade_point[i]=9;
    else if(grade_obtain[i].equals("BB"))
    grade_point[i]=8;
    else if(grade_obtain[i].equals("BC"))
    grade_point[i]=7;
    else if(grade_obtain[i].equals("CC"))
    grade_point[i]=6;
    else if(grade_obtain[i].equals("CD"))
    grade_point[i]=5;
    else if(grade_obtain[i].equals("DD"))
    grade_point[i]=4;
    else if(grade_obtain[i].equals("FF"))
    grade_point[i]=0;
    
    this.sum = sum+(sub_credit[i]*grade_point[i]);
    this.sum1 = sum1+sub_credit[i];
   }
   spi = sum/sum1;
   System.out.println("your spi is = "+spi);
  }
  public static void main(String args[])
 { 
  Scanner s=new Scanner(System.in);
  Student1 obj=new Student1();
  int length =args.length;
  
  if(length <= 0)
  {
   System.out.println("enter enrollment no list");
  }
  for(int k=0;k < length ; k++)
  {
    System.out.println("Enter details about grade obtain for each subject \n \n");
    System.out.println("subject code \t subject credit \t obtain grade \n");
    System.out.println("------------------------------------------------ \n"); 
    for(int i=0;i<=6;i++)
    {
        System.out.print(obj.sub_code[i]+"\t \t \t"+ obj.sub_credit[i] +"\t \t \t");
        String r=s.nextLine();
        obj.grade_obtain[i]=r;
    }
    obj.calculate_spi();   
  }
 }
}

/* Declare a class called coordinate to represent 3 dimensional Cartesian coordinates( x, y and z). 
Define following methods:
- constructor
- display, to print values of members
- add_coordinates, to add three such coordinate objects to produce a resultant
coordinate object. Generate and handle exception if x, y and z coordinates of the result
are zero. - main, to show use of above methods
*/
class Coordinates extends Exception
{
    double x,y,z,result;
    Coordinates() {}
    Coordinates(double x, double y, double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void display()
    {
        System.out.println("Value of x: "+x);
        System.out.println("Value of y: "+y);
        System.out.println("Value of z: "+z);
    }
    void add_coordinates() throws Coordinates
    {
        result = x+y+z;
        System.out.println("Result: "+result);
        if(result==0)
        {
            throw new Coordinates();
        }
    }
    public static void main(String args[])
    {
        Coordinates c = new Coordinates(5,5,10);
        c.display();
        
        try
        {
            c.add_coordinates();
        }
        catch(Coordinates e)
        {
            System.out.println("Try different coordinates");
        }
    }
}

/*  Declare a class called employee having employee_id and employee_name as members.
Extend class employee to have a subclass called salary having designation and
monthly_salary as members. Define following: - Required constructors
- A method to find and display all details of employees drawing salary more than Rs.
20000/-. - Method main for creating an array for storing these details given as command line
arguments and showing usage of above methods
*/
class Employee
{
    int employee_id;
    String employee_name;
}
class Salary extends Employee
{
    String designation;
    double monthly_salary;
    
    Salary(int employee_id, String employee_name, String designation, double monthly_salary)
    {
        this.designation=designation;
        this.employee_id=employee_id;
        this.employee_name=employee_name;
        this.monthly_salary=monthly_salary;
    }
    void display()
    {
        System.out.println("Employees details are as under: ");
        System.out.println("Name: "+employee_name);
        System.out.println("Id: "+employee_id);
        System.out.println("Designation: "+designation);
        System.out.println("Salary: "+monthly_salary);
    }
}
class EmployeeDetails
{
    public static void main(String args[])
    {
        int count = Integer.parseInt(args[0]);
		Salary s[] = new Salary[count];
		
		int i;
		int id;
		String n,d;
		double sal;
		
		Scanner scan = new Scanner(System.in);
		
		for(i=0;i<count;i++)
		{
			System.out.println("Entering Details for employee# " + (i+1) );
			System.out.print("Enter ID : ");
			id=scan.nextInt();
			System.out.print("Enter Name : ");
			n=scan.next();
			System.out.print("Enter Designation : ");
			d=scan.next();
			System.out.print("Enter Salary : ");
			sal=scan.nextDouble();
			
			s[i]=new Salary(id,n,d,sal);
			
		}
		
		System.out.println("The Employees with salary >20000 are as follows :  ");
		
		for(i=0;i<count;i++)
		{
			if(s[i].monthly_salary >= 20000)
			{
				s[i].display();
			}
		}
    }
}

//Write a program to create circle class with area function to find area of circle.
class Circle 
{
    float Pi=3.14f;
    int r=4;
    void Area()
    {
        System.out.println("Area of circle is: "+(Pi*r*r));
    }
    public static void main(String args[])
    {
        Circle c  = new Circle();
        c.Area();
    }
}
