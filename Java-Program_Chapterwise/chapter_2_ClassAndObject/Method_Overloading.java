package chapter_2_ClassAndObject;
class Method_Overloading 
{
    // changing number of arguments
    
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    
    public static void main(String args[])
    {
        Method_Overloading s = new Method_Overloading();
        s.sum(12, 12);
        s.sum(4,5,10);
    }
}

class Method_Overloading_2
{
    //By changing the data type
    
    void sum(int a,int b)
    {
        System.out.println("Add: "+a+b);
    }
    void sum(double a,double b)
    {
        System.out.println("Multiply: "+a*b);
    }
    void sum(float a,float b)
    {
        System.out.println("Divide: "+a/b);
    }
    
    public static void main(String args[])
    {
        Method_Overloading_2 s2 = new Method_Overloading_2();
        s2.sum(12,12);
        s2.sum(3.5f,2.3f);
        s2.sum(23.7f,6);
    }
}


