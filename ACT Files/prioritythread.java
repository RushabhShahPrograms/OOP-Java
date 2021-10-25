package rushabh;
public class prioritythread extends Thread
{
     public void run()
     {
         System.out.println("Running");
     }
     public static void main(String args[])
     {
         prioritythread p1 = new prioritythread();
         prioritythread p2 = new prioritythread();
         prioritythread p3 = new prioritythread();
         prioritythread p4 = new prioritythread();
         prioritythread p5 = new prioritythread();
         p1.start();
         p1.setPriority(4);
         p2.setPriority(8);
         p3.setPriority(MIN_PRIORITY);
         p4.setPriority(NORM_PRIORITY);
         p5.setPriority(MAX_PRIORITY);
         System.out.println("P is p1: "+p1.getPriority());
         System.out.println("P is p2: "+p2.getPriority());
         System.out.println("Minimum Priority: "+p3.getPriority());
         System.out.println("Normal Priority: "+p4.getPriority());
         System.out.println("Max Priority: "+p5.getPriority());
     }
}
