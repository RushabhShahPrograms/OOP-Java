package rushabh;

public class Pattern15 
{
    public static void main(String args[])
    {
       int i,j,num=5,k,count,temp=65,alpha,temp1=1;
    count=num-1;
    for(i=1;i<=num;i++)
    {
        for(k=1;k<=count;k++)
        {
          System.out.println(" ");
        }
        alpha=temp;
        for(j=1;j<=i;j++)
        {
         System.out.println(alpha);
         alpha--;
        }
        temp=temp +(++temp1);
    System.out.println("\n");
    count--;
    }
    }
}


/*
        A 
      C B 
    F E D 
  J I H G 
O N M L K 
*/
