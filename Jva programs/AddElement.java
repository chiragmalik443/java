00000000000000000000000import java.util.LinkedList;
import java.util.Iterator;
public class AddElement {
 
 public static void main(String[] args) {
 
    
    LinkedList<String> linkedlist = new LinkedList<String>();
 
    
    linkedlist.add("Delhi");
    linkedlist.add("Agra");
    linkedlist.add("Mysore");
    linkedlist.add("Chennai");
    linkedlist.add("Pune");
    System.out.println("original element:"+linkedlist);
    
    linkedlist.add(4, "Manali");

    
    System.out.println("LinkedList elements After Addition:");
    Iterator it= linkedlist.iterator();
    while(it.hasNext()){
       System.out.println(it.next());
    }
 }
}