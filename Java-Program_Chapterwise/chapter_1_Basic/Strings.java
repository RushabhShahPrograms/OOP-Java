package chapter_1_Basic;
public class Strings 
{
  public static void main(String args[])
  {
      String s = new String("JAVA");
      int x = s.length();   //length()
      System.out.println("Length is: "+x);
      
      String s1 = new String("Java");
      x = s.charAt(2); //charAt()
      System.out.println("Char value is: "+x);
      
      String s2 = new String("Rushabh");
      System.out.println("Upper Case is: "+s2.toUpperCase());
      System.out.println("Lower Case is: "+s2.toLowerCase());
      
      String s3 = new String("Rushabh");
      String s4 = new String("rushabh");
      System.out.println("Add: "+s3.concat(s4));
      System.out.println("Equal: "+s3.equals(s4));
      System.out.println("Equals Ignore Case: "+s3.equalsIgnoreCase(s4));
      
      String s5 = new String("Oop");
      String s6 = new String("oop");
      int i = s5.compareTo(s6);
      if(i==0)
      {
          System.out.println("Strings are equal");
      }
      else
      {
          System.out.println("Strings are not  equal");
      }
      
      i = s5.compareToIgnoreCase(s6);
      if(i==0)
      {
          System.out.println("Strings are equal");
      }
      else
      {
          System.out.println("Strings are not  equal");
      }
      
      String s7 = new String("Java is programming Language");
      System.out.println("Starts with: "+s7.startsWith("Java"));
      System.out.println("Ends with: "+s7.endsWith("Language"));
      System.out.println("Substring: "+s7.substring(4));
      System.out.println("Substring other method: "+s7.substring(4, 10));
      System.out.println("Index of: "+s7.indexOf("is"));
      
      String s8 = new String("                java                          ");
      System.out.println("Trim: "+s8.trim());
      
      System.out.println("Replace: "+s8.replace('j', 'k'));
  }
}
