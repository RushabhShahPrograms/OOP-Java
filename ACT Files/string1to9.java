package rushabh;
public class string1to9 
{
    public static void main(String args[])
    {
        int x;
        String s = new String("JAVA");
        System.out.println(s);
        x=s.length();
        System.out.println("Length is "+x);
        
        char c;
        c=s.charAt(2);
        System.out.println("Char is "+c);
        
        System.out.println("**************************");
        
        String t = new String("Taiwan");
        System.out.println(t);
        System.out.println("Upper case is  "+t.toUpperCase());
        System.out.println("Lower case is "+t.toLowerCase());
        
         System.out.println("**************************");
        
        String s1 = "Rushabh";
        String s2 = "Shah";
        String s3 = "RUSHABH";
        
        System.out.println("S1: "+s1);
        System.out.println("s2: "+s2);
        System.out.println("S3: "+s3);
        System.out.println("Adding the string: "+s1.concat(s2));
        System.out.println("Equalling string s1 and s2: "+s1.equals(s2));
        System.out.println("Equalling string s1 and s3: "+s1.equalsIgnoreCase(s3));
        
        System.out.println();
        System.out.println("Comparing string s1 and s2");
        int i;
        i=s1.compareTo(s2);
        if(i==0)
        {
            System.out.println("Strings are equal");
        }
                    
        else
        {
            System.out.println("Strings are not equal");
        }
        
        System.out.println();
        System.out.println("Comparing string s1 and s3");
        i=s1.compareToIgnoreCase(s3);
        if(i==0)
        {
            System.out.println("Strings are equal");
        }
                    
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
