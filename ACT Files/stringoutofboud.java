package rushabh;
public class stringoutofboud 
{
   public static void main(String args[])
   {
       try
       {
           String a  = "act";
           char c = a.charAt(5);
           System.out.println(c);
       }
       catch(StringIndexOutOfBoundsException e)
       {
           System.out.println("Exception");
       }
   }
}
