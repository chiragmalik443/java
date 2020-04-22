public class Linearsearch {    
public static int linearSearch(int[] arr, int c )   
  {
    
        for(int i=0;i<arr.length;i++)
        {    
            if(arr[i] == c ){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){ 
     int[] a1= {10,20,30,50,70,90};    
        int c = 90;         
           
        System.out.println(c+" is found at index: "+linearSearch(a1, c));    
    }    
}    