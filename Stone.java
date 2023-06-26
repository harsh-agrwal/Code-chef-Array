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
		long n=sc.nextLong();
		long k=sc.nextLong();
		
		if(k==0)
		   k=0;
		else if(k%2==0)
		{
		   k=2;
		}
		else
		{
		    k=1;
		}
		
		long [] arr=new long[(int)n];
		long maxi=0;
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		   
		}
		
		while(k-->0)
		{
		   for(int i=0;i<n;i++)
		   {
		       maxi=Math.max(maxi,arr[i]);
		   }
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=maxi-arr[i];
		        
		    }
		}
		
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}
		
	}
}
