/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     static void solve()
     {
        long n=sc.nextLong();
        long k=sc.nextLong();
        int a[]=new int[(int)n];
        for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
        if(n==1)
         System.out.println("YES");
        else
        {
              Arrays.sort(a);
             // System.out.println(a[0]+" "+a[(int)n-1]);
              if(a[0]+a[(int)n-1]>k)
                  System.out.println("NO");
              else
               System.out.println("YES");
        }
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
