package rushabh;
public class String10to15 
{
    public static void main(String args[])
    {
        String s= "Java is programming language";
        System.out.println("Starts wih 'Java': "+s.startsWith("Java"));
        System.out.println("End with Language: "+s.endsWith("language"));
        
        //substring        
        System.out.println(s.substring(4));
        System.out.println(s.substring(4,9));
        

        //index
        System.out.println(s.indexOf("is"));
        
        //trim
        System.out.println(s.trim());
        
        //replace
        String s1 = "Java";
        String s2 = s.replace('J','k');
        System.out.println(s2);
    }
}
