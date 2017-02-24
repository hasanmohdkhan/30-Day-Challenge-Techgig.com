/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class SearchInArray {
    public static int seach(int mArray[], int key){
        for(int i=0;i<mArray.length;i++){
        for(int j=i+1;j<mArray.length;j++)
        { 
            if(mArray[i]+mArray[j]==key){
             System.out.print("Found key :" +key);
        
        
        }
          }
        
        }
      return key;
    
    }
    
    
   public static void main(String args[] ) throws Exception {
    //Write code here
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Size :");
    int mArraySize=sc.nextInt();
    int[] mArray=new int[mArraySize]; 
    for(int i=0;i<mArraySize;i++){
     mArray[i]=sc.nextInt();
     }
    // Sorting Array
     Arrays.sort(mArray);
     System.out.print("Enter Key :");
     int key=sc.nextInt();
     
     int result=seach(mArray ,key);
    
     }
}