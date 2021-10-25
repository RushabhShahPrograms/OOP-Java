package rushabh;
public class StaticBinding 
{
     private void show()
     {
         System.out.println("New Movie");
     }
     public static void main(String args[])
     {
         StaticBinding obj = new StaticBinding();
         obj.show();
     }
}
