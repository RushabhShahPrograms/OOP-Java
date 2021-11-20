package chapter_3_Inheritance_and_Interfaces;
class Dynamic_Method_Dispatch {}

class Runtime
{
    void draw()
    {
        System.out.println("Draw");
    }
}
class Runtime_1 extends Runtime
{
    void draw()
    {
        System.out.println("Draw");
    }
}
class Runtime_2 extends Runtime
{
    void draw()
    {
        System.out.println("Circle");
    }
    
    public static void main(String args[])
    {
        Runtime r;
        r = new Runtime_1();
        r.draw();
        r = new Runtime_2();
        r.draw();
    }
}

class Static
{
    private void eat()
    {
        System.out.println("Dog");
    }
    
    public static void main(String args[])
    {
        Static s = new Static();
        s.eat();
    }
}

class Dynamic
{
    void eat()
    {
        System.out.println("Hello");
    }
}
class Dynamic_1 extends Dynamic
{
    void eat()
    {
        System.out.println("Hello java");
    }
    
    public static void main(String args[])
    {
        Dynamic obj = new Dynamic_1();
        obj.eat();
    }
}