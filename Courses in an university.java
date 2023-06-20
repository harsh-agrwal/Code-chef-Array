/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        int c[] = new int[n+1];
	       // int a[] = new int[n+1];
	        int m=0;
	       // Arrays.fill(a,0);
	        for(int i=1;i<=n;i++)
	        {
	            c[i]=sc.nextInt();
	            if(c[i]>m)
	            m=c[i];
	        }

	        System.out.println(n-m);
	        
	        
	    }
	}
}
