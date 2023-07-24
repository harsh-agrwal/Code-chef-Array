/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static long[] maxScore(long []arr,int n)
    {
        Arrays.sort(arr);
        long []ans= new long[n];
        int index=0;
        long prev=0;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]= arr[i]+prev;
            prev+=arr[i];
        }
        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t= scan.nextInt();
		while(t-->0)
		{
		    int n= scan.nextInt();
		    long []arr= new long[n];
		    for(int i=0;i<n;i++)
		      arr[i]= scan.nextInt();
		    long ans[]= maxScore(arr,n);
		    for(long num:ans)
		      System.out.print(num+" ");
		    System.out.println();
		}
	}
}
