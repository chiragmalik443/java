class BinaryTree {
	char[] tree = new char[11];
	int index = 0;
	void insert(char item){
		if(isfull){
			System.out.println("overflow tree is full");
			}
			else{
				index++;
				tree[index] = item; }
			
		}
		char deletenode(int position){
			if(isempty()){
				System.out.println("underflow condition");
			}
			else{
				char temp = tree[position];
				tree[position]=tree[index];
				index--;
			}
		}
		boolean isfull(){
			if(index>=(tree.length-1)){
				return tree;
			}
			else 
			return false;

		}
		boolean isempty(){
			if(index<=0)
			return tree;
			else
			return false;
		}
		char getleftchild(int k){
			int left = 2*k;
			return tree[left];

		}
		char getrightchild(int k){
			int right = (2*k)+1;
			return tree[right];
		}
		void display(int position){
			int i=1;
			while(i<=index){
				System.out.println(tree[i++]+"");
			}

		}
		public static void main(String[] args){
		    BinaryTree b= new BinaryTree();
		    
		    b.insert('A');
		    b.insert('B');
		    b.insert('I');
		    b.insert('X');
		    b.insert('U');
		    b.insert('T');
		    b.insert('H');
		    b.insert('E');
		    System.out.println("left child at index"+getleftchildd());
		    System.out.println("right child "+getrightchild);
		    System.out.println("element deleted at pos"+b.deletenode());
		    b.insert('C');
		    b.insert('z');
		    b.insert('N');

		}
}