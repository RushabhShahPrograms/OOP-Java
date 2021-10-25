package rushabh;
import java.util.*;
public class vowel 
{
    public static void main(String args[])
    { 
        char w;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the alphabet");
        w=s.next().charAt(0);
        char ch=w;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch+ " is vowel");
        else
            System.out.println(ch+ " is consonant");
    }
}
