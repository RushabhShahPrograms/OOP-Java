package chapter_3_Inheritance_and_Interfaces;
import java.util.*;
class Keywords
{}

class Final 
{
  public static final double Pi = 3.14;
  public static void main(String args[])
  {
      Scanner s = new Scanner(System.in);
      double r;
      System.out.println("Enter the value of r: ");
      r = s.nextDouble();
      double a = Pi*r*r;
      System.out.println("Value is: "+a);
  }
}

class Super
{
    String color = "white";
}
class Super_1 extends Super
{
    String color = "black";
    void print()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
    
    public static void main(String args[])
    {
        Super_1 e = new Super_1();
        e.print();
    }
}