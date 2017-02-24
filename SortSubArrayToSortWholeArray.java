/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.*;
import java.io.*;
public class SortSubArrayToSortWholeArray {
    
    public  static void findSubarrayToSort(int array[], int size){
    int left , right,max,min,i;
    // left traverse
    for(left=0;left<size-1;left++)
    {if(array[left]>array[left+1])
        break;
    }
    
    if(left==size-1)
    {
        System.out.print("Array is Sorted");
    return;
    }
    // right traverse
    for(right=size-1 ; right > 0; right--)
    { if(array[right] < array[right-1])
        break;
    
    }
    // max & min 
    
    max=array[left];
    min=array[right];
    for(i=left+1;i<=right;i++)
    {if(array[i] < min)
      { min=array[i]; }
    if (array[i] > max){
        max=array[i];
    }
    
    }
    
    // traversing left to right to find no.smaller than max
    for(i=size-1;i>= right+1;i--){
    if(array[i]< max){
    right=i;
    break;
    }
    
    }
    
    
    for(i=0;i<left;i++){
    if(array[i]>min){
    left=i;
    break;
    }
    
    }
    //System.out.println("left : "+ left +" right : " +right);
    for(i=left;i<=right;i++){
    System.out.print(array[i]);
     if ( i>=0  &&   i < right)
    System.out.print("||");
    }
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
   public static void main(String args[] ) throws Exception {

	//Write code here
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Size : ");
	int mSize=sc.nextInt();
	
	int[] array=new int[mSize];
	System.out.print("Values : ");
	for(int i=0;i<array.length;i++){
	   array[i]=sc.nextInt();
	   }
	
	 findSubarrayToSort(array, mSize);

   }
}