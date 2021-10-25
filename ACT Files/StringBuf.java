package rushabh;

public class StringBuf 
{
    public static void main(String args[])
    {
        int a=2,b=3,c;
        
        c=a/b;
        System.out.println(c);
        StringBuffer s = new StringBuffer("Hello java");
        System.out.println(s.reverse()); //revers
        
        StringBuffer s1 = new StringBuffer("Hello java");
        System.out.println(s1.insert(6,"first")); //insert
        
        StringBuffer s2 = new StringBuffer("Hello java");
        System.out.println(s2.append(" to learn")); //append(adding last part)
        
        StringBuffer s3 = new StringBuffer("Hello java");
        System.out.println(s3.replace(4,13," kaha")); //replacing the word from the given value
        
        StringBuffer s4 = new StringBuffer("Hello java");
        System.out.println(s4.deleteCharAt(6)); //delete the character from the given value
        
        StringBuffer s5 = new StringBuffer("Hello java");
        System.out.println(s5.delete(6,13)); //delete the part of word         
    }
}
