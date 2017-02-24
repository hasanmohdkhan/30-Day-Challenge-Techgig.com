/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class SumOfMatrixRowAndGreaterInThem
 {
   public static void main(String args[] ) throws Exception {

	//Write code here
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter size: ");
	int mRow=sc.nextInt();
	int mCol=sc.nextInt();
	
	int[][] Array=new int[mRow][mCol];
	for(int r=0;r<Array.length;r++){
	   for(int c=0;c<Array[r].length;c++){
	   Array[r][c]=sc.nextInt();
           }
        }
	int chk;
	int mSize=Array.length;
    int[] sum=new int[mSize];    
	
	for(int r=0;r<Array.length;r++){
	    chk=r;//r=0 chk=0
	    while(chk==r){
	   for(int c=0;c<Array[r].length;c++){
	       sum[r]+=Array[r][c];
	       chk++; 
	                           }
            System.out.println("Sum"+r+":"+sum[r]);
      
     }
   
    }
	
	int max;
	max=sum[0];
	for(int i=0;i<sum.length;i++){
	if(sum[i]>max){
	   max=sum[i];
	   }
	   }
    boolean flag=false; 
	for(int i=0;i<sum.length;i++){
	   flag=(sum[i]==max);
	   if(flag==false)
	   break;
	   }   
	   
	 if(flag==true){
	   System.out.print("Equal");
	   
	   }  
	   
	   
	else   
	   
	   
	   for(int i=0;i<sum.length;i++){   
         if(max==sum[i]){
          System.out.print("Row "+(i+1));
          }  
	        
        }
          }
}