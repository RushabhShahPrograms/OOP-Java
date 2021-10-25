package rushabh;
public class Pattern13 
{
    public static void main(String args[])
    {
        int i,j,c;
        for(i=1;i<=5;i++)
        {
            for(j=5;j>=1;j--)
            {
                c=2*j-1;
                if(j<=i)
                {
                    System.out.print(c);
                }
            }
            System.out.println();   
        }           
    } 
}
/*
1
31
531
7531
97531
*/