//CandidateCode
/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;

public class MatrixDiagonalsSum {
   public static void main(String args[] ) throws Exception {
    int sumD1=0; 
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter row size: ");
    int mRow=sc.nextInt();
    System.out.print("Enter col size: ");
    int mCol=sc.nextInt();
    System.out.print("Enter Value: ");
    int[][] Array=new int[mRow][mCol];
    for(int r=0;r<Array.length;r++)
	{ for(int c=0;c<Array[r].length;c++){
	   Array[r][c]=sc.nextInt();
	    
	  }
	   }
	  // Matrix printing block 
	 for(int r=0;r<Array.length;r++)
	{ for(int c=0;c<Array[r].length;c++){
	   System.out.print(Array[r][c]+ " ");
	    
	  }
	   System.out.println();
	   }
   // End of Printing
	   
	// diagonal sum block   
	for(int r=0;r<Array.length;r++)
	{ for(int c=0;c<Array[r].length;c++){
	    if(r==c){
	        sumD1+=Array[r][c];
	   }
	    
	  }
	   }   
	   System.out.println("Sum Diagonal 1: "+sumD1);
	  // end of d1 vlock
	 
	 //diagonal 2 block
	 int count=0;
	 int sumD2=0;
	 int temp;
	 int r,c;
	 for(  r=0,c=mCol-1;r<Array.length && c>=0;r++ ,c--)
	{     
	      // r=0 c=3-1=2 v=0,2
	      //r=1 c=2-1=1 v=1,1
          //r=2 c=2-1=1 v=2,1  	        
	     sumD2=sumD2+Array[r][c];     
	   }   
	   System.out.println("Sum Diagonal 2: "+sumD2);
	
	  if(sumD1==sumD2){
	   System.out.print("Equal");
	   }
	 
	 else if(sumD1>sumD2){
	   System.out.print("diagonal 1: "+sumD1);
	   } 
	 else
	  System.out.print("Diagonal 2: " +sumD2);
	 
	 
	 
	 
	 
}
}
