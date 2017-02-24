/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class EvenOddInGivenDigit {
   public static void main(String args[] ) throws Exception {
   int countE=0;
   int countO=0;
   int sumEven=0;
   int sumOdd=0;
   Scanner sc= new Scanner(System.in);
   System.out.print("Value: ");
   int mNum=sc.nextInt();
   while(mNum>0){
    int rem=mNum%10;
     if(rem%2==0){
       //even block
       sumEven=rem+sumEven;
       countE++;
       }
    
    else 
    
    sumOdd=rem+sumOdd;
    mNum=mNum/10;
    
    }
	System.out.println("Even sum: "+sumEven);
    System.out.println("Odd sum: "+sumOdd);
    System.out.println("Difference: "+Math.abs(sumEven-sumOdd));

   }
}
