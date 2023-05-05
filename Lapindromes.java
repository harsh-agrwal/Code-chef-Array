/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0){
		    String str=sc.next();
		    int len=str.length();
		    String str1=str.substring(0,len/2);
		    String str2="";
		    if(len%2!=0)
		        str2=str.substring(len/2+1);
		    else
		        str2=str.substring(len/2);
		    char ch1[]=str1.toCharArray();
		    char ch2[]=str2.toCharArray();
		    Arrays.sort(ch1);
		    Arrays.sort(ch2);
		    boolean res = Arrays.equals(ch1,ch2);
		    
		    if(res==true)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		} 
	}
}
