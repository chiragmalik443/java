import java.util.*;
import java.lang.Math;
class quadraticEquation{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int a;
		int b;
		int c;
		int root1;
		int root2;
		int d;
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();
		d=b*b-4*a*c;
		if(d>0){
			System.out.println("real and distinct");
			root1=(int)(-b+Math.sqrt(d)/(2*a));
			root2=(int)(-b-Math.sqrt(d)/(2*a));
			System.out.println(root1+" "+root2);
		}
		else if(d==0){
			System.out.println("real and equal");
			root1=(int)(-b+Math.sqrt(d)/(2*a));
			System.out.println(root1);
		}
		else {
			System.out.println("imaginary");
		}

	}
}
