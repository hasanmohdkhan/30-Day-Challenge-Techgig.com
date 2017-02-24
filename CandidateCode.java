/* Read inputSTDIN.  Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class CandidateCode{
    
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
	
	int mRow=scan.nextInt(); 
	
	int mColumn=scan.nextInt();
	int[][] mArrayA=new int[mRow][mColumn];
	
	for(r=0;r<mArrayA.length;r++)
	{
	 for(c=0;c<mArrayA[r].length;c++)
	 {  
	      mArrayA[r][c]=scan.nextInt();
	  //System.out.print(" ");
	   
	   }
//	System.out.println(" ");
	   
	   }
	// Array B  Here :::::

	int mRowTwo=scan.nextInt(); 

	int mColumnTwo=scan.nextInt();
	int[][] mArrayB=new int[mRowTwo][mColumnTwo];
	
	for(r=0;r<mArrayB.length;r++)
	{
	 for(c=0;c<mArrayB[r].length;c++)
	 {  
	      mArrayB[r][c]=scan.nextInt();
	 // System.out.print(" ");
	   
	   }
	  //System.out.println(" ");
	   } 
	 
	  int sum[][]=mMatrixSum(mArrayA, mArrayB);
      int k;
	  //System.out.print(" "); 
	  for (i=0;i<sum.length;i++){
	     for(j=0;j<sum[i].length;j++){
	           
	      System.out.print(sum[i][j]); 
	      if(j==0){
	       System.out.print(" ");
	       }
	       
	       if(j==1){
	       System.out.print(" ");
	       }
	       
	      
	       }
	       System.out.println();
	      }
	   
	
	
	

   }
}
