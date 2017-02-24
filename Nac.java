
/* Read inputSTDIN. Print your output to STDOUT*/
import java.*;
import java.io.*;
import java.util.*;

public class Nac{
    // conter mehtod for digit 
    public static int digitCounter(int n){
       int counter=1;
        while(n>10){
          n=n/10;
          counter++;
        }
        System.out.println("conter : " +counter);
        return counter;
    }
    // method for calculating power per digit
    
    public static double cube(int n ,int m){
         System.out.println("n :"+n+ " m : " +m);
         double c=Math.pow(n,m);
        System.out.println("c :" +c);
        return c;
    }    
     /* Below method used to pass counter of digit 
      * suming power of digit i.e n^m 
      * n = given input 
      * m = counter i.e no. 123 has m=3 (1,2,3)
      * 
      */
        
    public static boolean isArm(int n){
        int m=n;// new variable for n as we divide by 10 it reduce given number by 1 digit( last digit)
        double c=0;
        int temp=m ;
      
        int mDigitCounter=digitCounter(n); 
        
        while(m>0){
            int  a=m%10;
            m=m/10;
            double mCube=cube(a,mDigitCounter);

          
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