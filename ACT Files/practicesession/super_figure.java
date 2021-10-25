/*
Write a JAVA program to create a super class called figure that stores
the dimensions of a two-dimensional object. It also defines a method
called area () that computes the area of an object. The program derives
two sub classes from figure. The first is rectangle and the second is
Triangle. Each of these subclasses overrides area (), so that it returns
the area of a rectangle and a triangle respectively.
 */
package rushabh.practicesession;
class super_figure 
{
    int l,b;
    void area()
    {
        
    }
}

class super_figure_rectangle extends super_figure
{
    void area()
    {
        l=10;
        b=5;
        int a=l*b;
        System.out.println("Area of Recatngle is: "+a);
    }
}

class super_figure_triangle extends super_figure
{
    void area()
    {
        l=10;
        b=10;
        int a=(l*b)/2;
        System.out.println("Area of Triangle is: "+a);
    }
    public static void main(String args[])
    {
        super_figure_rectangle r= new super_figure_rectangle();
        r.area();
        super_figure_triangle t = new super_figure_triangle();
        t.area();
    }
}
