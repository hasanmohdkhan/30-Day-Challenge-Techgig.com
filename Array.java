
/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class Array{
    
    public static void mMax(int arr[]){
        // array is sorted when enter this method
     int i;
     // logic for finding highest but it also find by arr[arr.length-1]
     // Array Size start from 1 so it require arr[arr.length-1] for highest
     int max=arr[0];
     for(i=1;i<arr.length;i++){
        if(arr[i]>max)
         max =arr[i];
        
        }
        max =max;
       System.out.println("MAX of Array :" +max);
       // for second last index of array
     System.out.println("Second largest : " +arr[arr.length-2]);
      
       
       System.out.println("largest : " +arr[arr.length-1]);
       
       
    }
      
    
    
    
    
    
   public static void main(String args[] ) throws Exception {
       //Write code here
       int i;
       Scanner scan=new Scanner(System.in);
       System.out.print("Array Size :");
       int mArraySize =scan.nextInt();
       int[] arr= new int[mArraySize];// array declared & instantiated 
       System.out.print("Enter no in array : ");
       for(i=0;i<arr.length;i++){
          arr[i] =scan.nextInt();
        
        }
	    
 	   
	       Arrays.sort(arr);
	  for(i=0;i<arr.length;i++){
 	      System.out.println("i : "+ i+  " Value : " +arr[i]);
 	      }  
	       
	       
	  mMax(arr);

   }
}