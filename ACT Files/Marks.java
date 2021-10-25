package rushabh;

public class Marks 
{
 public static void main(String args[])
 {
     float a=50,b=40,c=70,total,percentage,average;
     total=a+b+c;
     System.out.println("Total Marks:"+total);
     average=(a+b+c)/3;
     System.out.println("Average of Three Subject:"+average);
     percentage=(total/300)*100;
     System.out.println("Percentage:"+percentage);
 }
}
