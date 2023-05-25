/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		while(T>0)
		{
		    String str1=s.next();
		    int l1=str1.length();
		    String str2=s.next();
		    int l2=str2.length();
		    int count=0;
		    int r;
		    int fre1[]=new int[123];
		    int fre2[]=new int[123];
		    for(int i=0;i<l1;i++)
		    {
		        r=(int)str1.charAt(i);
		        fre1[r]++;
		    }
		    for(int i=0;i<l2;i++)
		    {
		        r=(int)str2.charAt(i);
		        fre2[r]++;
		    }
		    for(int j=0;j<123;j++)
		    {int k=Math.min(fre1[j],fre2[j]);
		        count=count+k;
		    }
		    System.out.println(count);
		    T--;
		}
	}
}
