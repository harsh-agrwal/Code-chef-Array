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
        long a[][]=new long[(int)n][(int)n];
        long countc=0,countr=0,res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextLong();
            }
        }
         for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==0)
                {
                 countr++;
                 break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[j][i]==0)
                {
                 countc++;
                 break;
                }
            }
        }
        if(countc==n&&countr==n)
          System.out.println("YES");
        else 
         System.out.println("NO");
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
