class Stack {



	int intStack[] = new int [10];

	int index;



	Stack(){

		index =-1;

	}



	

	//for insertion, 

	void push (int num){

		if(isFull( ))

		{

			System.out.println("Number cannot be pushed, Stack Full !");

		}

		else{

			intStack[++index]=num;

		}



	} 



	//for Deletion, 

	int pop( ){

		if(isEmpty()){

			System.out.println("Number cannot be popped, Stack empty !");

			

		}

		else{

		index--;

		System.out.println("Value of Index"+index);

		}

		return intStack[index+1];

	}



	boolean isEmpty( ){

		if(index == -1 )

		{

			return true;

		}

		return false;

	}

	

	boolean isFull( ){

		if(index == 9){

			return true;

		}

		return false;

	}

	int SpaceLeft( ){



		return (9-index);



	}

	void display(){

		if(!isEmpty()){

		System.out.println("==================");

			for(int i=0;i<index+1;i++){

			System.out.print(intStack[i]+" ");

			}

		System.out.println("\n"+"==================");

		}

		else

		System.out.println("Stack Empty. Nothing to display..!");

	}

}