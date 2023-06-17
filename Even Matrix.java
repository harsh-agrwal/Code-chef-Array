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
		
		while(t-- >0)
		{
		    int n=sc.nextInt();
		    
		    for(int i=0;i<n;i++)
		    {
		        if(i%2==0)
		        {
		            for(int j=1;j<=n;j++)
		            {
		                System.out.print((n*i)+j+" ");
		            }
		        }
		        else
		        {
		            for( int j=n;j>0;j--)
                          {
                             System.out.print((n*i)+j+" ");
                          }
                }
                 System.out.println();
		        }
		    }
		}
	}
