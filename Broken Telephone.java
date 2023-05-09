/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class fastscanner
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String next()
    {
            while(st==null || !st.hasMoreTokens())
            {
            try{
                    
                st=new StringTokenizer(br.readLine());
            }
        catch(IOException e){}
            }
        return st.nextToken();
    }
    int nextInt()
    {
        return Integer.parseInt(next());
    }
    float nextFloat()
    {
        return Float.parseFloat(next());
    }
    long nextLong()
    {
        return Long.parseLong(next());
    }
    double nextDouble()
    {
        return Double.parseDouble(next());
    }
    String nextLine()
    {
        String s="";
        try{
            s=br.readLine();
        }
        catch(IOException e){}
        return s;
    }
}
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		fastscanner s=new fastscanner();
		PrintWriter w=new PrintWriter(System.out);
		int t=s.nextInt();
		while(t-->0)
		{
		    int sum=0;
		    int n=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++) a[i]=s.nextInt();
		    if(a[0]==a[1])sum++;
		    if(a[n-2]==a[n-1])sum++;
		    for(int i=1;i<n-1;i++)
		    {
		        if(a[i]==a[i+1] && a[i]==a[i-1])
		        {
		            sum++;
		        }
		    }
		    w.println(n-sum);
		}
w.flush();
	}
}
