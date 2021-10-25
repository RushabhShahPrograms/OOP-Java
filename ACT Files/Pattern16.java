package rushabh;
public class Pattern16 
{
    public static void main(String args[])
    {
        int i,j;
        int count=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(count++%2);
                if(j==i && i!=5)
                {
                    System.out.println();
                }
            }
            if(i%2==0)
            {
                count=1;   
            }
            else
            {
                count=0;
            }       
        }
          System.out.println();  
    }
}
/*
1
01
101
0101
10101
*/