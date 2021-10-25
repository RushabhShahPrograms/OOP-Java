package rushabh;
import java.util.*;
public class Leap_Year 
{
 public static void main(String args[])
 { 
    int a;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Year:");
    a=s.nextInt();
    if(a%4==0)
    {
        System.out.println("Leap Year");
    }
    else
    {
        System.out.println("Not Leap Year");
    }
    }
 } 


