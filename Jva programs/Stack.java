public class Stack{
	Node top=null;
	
	static class Node{
		int data;
		Node next;
	}
	void push(int item){
		Node newNode = new Node();
		newNode.data=item;
		newNode.next=top;
		top= newNode;
	}
	int pop(){
		Node temp= top;
		int d=temp.data;
		top=top.next;
		temp.next=null;
		return d; 
	}
	int peek(){
		if(top== null)
		{
			System.out.println("nothing there ");
			return 0;
		}
		else{
			return top.data;
		}
	}
	void print(){
		Node temp= top;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		s.peek();
		s.print();
	}
}