
/* Read inputSTDIN. Print your output to STDOUT*/
import java.*;
import java.io.*;
import java.util.*;


public class ArmstrongNumber {
    
    
     public static int cube(int n){
            return n*n*n;
              
            }
    
    
    
    
    public static boolean isArm(int n){
        
        int m=n;
        int c=0;
        int temp=m ;
        while(m>0){
         int  a=m%10;
          m=m/10;
           int mCube=cube(a);
         
          
          
          c=c+(mCube);
          
           }
           
        if (temp==c){
          return true;
       
        }
         
        else
        return false;
    
    
    }
    
   public static void main(String args[] ) throws Exception {

	//Write code here

	Scanner scan=new Scanner(System.in);
	System.out.print("Enter no to be Check : ");
	int mInput=scan.nextInt();
	boolean result=isArm(mInput);
	
	if(result==true){
	System.out.println("True"); }
	else
	System.out.println("False");
	
	
	
	
   }
}