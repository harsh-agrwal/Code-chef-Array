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
		
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    long k=sc.nextLong();
		    long arr[]=new long[n];
		    for(int s=0;s<n;s++){
		      arr[s]=sc.nextLong();  
		    }
		      if(k>3*n){
		        k=3*n+(k%(3*n));
		    } 
	     
		    for(int j=0;j<k;j++){
		        long v=(arr[j%n]^arr[n-(j%n)-1]);
		        arr[j%n]=v;}
		      for(int j=0;j<n;j++){
		  System.out.print(arr[j]+" ");
			    
			}
	}
}
}
