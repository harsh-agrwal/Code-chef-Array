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
	        int t=sc.nextInt();
	        while(t-->0)
	        {
	            int x=sc.nextInt();
	            int y=sc.nextInt();
	            
	            String str=sc.next();
	            int work=0;
	            int count=0;
	            int longwork=0;
	            for(int i=0;i<str.length();i++)
	            {
	                if(str.charAt(i)=='1')
	                {
	                    count++;
	                    work++;
	                }
	                else 
	                {
	                    if(longwork<work)
	                      longwork=work;
	                    work=0;
	                }
	                
	                if(longwork<work)
	                      longwork=work;
	            }
	            System.out.println(x*count + y*longwork);
	        }
	}
}
