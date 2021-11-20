package chapter_3_Inheritance_and_Interfaces;
import java.util.*;
class Inherentice_Types 
{}

class Single
{
    static int a=10,b=5;
}
class Single_1 extends Single
{
    public static void main(String args[])
    {
        int c = a+b;
        System.out.println("Addition via Single Inheritance: "+c);
    }
}

class Multilevel
{
    void level(){  System.out.println("Level 1"); }
}
class Multilevel_2 extends Multilevel
{
    void level2(){ System.out.println("Level 2"); }
}
class Multilevel_3 extends Multilevel_2
{
    void level3(){ System.out.println("Level 3"); }
    
    public static void main(String args[])
    {
        Multilevel_3 obj = new Multilevel_3();
        obj.level();
        obj.level2();
        obj.level3();
    }
}

class Hierarchical
{
    void level(){ System.out.println("H1");  }
}
class Hierarchical_2 extends Hierarchical
{
    void level2(){ System.out.println("H2"); }
}
class Hierarchical_3 extends Hierarchical
{
    void level3(){ System.out.println("H3"); }
    
    public static void main(String args[])
    {
        Hierarchical_3 obj = new Hierarchical_3();
        obj.level();
        obj.level3();
    }
}

interface Multiple
{
    void print();
}
class Multiple_1 implements Multiple
{
    public void print()
    {
        System.out.println("Hello This Is Multiple Inheritance");
    }
    
    public static void main(String args[])
    {
        Multiple_1 obj = new Multiple_1();
        obj.print();
    }
}

interface Hybrid
{
void print();
}
class Hybrid_1 implements Hybrid
{
    public void print()
    {
        System.out.println("Hybrid_1");
    }
}
class Hybrid_2 extends Hybrid_1
{
    void displays()
    {
        System.out.println("Hybrid_2");
    }
}
class Hybrid_3 extends Hybrid_2
{
    void display()
    {
        System.out.println("Hybrid_3");
    }
    
    public static void main(String args[])
    {
        Hybrid_3 obj = new Hybrid_3();
        obj.display();
        obj.displays();
        Hybrid_1 obj1 = new Hybrid_1();
        obj1.print();
    }
}

