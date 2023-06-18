/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader sc = new FastReader();
		int n=sc.nextInt();
		while(n-->0)
		{
		    String par=sc.next()+sc.next();
		    int child=sc.nextInt();
		    String name="";
		    for(int i=0;i<child;i++)
		        name+=sc.next();
		    HashMap<Character,Integer>map=new HashMap<>();
		    for(int i=0;i<par.length();i++)
		    {
		        char c=par.charAt(i);
		        if(map.containsKey(c))
		        {
		            int count=map.get(c);
		            map.replace(c,(count+1));
		        }
		        else
		        {
		            map.put(c,1);
		        }
		    }
		    boolean b=true;
		    for(int i=0;i<name.length();i++)
		    {
		        char c=name.charAt(i);
		        if(map.containsKey(c))
		        {
		            int count=map.get(c);
		            if(count<1)
		            {
		                b=false;
		            }
		            else
		            {
		                map.replace(c,count-1);
		            }
		        }
		        else
		            b=false;
		    }
		    if(b==true)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		    //System.out.println(par+" "+name);
		}
	}
}
