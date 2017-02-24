/* Read inputSTDIN.  Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class ArrayMatrixSum {
    
      public static int[][] mMatrixSum(int mArrayA[][],int mArrayB[][]){
          int i,j;
         
        int mRows=mArrayA.length;
        int mColumn=mArrayA[0].length;
        int[][] mSumArray=new int[mRows][mColumn];
        for(i=0;i<mRows;i++){
        for(j=0;j<mColumn;j++){
         mSumArray[i][j]=mArrayA[i][j]+mArrayB[i][j]; 
         }        
        }
        return mSumArray;
         }
         
     
    
    
    
    
    
    
    
   public static void main(String args[] ) throws Exception {
       int r,c;
       int i,j;
       
	//Write code here
	Scanner scan=new Scanner(System.in);
	// Array A Code
	System.out.print("Enter The Row : ");
	int mRow=scan.nextInt(); 
	System.out.print("Enter The Column: ");
	int mColumn=scan.nextInt();
	int[][] mArrayA=new int[mRow][mColumn];
	System.out.print("Enter value :");
	for(r=0;r<mArrayA.length;r++)
	{
	 for(c=0;c<mArrayA[r].length;c++)
	 {  
	      mArrayA[r][c]=scan.nextInt();
	   System.out.print(mArrayA[r][c]+ " ");
	   
	   }
	 System.out.println(" ");
	   
	   }
	// Array B  Here :::::
	System.out.print("Enter The Row : ");
	int mRowTwo=scan.nextInt(); 
	System.out.print("Enter The Column: ");
	int mColumnTwo=scan.nextInt();
	int[][] mArrayB=new int[mRowTwo][mColumnTwo];
	System.out.print("Enter value :");
	for(r=0;r<mArrayB.length;r++)
	{
	 for(c=0;c<mArrayB[r].length;c++)
	 {  
	      mArrayB[r][c]=scan.nextInt();
	   System.out.print(mArrayB[r][c]+" ");
	   
	   }
	   System.out.println(" ");
	   } 
	 
	  int sum[][]=mMatrixSum(mArrayA, mArrayB);
	  System.out.println("Sum Of Matirx");
	 
	  for (i=0;i<sum.length;i++){
	     for(j=0;j<sum[i].length;j++){
	      System.out.print(" "+sum[i][j]); 
	       }
	       System.out.println();
	      }
	   
	
	
	

   }
}