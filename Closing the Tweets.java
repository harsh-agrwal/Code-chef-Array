import java.util.*;
import java.lang.*;
import java.io.*;
class Solution
{
	public static void main (String[] args) throws java.lang.Exception 
        {
	    Scanner se=new Scanner(System.in);		
	    int g=se.nextInt();
	    int h=se.nextInt();	    
	    int ct=0;
	    int []vc = new int[g];
	    for(int i = 0; i<h; i++)
           {	        
	        if(se.next().equals("CLICK")) 
                {
	            int x=se.nextInt(); 
	            if(vc[x-1] == 0)
                    {
	                vc[x-1] = 1;
	                ct++;
	            }
	            else {
	                vc[x-1] = 0;
	                ct--;
	            }
	        }
	        else {
	            vc = new int[g];
	            ct=0;
	        }
	    System.out.println(ct);        
        }
        se.close();
	}
}
