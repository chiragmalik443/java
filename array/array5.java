import java.util.*;
 class Array5
{
     public static void main(String[] args)
   {
       int size1, size2, size, i, j, k;
       int arr1[] = new int[50];
       int arr2[] = new int[50];
       int merge[] = new int[100];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array 1 Size : ");
       size1 = scan.nextInt();
	   
       System.out.print("Enter Array 1 Elements : ");
       for(i=0; i<size1; i++)
       {
           arr1[i] = scan.nextInt();
       }
	   
       System.out.print("Enter Array 2 Size : ");
       size2 = scan.nextInt();
	   
       System.out.print("Enter Array 2 Elements : ");
       for(i=0; i<size2; i++)
       {
           arr2[i] = scan.nextInt();
       }
	   
       System.out.print("Merging the Arrays...\n");
       for(i=0; i<size1; i++)
       {
           merge[i] = arr1[i];
       }
	   
       size = size1 + size2;
	   
       for(i=0, k=size1; k<size && i<size2; i++, k++)
       {
           merge[k] = arr2[i];
       }
	   
       System.out.print("Now the New Array after Merging is :\n");
       for(i=0; i<size; i++)
       {
           System.out.print(merge[i] + "  ");
       }
   }
}