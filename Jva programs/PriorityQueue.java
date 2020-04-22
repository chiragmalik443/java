class PriorityQueue{
	int front=-1;
	int rear =-1;
	int arr[]= new arr[5];
	int priority = 1000;

	void enqueue(int item){
		if(isFull()){
			
		}
		else{
			if(front == -1){
				front= 0;
			}
			rear++;
			arr[rear]= item;
		}
	}
	void dequeue(){
		if(isEmpty()){
			
		}
		else{
			int temp= front;
			while(front!= rear+1){
				if(prirority>arr[front]){
					priority = arr[front];
					temp = front;
					front++;
				}
				else{
					front++;
				}
			}
	   arr[temp]=arr[rear];
	   rear--;
	   front = 0;
	   return priority	
	}

	}
	void display(){
		
	}
	boolean isFull(){
		
	}
	boolean isEmpty(){
		if (front == -1){
        System.out.println("unerflow");
        return true;
        }
       else
           return false;
	}
	public static void main(String[] args){
		PriorityQueue queue= new PriorityQueue();
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(1);
		queue.enqueue(5);
		queue.enqueue(4);
		System.out,println("Highest order is" + queue.dequeue());
		System.out.println("2nd highest order is"+ queue.dequeue());
		queue.display();
	}

}