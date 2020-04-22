import java.util.*;
class Array1 {
	public static void main(String args[])
	{int x[];
	x= new int[10];
	int i,count=0;
	Scanner s1 = new Scanner(System.in);
	System.out.print("enter the elements");
	for(i=0;i<10;i++)
	{  
	  x[i]= s1.nextInt();
	  }
	  System.out.println("enter the element of the array");
	  int y = s1.nextInt();
	  for(i=0;i<10;i++)
	  { if(x[i]==y)
	  {
	  System.out.println(+y+" is at position :" +i);
	  count++;	 
	  }
	  }
	  switch (count)
	  { 
	  case 1:
	  System.out.println("okay");
	  default:
	  System.out.println("-1");
	  }

	}
}