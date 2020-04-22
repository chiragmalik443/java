class Circularlist 
{ 
static class Node 
{ 
    int data; 
    Node next; 
} 
static Node addToEmpty(Node last, int data) 
{ 
    if (last != null) 
    return last;  
    Node temp = new Node();  
    temp.data = data; 
    last = temp; 
    last.next = last; 
    return last; 
} 

   static Node addAfter(Node last, int data, int item) 
{ 
    if (last == null) 
        return null; 
  
    Node temp, p; 
    p = last.next; 
    do
    { 
        if (p.data == item) 
        { 
            temp = new Node(); 
            temp.data = data; 
            temp.next = p.next; 
            p.next = temp; 
  
            if (p == last) 
                last = temp; 
            return last; 
        } 
        p = p.next; 
    } while(p != last.next); 
  
    System.out.println(item + " not present in the list."); 
    return last; 
  
} 
static void print(Node last) 
{ 
    Node p; 

    if (last == null) 
    { 
        System.out.println("List is empty."); 
        return; 
    } 
    p = last.next; 
    do
    { 
        System.out.print(p.data + " "); 
        p = p.next; 
    } 
    while(p != last.next);  
} 
public static void main(String[] args) 
{ 
    Node last = null; 
    last = addToEmpty(last, 6);   
    print(last); 
    last = addAfter(last, 9,6);
    last = addAfter(last, 10,9);
    last = addAfter(last,17,9);
    print(last);
} 
} 