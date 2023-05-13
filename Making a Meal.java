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
			Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		   int l=0;
		     int c=0,o=0,d=0,e=0,h=0,f=0;
		    for(int i=0;i<n;i++)
		    {
		    String  s=sc.next();
		    
		     for(int k=0;k<s.length();k++)
		     {
		         char v=s.charAt(k);
		              if(v=='c')c++;
		         else if(v=='o')o++;
		         else if(v=='d')d++;
		         else if(v=='e')e++;
		         else if(v=='h')h++;
		         else if(v=='f')f++;
		         
		     }
		     
		     
		    }
		
		int count=0;
		   int range=(c/2);
		  for(int i=0;i<range;i++)
		  {
		    if((c<=1) || (e<=1) || (o==0) || (d==0) || (h==0) || (f==0))
		    {
		      break;
		    }
		    else
		    {
		      c-=2;
		      e-=2;
		      o--;
		      d--;
		      h--;
		      f--;
		    }
		    count++;
		  }
		  
		  System.out.println(count);
		    
		}
	}
}
