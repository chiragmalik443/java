class Cqueue
{
int front=-1;
int rear=-1;
int a[] = new int[5];
public void enqueue(int item)
 {
  if(isFull()){
    
  }
  else {
    if(rear == arr.length-1){
      rear = 0;
    }
    else{
      rear=rear+1;
      arr[rear]= item;
      if(front == -1){
        front = 0;
      }
    }
  }
 }
int dequeue()
 {
 if(isEmpty()){
   return 0;
 }
  else {
    if(front == arr.length-1){
      front=0;
    }
    else{
      int d - arr[front];
      front= front-1;
      return d;
    }
  }
  }	
boolean isFull()
{
	if((front==0 && rear == arr.length -1) || front == rear+1)
	{
		System.out.println("overflow");
    return true;}

}
boolean isEmpty()
{
if (front == -1){
  System.out.println("unerflow");
  return true;
}
else
   return false;
}
int peek()
 {
 if( isEmpty()){
   return 0;
 }
 else{
   return arr[front];
 }
}
void display()
{
 int temp = front;
 if(front<=rear){
   while (temp<=rear){
     System.out.println(arr[temp]"->");
 temp++;  
 }
 while (temp<=arr.length){
   System.out.println(arr[temp]"->");
   temp++
 }
 temp = 0;
 while(temp<=rear){
   System.out.println(arr[temp]"->");
   temp++;
 }

 }
}
 public static void main(String args[])
 {
    Cqueue q =new Cqueue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.enqueue(60);
 System.out.println("deleted element is" +q.dequeue());
 System.out.println("peek element is" +q.peek());
 q.display();
 }
}
