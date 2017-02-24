/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class OddEvenIndexSum {
    
   public static void mOddEvenIndex(int array[]){
    int mOddIndexSum=0;
    int mEvenIndexSum=0;
    int oddtotal;
    int size=array.length;
    int[] oddarry=new int[size];
    for(int i=0;i<array.length;i++){
    if(i%2==0){
    
    mEvenIndexSum=mEvenIndexSum+array[i];
    System.out.println("Even: "+mEvenIndexSum + " Index : "+i);
    }
    if(i%2!=0){
    
    mOddIndexSum=mOddIndexSum+array[i];
    System.out.println("ODD: "+mOddIndexSum+ " Index : "+i);
    } }
    System.out.println("Total ODD: "+mOddIndexSum);
    System.out.println("Total Even: "+mEvenIndexSum);
    if(mEvenIndexSum>mOddIndexSum){
    int  eventotal=mEvenIndexSum-mOddIndexSum;
      System.out.println("Total Greter Even: "+eventotal);
    }
    
    if(mOddIndexSum>mEvenIndexSum){
    oddtotal=mOddIndexSum-mEvenIndexSum;
    System.out.println("Total Greter Odd: "+oddtotal);}
    
    
    
    
    
    }
   public static void main(String args[] ) throws Exception {

	//Write code here
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Size : ");
	int mSize=sc.nextInt();
	System.out.print("Values: ");
	int[] Array=new int[mSize];
	for(int i=0;i<mSize;i++){
	   Array[i]=sc.nextInt();
	   }
	
	 mOddEvenIndex(Array);  
	   
	   

   }
}
