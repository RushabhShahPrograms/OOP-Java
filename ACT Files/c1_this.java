package rushabh;
public class c1_this 
{
    String name;
    int roll_no;
    
    c1_this(String name, int roll_no)
    {
        this . name = name;
        this . roll_no = roll_no;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll_no);
    }
}
