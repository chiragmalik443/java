import java.util.LinkedList;
public class AddElement {
   public static void main(String[] args) {
      LinkedList<String> l = new LinkedList<String>();
      l.add("Pear");
      l.add("Apple");
      l.add("Mango");
      l.add("Guava");
      l.add("Orange");
      System.out.println("The LinkedList is: " + l);
      l.set(2, "Peach");
      System.out.println("The LinkedList is: " + l);
   }
}