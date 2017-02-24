
/* Read inputSTDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class InputTypeChecker {
   public static void main(String args[] ) throws Exception {
     System.out.print("Enter Something: ");
	//Write code here
	Scanner scan=new Scanner(System.in);
	
    if(scan.hasNextInt()){
    System.out.println("This input is of type Integer.");    
    }
    else if (scan.hasNextFloat()){
      System.out.println("This input is of type Float.");  
    }
    else if (scan.hasNext()){
    System.out.println("This input is of type string.");    
        
    }
    
    else 
    System.out.println("This is something else.");
	
	
	
	
	
	

   }
}