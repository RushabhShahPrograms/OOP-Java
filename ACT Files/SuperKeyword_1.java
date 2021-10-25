package rushabh;
public class SuperKeyword_1 extends SuperKeyword 
{
    void display()
  {
      String m = "xyzw";
      System.out.println(m);
      System.out.println(super.n);
  }
    
    public static void main(String args[])
    {
        SuperKeyword_1 obj = new SuperKeyword_1();
        obj.display();
    }
}
