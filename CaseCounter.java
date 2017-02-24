
/* Read inputSTDIN. Print your output to STDOUT*/
import java.util.*;
import java.io.*;
public class CaseCounter{
   public static void main(String args[] ) throws Exception {
     int countLower=0;
     int countUpper=0;
	//Write code here
	Scanner scan= new Scanner(System.in);
	System.out.print("Enter String: ");
	String str=scan.nextLine();
	
	for(int i=0;i<str.length();i++){
	 if(Character.isUpperCase(str.charAt(i)))
	 countUpper++;
	  
	 
	  if(Character.isLowerCase(str.charAt(i))) 
	   {countLower++;}
	   
	   }
	
	System.out.println("Upper Case : " +countUpper);
	System.out.println("Lower Case : " +countLower);
	
	
	
	

   }
}