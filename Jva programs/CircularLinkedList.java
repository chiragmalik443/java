class CircularLinkedList { 
  

    static class Node { 
        int data; 
        Node next; 
    }; 
    public Node(int data) {  
            this.data = data;  
        }  
    }  
  

    static Node removeFirstNode(Node head) 
    { 
        if (head == null) 
            return null; 
  
        
        Node temp = head; 
        head = head.next; 
  
        return head; 
    } 

    public void add(int data){  
        Node newNode = new Node(data);  
        if(head == null) {                
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            tail.next = newNode;  
             tail = newNode;   
            tail.next = head;  
        }  
    }    
  

    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }    

    public static void main(String args[]) 
    { 
         
        CreateList cl = new CreateList();  
        cl.add(1);  
        cl.add(2);  
        cl.add(3);  
        cl.add(4);    
        cl.display();  
  
        head = removeFirstNode(head); 
        for (Node temp = head; temp != null; temp = temp.next) 
            System.out.print(temp.data + " "); 
    } 
} 