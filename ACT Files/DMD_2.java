package rushabh;
public class DMD_2 extends DMD
{
  void draw()
  {
      System.out.println("Square");
  }
  
  public static void main(String args[])
  {
      DMD d = new DMD_1();
      d.draw();
      DMD d1 = new DMD_2();
      d1.draw();
  }
}
