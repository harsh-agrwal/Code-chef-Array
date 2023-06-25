/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    int k=0;
		    for(int i=0;i<n;i++)
		    {
		        k+=2;
		        System.out.print(k+" ");
		    }
		    System.out.println();
		}
	}
}
