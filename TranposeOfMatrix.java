
/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class TranposeOfMatrix {
   public static void main(String args[] ) throws Exception {
        //Write code here
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Row :");
	int row=sc.nextInt();
	System.out.print("Enter Column :");
	int col=sc.nextInt();
	System.out.print("Enter Value :");
	// array intialised & declared
	int[][] mMatrix= new int[row][col];
	int r,c;
	for(r=0;r<mMatrix.length;r++){
	   for(c=0;c<mMatrix[r].length;c++){
	     mMatrix[r][c]=sc.nextInt();
	   }
	   }
	// printing input Matrix :
	for(r=0;r<mMatrix.length;r++){
	   for(c=0;c<mMatrix[r].length;c++){
	     System.out.print(mMatrix[r][c]);
	   }
	   System.out.println();
	   }
	
	// transpose matrix declared
	int[][] mTranpose= new int[row][col];
	for(r=0;r<mMatrix.length;r++){
	   for(c=0;c<mMatrix[r].length;c++){
	     mTranpose[c][r]=mMatrix[r][c];
	   }
	   
	   }
	   
	   System.out.println("Transpose :");
	for(r=0;r<mMatrix.length;r++){
	   for(c=0;c<mMatrix[r].length;c++){
	     System.out.print(mTranpose[r][c]);
	     
	     if (c >= 0 && c < mMatrix[r].length-1){
	         System.out.print(" ");
	         
	     }
	   }
	   System.out.println();
	   }
	
	
	
	

   }
}