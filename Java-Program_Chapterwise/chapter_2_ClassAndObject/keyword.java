package chapter_2_ClassAndObject;
class keyword
{}

class This
{
    int rollno;  
    String name;  
    float fee;  
    This(int rollno,String name,float fee)
    {  
        this.rollno=rollno;  
        this.name=name;  
        this.fee=fee;  
    }  
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }  
    
    public static void main(String args[])
    {  
        This s1=new This(111,"ankit",5000f);  
        This s2=new This(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
    } 
}  

class Static
{
  int id;
  String name;
  static String n = "'xyz' <- Static keyword";  //static keyword
  
  Static(int r,String n)
  {
      id = r;
      name = n;
  }
  void display()
  {
      System.out.println(id+" "+name+" "+n);
  }
  
  static  //static block
  {
      System.out.println("Static block");
  }
  
  public static void main(String args[])
  {
      Static s = new Static(16,"Rushabh");
      Static s1 = new Static(16,"Rushabh");
      s.display();
      s1.display();
  }
}

abstract class Abstract
{
    abstract void run();
}
class Abstract_1 extends Abstract
{
    void run()
    {
        System.out.println("Hello This Is Abstract Method");
    }
    
    public static void main(String args[])
    {
        Abstract ab = new Abstract_1();
        ab.run();
    }
}

class Finalize
{  
    protected void finalize() throws Throwable
    {
        try 
        {
            System.out.println("inside demo's finalize()");
        }
        catch (Throwable e)
        {
            throw e;
        }
        finally 
        {
            System.out.println("Calling finalize method of the Object class");
            // Calling finalize() of Object class
            super.finalize();
        }
    }
    public static void main(String[] args) throws Throwable
    {
        Finalize d = new Finalize();
        d.finalize();
    }
}