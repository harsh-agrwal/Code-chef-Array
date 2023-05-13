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
		
		while( t-- > 0 ){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int k = sc.nextInt();
		    
		    int a [] = new int[n];
		    
		    for (int i = 0 ; i < n ; i++ ) {
		        a[i] = sc.nextInt();
		    }
		    
		    int count = 0;
		    for( int ele : a ){
		        if( ele == 1 ) count++;
		        else break;
		    }
		    
		    if( count == n ){
		        System.out.println( 100);
		    }
		    else if( count >= m  ){
		        System.out.println(k);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}
