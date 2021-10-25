package rushabh.practicesession;

    public class class_1 
    {
    int id,a,u;
    String name;
  
      class_1(int i,String n,int r, int q)
    {
          id=i;
        name=n;
        a=r;
        u=q;
        
    }
          void display()
        {
            int t;
            System.out.println(id+"       "+name);
            for(t=0;t<=u;t++)
            {
                System.out.println(a);
                a++;
            }
        }
    }
