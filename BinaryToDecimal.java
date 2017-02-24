/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class BinaryToDecimal {
   public static void main(String args[] ) throws Exception {
       //Write code her
       
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter : ");
       int mBinary=sc.nextInt();
       int dec=0;
       int power=0;
       while(mBinary>0){
        int temp=mBinary%10;
        dec +=temp*Math.pow(2,power);
        mBinary=mBinary/10;
        power++;
         
        
        }
       System.out.print("Binary : "+mBinary +" Decimal : " +dec);
     
        
        
        
       

   }
}
