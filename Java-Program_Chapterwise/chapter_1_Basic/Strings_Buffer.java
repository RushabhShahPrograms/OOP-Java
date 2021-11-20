package chapter_1_Basic;
public class Strings_Buffer 
{
  public static void main(String args[])
  {
      StringBuffer s = new StringBuffer("java code");
      System.out.println("Reverse: "+s.reverse());
      
      StringBuffer s1 = new StringBuffer("java code");
      System.out.println("Inserting string: "+s1.insert(0, "my "));
      
      StringBuffer s2 = new StringBuffer("java code");
      System.out.println("Appending: "+s2.append(" for programming"));
      
      StringBuffer s3 = new StringBuffer("java code");
      System.out.println("Replacing: "+s3.replace(0, 4, "python"));
      
      StringBuffer s4 = new StringBuffer("java code");
      System.out.println("Delete Char: "+s4.deleteCharAt(0));
      
      StringBuffer s5 = new StringBuffer("java code");
      System.out.println("Delete: "+s5.delete(0, 5));
  }    
}
