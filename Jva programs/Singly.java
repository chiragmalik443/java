public class Singly
{  
    Node head;
	static class Node
	{
		int data;
		Node next;
	}
	public void insertion(int i)
	{
		Node newnode = new Node();
		newnode.data=i;
		newnode.next=head;
		head = newnode;
	}
	public void deletion()
	{
		Node temp=head;
		head = temp.next;
		temp.next=null;
		
	}	
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
		 System.out.println("->"+temp.data);
		 temp=temp.next;
		}
	0
   
			
	public static void main(String[] args)
	{
		Singly s = new Singly();
		s.insertion(10);
		s.insertion(20);
		s.insertion(30);
		s.deletion();
		s.print();
		s.get();
	}
}	
		
	
		
		
		
		