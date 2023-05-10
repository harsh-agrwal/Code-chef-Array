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
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    int[] arr = new int[n];
		    int c=0,i=0;
		    for( i=0;i<n;i++)
		    {
		        arr[i]=in.nextInt();
		        if(arr[i]>=1 && arr[i]<=7)
		        {
		            c=i+1;
		        }
		    }
		    System.out.println(c);
		}
	}
}
