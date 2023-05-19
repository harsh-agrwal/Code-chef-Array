/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    long []arr=new long[n];
		    for(int i=0;i<n;i++)
		      arr[i]=sc.nextLong();
		    
		    long allocation=arr[0];
		    
		    for(int i=0;i<n-1;i++)
		    {
		        if(arr[i+1]-arr[i] > 0)
		          allocation+=arr[i+1]-arr[i];
		    }
		    
		    System.out.println(allocation);
		}
	}
}
