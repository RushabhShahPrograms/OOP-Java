package rushabh;
public class static_keyword 
{
    int id;
    String name;
    static String n = "dollar";
    static_keyword(int r, String n)
    {
        id = r;
        name = n;
    }
    void display()
    {
        System.out.println(id+ "  " +name+ " " +n);
    }
    public static void main(String args[])
    {
        static_keyword s = new static_keyword(11,"Rushabh");
        static_keyword s1 = new static_keyword(12,"Shah");
        s.display();
        s1.display();
    }
}
