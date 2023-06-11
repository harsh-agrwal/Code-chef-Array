/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    String str=sc.next();
		    long count=0;
		    for(int i=0;i<str.length();i++)
		    {
		        char ch=str.charAt(i);
		        if(ch=='1') count++;
		    }
		    System.out.println(count*(count+1)/2);
		}
	}
}
