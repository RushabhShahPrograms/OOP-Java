package rushabh;
public class method 
{
  public static void main(String args[])
  {
      String s1 = new String("I learn java code");
      System.out.println(s1.startsWith("I"));
      System.out.println(s1.endsWith("code"));
      
      String s2 = new String("java code");
      System.out.println(s1.substring(2));
      System.out.println(s1.indexOf(s2));
      System.out.println(s1.replace("java", "cpp"));
      System.out.println(s1.trim());
  }
}
