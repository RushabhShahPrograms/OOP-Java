package rushabh;
abstract class Person 
{
    abstract void person();  
}
class Student extends Person
{ 
    void person()
    {
        String name,address,email_address;
        int phone_number;
        
        name = "XYZ";
        address = "Ahmedabad";
        email_address = "xyz42@gmail.com";
        phone_number = 234545456;
        System.out.println("Person Details: ");
        System.out.println("Name: "+name+"\nAddress: "+address+"\nEmail: "+email_address+"\nPhone Number: "+phone_number);
        System.out.println();
        System.out.println();
        int enrollment; 
        String course;
        enrollment = 1900134503;
        course = "BE ICT";
        System.out.println("Student details: ");
        System.out.println("Enrollment: "+enrollment+"\nCourse: "+course);
        System.out.println();
        System.out.println();
    }
}
class Employee extends Student 
{
    void person()
    {
        String office,designation;
        int salary;
        salary = 30000;
        office = "London";
        designation = "Blah Blah";
        System.out.println("Employee Details: ");
        System.out.println("Salary: "+salary+"\nOffice: "+office+"\nDesignation: "+designation);
    }
}
class Output_person 
{
    public static void main(String args[])
    {
        Person p = new Student();
        p.person();
        Person f = new Employee();
        f.person();
    }
}
