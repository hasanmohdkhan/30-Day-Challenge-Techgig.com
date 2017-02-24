/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.util.Arrays;
import java.io.*;
public class StringSort{
   public static void main(String args[] ) throws Exception {
   //Write code here
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Size :");
    int mArraySize=scan.nextInt();
    String[] mArray=new String[mArraySize];
    int i;
    System.out.println("Enter String :"); 
    for(i=0;i<mArraySize;i++){ 
      mArray[i]=scan.next();
      }
     Arrays.sort(mArray);
    System.out.println("Sorted Array: ");
     for(i=0;i<mArray.length;i++)
     
     {System.out.println(mArray[i]);   
        }
   
   
   

   }
}