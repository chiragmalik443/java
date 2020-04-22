public class Circular{
	Node tail;
	static class Node{
		int data;
		Node next;
	}
        void insertatbegin( int item){
        	Node newNode=new Node();
            newNode.data=item;
            if(tail==null)
             {newNode.next=newNode;
            tail=newNode;
           }
          else
          {newNode.next=tail.next;
          tail.next=newNode;
        }
        }
        void deleteatbegin(){
        	Node temp=tail.next;
            tail.next=temp.next;
            temp.next=null;
        }
        void print(){
        	Node temp=tail.next;
           while(temp!=tail)
           {System.out.println("<-"+temp.data+"->");
             temp=temp.next;
           }    
              	System.out.println("->"+temp.data);
        }
        
        public static void main(String[] args){
        	Circular c = new Circular(); 
        	c.insertatbegin(10);
        	c.insertatbegin(20);
        	c.insertatbegin(30);
        	c.deleteatbegin();
        	c.print();
        } 
}
