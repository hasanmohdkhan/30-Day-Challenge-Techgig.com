/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class EvenOddNumAverage {
public static void mAverageFunction(double even,double odd,int totalEven,int totalOdd){
    double averageEven,averageOdd;
    averageEven=even/totalEven;
    averageOdd=odd/totalOdd;
    System.out.println("average Even :"+averageEven);
    System.out.println("average Even :"+averageOdd);
    
    double mSum=averageOdd+averageEven;
    System.out.println("Sum of Both Average: "+mSum);
    
    
    int mAverageSum=(int)Math.round(averageOdd+averageEven);
    System.out.println("Sum of Both Average: "+mAverageSum);
    
    
    
    
    
    }
    
    
    
    
    
    
    
    public static void  evenOddNumberFinder(double array[]){
      int  countEven=0;
      int  countOdd=0;
      double mSumOdd=0;
      double mSumEven=0;
     // int i;
     for(int i=0;i<array.length;i++){
        if(array[i]%2==0){
       
        mSumEven=mSumEven+array[i];
        countEven++;
        }
        if(array[i]%2!=0){
        
        mSumOdd=mSumOdd+array[i];
        countOdd++;
        }
      }
    System.out.println("Even "+"Sum :  "+mSumEven+" Count :" +countEven);
    System.out.println("Odd "+"Sum :  "+mSumOdd+" Count :" +countOdd);
    mAverageFunction(mSumEven,mSumOdd,countEven,countOdd);
    
    
    } 
    
    
    
   public static void main(String args[] ) throws Exception {
   //Write code here
   int i;
   Scanner sc=new Scanner(System.in);
   System.out.print("Size :");
   int mSize=sc.nextInt();
   System.out.print("Values :");
   double[] Array=new double[mSize];
   for(i=0;i<Array.length;i++){
    Array[i]=sc.nextDouble();
    }
   
   evenOddNumberFinder(Array); 
   
   
   
   

   }
}