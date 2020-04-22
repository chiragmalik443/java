import java.util.Arrays; 
  
public class binary { 
    public static void main(String[] args) 
    { 
        int arr[] = { 100, 209, 218, 220, 365 }; 
  
        int key = 220; 
        int a = Arrays.binarySearch(arr, key); 
        if (a >= 0) 
            System.out.println(key + " found at index = " 
                                                  + a); 
        else
            System.out.println(key + " Not found"); 
  
 
    } 
} 
