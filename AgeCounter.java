
/* Read inputSTDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class AgeCounter {
   public static void main(String args[] ) throws Exception {

	//Write code here
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter age: ");
	int mAge=sc.nextInt();
	if(mAge < 10){
	   System.out.println("I am happy as having no responsibilities."); 
	    
	    
	}
	else if((mAge >=10) && (mAge <18))
	
	{
	 System.out.println("I am still happy but starts feeling pressure of life.");   
	    
	    
	}
	
	else if(mAge>=18){
	   System.out.println("I am vary happy as i handled the pressure very well."); 
	    
	    
	    
	}
	
	
	
	
	
	

   }
}