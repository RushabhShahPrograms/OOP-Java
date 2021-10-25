package rushabh;
public class hierarchical_area3 extends hierarchical_area
{
    void show()
    {
        float c;
        c=pi*r*r;
        System.out.println("Area of circle: "+c);
    }
    public static void main(String args[])
    {
        hierarchical_area2 e = new hierarchical_area2();
        e.display();
        hierarchical_area3 h = new hierarchical_area3();
        h.show();
    }
}
