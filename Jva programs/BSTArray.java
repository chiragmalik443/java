class BSTArray{
	final int Max = 100;
	int[] tree = new int[Max];
	int index=0;
	static int[] keys={15,10,20,8,12,18,25,19,30,16};
	void insertkey(int key){
		if(index==0){
			index = index+1;
			tree[index] = key;
		}
		else{
			while(tree[index] != 0){
				if(key< tree[index])
				  index = index*2;
				  else
				  index = index*2+1;
			}
			tree[index] = key;
			index = 1;
		}
	}
	void in_rec(int index){
		if(tree[index*2]!=0)
		  in_rec(index*2);
		  System.out.print(tree[index]+" ");
		  if (tree[index*2+1]!=0)
		  in_rec(index*2+1);
	}
	public static void main(String[] args){
		BSTArray bst = new BSTArray();
		System.out.println();
		System.out.print("elements inserted into binary search tree are:");
		for(int i = 0;i<= keys.length-1;i++){
			System.out.print(keys[i]+" ");
			bst.insertkey(keys[i]);
		}
		System.out.println();
		System.out.print("in-order traversal of the given BST is:");
		bst.in_rec(1);
	}
}