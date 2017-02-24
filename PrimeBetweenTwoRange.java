
/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
import java.*;
public class PrimeBetweenTwoRange {
    
    public static int prime(int n, int m){
       int i;
      int count=0;
      int div=n/2;
      for(i=2;i<=m;i++)  
        {  int j;
         for(j=2;j*j<=i;j++)
           {  if(n % i==0){
              break;
                                }
             else if(j+1 > Math.sqrt(i))
             {
             count++; 
            }
            
            
        }
        
    
    }
        return count;
    }
    
    
   public static void main(String args[] ) throws Exception {

	//Write code here
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Range: ");
	int mStartOfRange= sc.nextInt();
	int mEndOfRange= sc.nextInt();
    int 	result=prime(mStartOfRange,mEndOfRange);
    System.out.print(result);
   }
}