package rushabh;
import java.util.*;
public class ATMCash 
{
    public static void main(String args[])
    {
        int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        a=x.nextInt();
        b=a/1000;
        c=a%1000;
        d=c/500;
        e=c%500;
        f=e/100;
        g=e%100;
        h=g/50;
        i=g%50;
        j=i/10;
        k=i%10;
        l=k/1;
        m=k%1;
        System.out.println("1000: "+b);
        System.out.println("500: "+d);
        System.out.println("100: "+f);
        System.out.println("50: "+h);
        System.out.println("10: "+j);
        System.out.println("1: "+l);
    }
    
}
