/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


class  FactNum{
    
    public static int fact(int n){
        if(n==0){
            
         return 1;    
            
        }
        else
        
         return (n*fact(n-1));
    
    }
    
    
    
    public static void main(String args[] ) throws Exception {
       //Scanner
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int N = s.nextInt();
        int result =fact(N);
         System.out.print("Factorial of : " + N+ "  is = ");
         System.out.print(result);
    }
}
