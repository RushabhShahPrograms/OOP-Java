package rushabh;
public class This_keyword 
{
    int rollno;  
    String name;  
    float fee;  
    This_keyword(int rollno,String name,float fee)
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
        This_keyword s1=new This_keyword(111,"ankit",5000f);  
        This_keyword s2=new This_keyword(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
    }
 }     