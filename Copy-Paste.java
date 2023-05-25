/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
   
class Codechef
{
     public static void solve()
    {
        int n=sc.nextInt();
        int a[]=new int[n];
        int count=1;
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
       HashSet<Integer> h=new HashSet<>();
       for(int i=0;i<n;i++)
       {
           h.add(a[i]);
       }
       System.out.println(h.size());
          
        
    }
    static Scanner sc=new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int t=sc.nextInt();
		while(t-->0)
		{
		    solve();
		}
	}
}
