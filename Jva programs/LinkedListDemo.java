import java.util.*;
public class LinkedList
{

   public static void main(String args[]) 
   {
        LinkedList ll = new LinkedList();

	   ll.add("c");
      ll.add("h");
      ll.add("i");
      ll.add("r");
      ll.add("a");
      ll.addLast("m");
      ll.addFirst("m");

      System.out.println("Original contents of ll: " + ll);

      Object val = ll.get(3);
      ll.set(3, (String) val + "hello");
      System.out.println("ll after change: " + ll);
   }
}
      