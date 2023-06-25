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
		int n=sc.nextInt();
		int row[]=new int[n];
		int col[]=new int[n];
		int q=sc.nextInt();
		while(q-->0){
		    String res=sc.next();
		    int num=sc.nextInt();
		    int value=sc.nextInt();
		    if(res.equals("RowAdd"))
		        row[num-1]+=value;
		    else
		        col[num-1]+=value;
		}
		int max_col=0,max_row=0;
		for(int i=0;i<n;i++){
		    max_col=Math.max(max_col,col[i]);
		    max_row=Math.max(max_row,row[i]);
		}
        System.out.println(max_row+max_col);
	}
}
