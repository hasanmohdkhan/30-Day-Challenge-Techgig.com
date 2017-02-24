/* Read input from STDIN. Print your output to STDOUT*/
import java.util.Scanner;
import java.io.*;
public class GreaterInGivenNumber {
   public static void main(String args[] ) throws Exception {
   int large;
   Scanner sc=new Scanner(System.in);
   System.out.print("Value: ");
   int mNum=sc.nextInt();
   large=mNum%10;
   while(mNum>0){
    
    int  digit=mNum%10; 
    int  temp1=digit; 
         
     
     if(temp1>large){
         large=digit;
        }    
    mNum=mNum/10;
    System.out.println("Loop Print ");
    System.out.println("Highest Number: " +large); 
    
    
    
    
    }
   System.out.println("Result :");
    System.out.println("Highest Number: " +large);   
       

   }
}
