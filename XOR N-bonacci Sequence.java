/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int f[]=new int[n];
		int b[]=new int[n+1];
		for(int i=0;i<n;i++){
		    f[i]=sc.nextInt();
		}
		b[0]=0;
		for (int i=1; i<=n; i++){
		    b[i]=b[i-1]^f[i-1];
		}
		while(q-->0){
		    int s= sc.nextInt();
		    s=s%(n+1);
		    System.out.println(b[s]);
		}
	}
}
