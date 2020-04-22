import java.util.*;
class Array2 {
   public static void main(String args[])
   {int array[],i,position;
   array = new int[10];
   Scanner s1 = new Scanner(System.in);
   System.out.print("Input the numbers");
    for (i = 0; i < 10; i++)
      array[i]= s1.nextInt();
 
  System.out.print("Input a number to search\n");
   int search = s1.nextInt();
   position = insert(array,search);
 
   if (position == -1)
      System.out.println(+search+ "isn't present at ");
   else
    System.out.println(+search+" is present at location " +(position));
    
 }
 
  public static int insert(int array[],int find) {
   int i;
 
   for (i =0;i<10;i++ ) {
      if (array[i] == find)
         return i;
   }
 
  return 1;
}}