package rushabh.practicesession;
public class c2_creatingmultipleobject 
{
    String name;
    int roll_no;
    int standard;
    int marks;
    String result;
    
    void get(String n, int r, int s, int m, String f)
    {
        name = n;
        roll_no = r;
        standard = s;
        marks = m;
        result = f;
    }
    
    void put()
    {
        System.out.println("Name Of Student: "+name);
        System.out.println("Roll No. Of Student: "+roll_no);
        System.out.println("Standard Of Student: "+standard);
        System.out.println("Marks Of Student: "+marks);
        System.out.println("Result Of Student: "+result);
    }
}
