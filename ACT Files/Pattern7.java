package rushabh;
public class Pattern7 
{
    public static void main(String args[])
    {
        int i,j;
        char ch = 'a';
        for(i=0;i<5;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
/*
a
bc
def
ghij
klmno
*/