/*This program take input as String (but only number)
 * next() is used to scan String
 * Integer.parseInt(""+s.charAt(i)) convert string to number
 * 
 */


import java.util.Scanner;
public class TestClass {
public static void main(String[] args) {

String s;
int[] ac = new int[10]; //need to understand
// Array 1d For size of 10 for digit display 
// 0....9
System.out.print("Enter Number : ");
Scanner sc=new Scanner(System.in);
s=sc.next();

int n=s.length();
for(int i=0;i<n;i++)
{

int a = Integer.parseInt(""+s.charAt(i));
ac[a]++;
}
for(int i=0;i<=9;i++)
{
System.out.println(i+" "+ac[i]);
}
}
}