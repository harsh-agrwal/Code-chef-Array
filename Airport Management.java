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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int[] d = new int[n];
		    int[] freq = new int[1440];
		    
		    for (int i=0; i<n; i++){
		        a[i] = sc.nextInt();
		        freq[a[i]]++;
		    }
		    
		    for (int i=0; i<n; i++){
		        d[i] = sc.nextInt();
		        freq[d[i]]++;
		    }
		    
		    int count=0;
		    for (int i=0; i<1440; i++){
		        count = Math.max(count, freq[i]);
		    }
		    
		    System.out.println(count);
		}
	}
}
