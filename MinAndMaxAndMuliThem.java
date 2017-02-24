/* Read input from STDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class MinAndMaxAndMuliThem {
   public static void main(String args[] ) throws Exception {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter Size : ");
   int mSize=sc.nextInt();
   System.out.print("Values : ");
   int[] Array=new int[mSize];
   for(int i=0;i<Array.length;i++){
    Array[i]=sc.nextInt();
    }
   Arrays.sort(Array);
   System.out.println("Min : "+Array[0]);
   System.out.println("Max : "+Array[Array.length-1]);
   
   System.out.println("Multiply : "+Array[0]*Array[Array.length-1]);
	

   }
}
