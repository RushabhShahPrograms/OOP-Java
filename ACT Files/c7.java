package rushabh;
public class c7 
{
    int id;
    String name;
    int age;
    c7(int i, String n)
    {
        id=i;
        name=n;
    }
    c7(int i, String n, int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+ " " +name+ " " +age);
    }
   public static void main(String args[])
   {
       c7 s1 = new c7(11,"Rush");
       c7 s2 = new c7(23,"Rushabh", 26);
       s1.display();
       s2.display();
   }
}

