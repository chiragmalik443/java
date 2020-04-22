class DoublyList
{
 DoublyNode head;
 void insertAtBeg(int item)
{
  DoublyNode newNode=new DoublyNode();
  newNode.data=item;
  newNode.next=head;
  newNode.prev=null;
  if(head==null)
  head=newNode;
  else
 {
  head.prev=newNode;
  head=newNode;
 }
}
   void deleteAtBeg()
{
  DoublyNode temp=head;
  head=head.next;
  head.prev=null;
  temp.next=null;
}
    void printList()
{
  DoublyNode temp=head;
  while(temp!=null)
  {System.out.println("<-"+temp.data+"->");
  temp=temp.next;
 }
}
   public static void main(String[] args)
{
	DoublyList list=new DoublyList();
	list.insertAtBeg(10);
	list.insertAtBeg(20);
	list.insertAtBeg(30);
	list.insertAtBeg(40);
	list.insertAtBeg(50);
	list.insertAtBeg(60);	
	System.out.println("Doubly Linked list as:");
	list.printList();
	list.deleteAtBeg();
	System.out.println("Doubly Linked List after deletion");
	list.printList();
 }
}
