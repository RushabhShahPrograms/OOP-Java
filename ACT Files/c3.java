package rushabh;
public class c3 
{
    int salary;
    String name;
    String position;
    
    void get(int s, String n, String p)
    {
        salary = s;
        name = n;
        position = p;
    }
    
    void put()
    {
        System.out.println("Salary: "+salary);
        System.out.println("Name: "+name);
        System.out.println("Position: "+position);
    }
}
