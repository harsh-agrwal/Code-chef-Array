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
		Scanner in=new Scanner(System.in);
		int t,n;
		t=in.nextInt();
		while(t-->0)
		{
		    n=in.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[100001];
		    int i;
		    for(i=0;i<n;i++)
		    {
		        a[i]=in.nextInt();
		        b[a[i]]=1;
		    }
		    Arrays.sort(a);
		    int sum=0;
		    for(i=0;i<100001;i++)
		    {
		        if(b[i]!=0  &&  i!=a[0])
		        {
		            sum+=1;
		        }
		    }
		    System.out.println(sum+1);
		}
		
	}
}
