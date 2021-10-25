
package rushabh.practicesession;
public class C1_parameterizedconstructor 
{
    int id;
    String name;
    
    C1_parameterizedconstructor(int i, String n)
    {
        id=i;
        name=n;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    { 
        C1_parameterizedconstructor s = new C1_parameterizedconstructor(11, "Rushabh");
        s.display();
    }
}
