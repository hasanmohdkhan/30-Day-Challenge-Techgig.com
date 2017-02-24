
/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class GCD {
    public static int gcdCalcultion(int n1 , int n2){
    while(n2 > 0){
	    int r=n1 % n2;
	    n1=n2;
	    n2=r;
	   }
	   
	   return n1;
   } 
    
    
    
    
    
   public static void main(String args[] ) throws Exception {

	//Write code here
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter N1 & N2 :");
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int reult=gcdCalcultion(n1 ,n2);
	System.out.print("GCD: " +reult);
}
}