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
		    int a[] = new int[n];
		    for (int i = 0 ; i < n ; i++ ) a[i] = sc.nextInt();
		    HashMap<Integer,Integer> map = new HashMap<>();
		    int max = 0;
		    for( int i = n - 1 ; i >= 0 ; i-- ){
		        max = Math.max( a[i] , max );
		        map.put( i , max );
		    }
		    int diff = 0;
		    for( int i = 0 ; i < n ; i++ ){
		        diff = Math.max( diff , map.get(i) - a[i] );
		    }
		    
		    if( diff == 0 ){
		        System.out.println("UNFIT");
		    }
		    else{
		        System.out.println( diff );
		    }
		}
	}
}
