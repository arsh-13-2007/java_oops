// arrays are mutable in nature 
import java.util.*;


public class arrays {
    public static void main(String args[]){
    // represent method first 
    
    int arr[] = new int[5] ; 
    arr[0] = 6 ; 
    arr[1] = 7 ; 
    arr[2] = 8 ; 
    arr[3] = 9; 
    arr[4] = 10 ; 
    System.out.println(arr[1]) ; 

    // represent method second 

    int arr1[] = {1,4, 2,3,5 ,0} ; 

    // inbuild function for sorting  and applying binary search 


    Arrays.sort(arr1) ;  


    int key = 0 ; 
    int foundatindex = Arrays.binarySearch(arr1, key) ; 

    System.out.println("index number of "+ key+" in array is:" + foundatindex) ; 



    System.out.println("length of the array is :" + arr.length) ; 
    System.out.println(Arrays.toString(arr1)) ; 


    }
}
 