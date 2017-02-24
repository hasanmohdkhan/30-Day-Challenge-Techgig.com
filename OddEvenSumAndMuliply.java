/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class OddEvenSumAndMuliply {
   public static void evenOddFinding(int array[]){
    int mEvenSum=0;
    int mOddSum=0;
    for(int i=0;i<array.length;i++){
        if(array[i]%2==0){
            mEvenSum=mEvenSum+array[i];
            
        }
        if(array[i]%2!=0){
         mOddSum=mOddSum+array[i];
          
        
        }
        
        
    
    
    
    }
       System.out.println("EVEN sum: "+ mEvenSum);
       System.out.println("Odd sum: "+ mOddSum);
       System.out.println("Multi : " +mEvenSum*mOddSum);
    
    
    
    
    }
    
    
    
    
    
   public static void main(String args[] ) throws Exception {
    //Write code here
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter size: ");
    int mArraySize=sc.nextInt();
    int[] array=new int[mArraySize];
    System.out.print("Value :");
    for(int i=0;i<array.length;i++){
     array[i]=sc.nextInt();
    
    }
    
    evenOddFinding(array);
    

   }
}
