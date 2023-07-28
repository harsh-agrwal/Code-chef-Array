/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
 
    // Function to find gcd of array of
    // numbers
    static long findGCD(long arr[], int n)
    {
        long result = arr[0];
        for (long element: arr){
            result = gcd(result, element);
 
            if(result == 1)
            {
               return 1;
            }
        }
 
        return result;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long[] a=new long[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextLong();
		    Arrays.sort(a);
		    int flag=0;
		    long res=findGCD(a,n)*n;
		    System.out.println(res);
		}
	}
}
