package rushabh;
public class addtionofarray 
{
    public static void main(String args[])
    {
        int i,sum=0;
        int[] arr = new int[10];
        for(i=0;i<arr.length;i++)
        {
            System.out.println(+i);
            sum=sum+i;
        }
        System.out.println("Summation: "+sum);
    }
}
