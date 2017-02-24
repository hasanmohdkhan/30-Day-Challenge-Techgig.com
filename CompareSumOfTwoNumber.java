/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class CompareSumOfTwoNumber{
   public int numberSumMethod(int a){
     int rem;
     int sum=0;
       while(a>0){
        rem=a%10;
        sum=sum+rem;
        a=a/10;
         }  
    
    return sum;
    
    
    } 
    
   public static void main(String args[] ) throws Exception {
   Scanner  sc=new Scanner(System.in);
   System.out.print("n1: ");
   int n1=sc.nextInt();
   System.out.print("n2: ");
   int n2=sc.nextInt();
   int temp1=n1;
   int temp2=n2;
   CompareSumOfTwoNumber obj=new CompareSumOfTwoNumber();
   
   int sum1=obj.numberSumMethod(n1);
   int sum2=obj.numberSumMethod(n2);
   System.out.println("Sum 1: "+sum1);
   System.out.println("Sum 2: "+sum2);   
   System.out.println("Max: "+Math.max(sum1,sum2)); 
   if(sum1==sum2){
    System.out.println("Both Are Equals");
    
    }
   
   if(sum1==Math.max(sum1,sum2)){
    System.out.println("Num 1: "+n1);
    
    } 
   if(sum2==Math.max(sum1,sum2)){
    System.out.println("Num 2: "+n2);
       
   }


      }

}
