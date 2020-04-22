class Sum 
{ 

static class Node  
{  
    int data;  
    Node next;  
};  
  

static int sumAlternateNode( Node head)  
{  
    int count = 0;  
    int sum = 0;  
  
    while (head != null)  
    {  
  
       if (count % 2 == 0)  
            sum += head.data;  
  
         count++;  
  
          
        head = head.next;  
    }  
    return sum;  
}  
  

static Node push( Node head_ref, int new_data)  
{  
    Node new_node =new Node(); 
    new_node.data = new_data;  
    new_node.next = (head_ref);  
    (head_ref) = new_node;  
    return head_ref; 
}  
  
 
public static void main(String args[]) 
{  
    
    Node head = null;  
  
    
    head = push(head, 12);  
    head = push(head, 29);  
    head = push(head, 11);  
    head = push(head, 23);  
    head = push(head, 8);  
  
    System.out.printf(" %d ", sumAlternateNode(head));  
}  
} 
  