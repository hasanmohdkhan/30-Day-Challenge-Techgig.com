/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class RecusionPowerOfTwo {
    public static int power(int base, int expo){
        if(expo==0){
        return 1;
        }
        else 
       return base * power(base , expo -1);
        
        
     
    }
        
        
            
            
            
    public static void main(String args[] ) throws Exception {
       //Write code here
       Scanner sc =new Scanner(System.in);
       System.out.print("Enter Base & Power :");
       int mNum = sc.nextInt();
       int mPow=sc.nextInt();
       
       int mResult=power(mNum,mPow);
       System.out.print(mResult);
       }
}