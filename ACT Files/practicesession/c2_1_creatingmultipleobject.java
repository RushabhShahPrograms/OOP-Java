package rushabh.practicesession;
public class c2_1_creatingmultipleobject 
{
    public static void main(String args[])
    {
        c2_creatingmultipleobject s = new c2_creatingmultipleobject(), s1 = new c2_creatingmultipleobject();
        s.get("Rushabh", 52, 10, 89, "Pass");
        s1.get("XYZ", 12, 10, 95, "Pass");
        s.put();
        System.out.println("****************************");
        s1.put();
    }
}
