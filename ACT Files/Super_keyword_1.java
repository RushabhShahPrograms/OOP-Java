package rushabh;
public class Super_keyword_1 extends Super_keyword 
{
  String color = "black"; 
  void print()
  {
      System.out.println(color);
      System.out.println(super.color);
  }
  public static void main(String args[])
  {
      Super_keyword_1 sk = new Super_keyword_1();
      sk.print();
  }
}

