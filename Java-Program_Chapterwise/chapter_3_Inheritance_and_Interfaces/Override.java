package chapter_3_Inheritance_and_Interfaces;

//Method Overriding
class Override 
{
  void run()
  {
      System.out.println("Running");
  }
}
class Override_1 extends Override
{
    void run()
    {
        System.out.println("Run");
    }
    
    public static void main(String args[])
    {
        Override_1 obj = new Override_1();
        obj.run();
    }
}
