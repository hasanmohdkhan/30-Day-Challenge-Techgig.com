/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class ConsecutiveNumbers {
    
   public boolean consecutiveNumber(int arr[]){
      int i,j;
      boolean flag=false;
      for(i=0;i<arr.length-1;i++){
       if(Math.abs(arr[i]-arr[i+1])==1){
         System.out.println("Compare: " +"arr[i+1]: " +arr[i+1]+ " arr[i] :"+arr[i]);
         flag=true;
       }
           
        else{
        System.out.println("False "+"arr[i+1]: " +arr[i+1]+ " arr[i] :"+arr[i]);
        return flag=false;
       
       } 
     }
      
     return flag;
    } 
    
   
   public static void main(String args[] ) throws Exception {
   //Write code here
   Scanner sc=new Scanner(System.in);
   System.out.print("Size: ");
   int mSize=sc.nextInt();
   System.out.print("Value: ");
   int[] Array=new int[mSize];
   for(int i=0;i<Array.length;i++){
   Array[i]=sc.nextInt(); 
   }
   // for removing error 
   // class obj & accessing method using that object i.e obj
   ConsecutiveNumbers obj=new ConsecutiveNumbers();
   
   boolean result=obj.consecutiveNumber(Array);
   if(result==true)
    { 
      System.out.print("True"); 
    }
  else
     System.out.print("False"); 
   
   }
}
