public class Hello{
	Node head;
	static class Node{
		int data;
		Node next;
	}
	void InsertAtbegin(int item){
		Node newNode= new Node();   
		newNode.data = item;
		newNode.next = head;
		head = newNode;
		
	}
	void DeleteAtbegin(){
		Node temp= head;
		head = temp.next;
		temp.next= null;

		
	}
	void Print(){
		Node temp= head;
		while(temp!=null){
			System.out.print("->"+temp.data);
		temp=temp.next;

}
	public static void main(String[] args) {
		SingLyLinkedList ob=new SingLyLinkedList();
		
		ob.InsertAtbegin(10);
		ob.InsertAtbegin(20);
		ob.InsertAtbegin(30);
        ob.DeleteAtbegin();
        ob.Print();
	}
}