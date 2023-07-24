/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0){
	        int N = sc.nextInt();
	        int[] A = new int[N];
	        for(int i=0;i<N;i++)
	            A[i] = sc.nextInt();
	        
	        // Using two-pointer approach   
            int i = 0;
            int j = N-1;
            int count = 0;
            
            while(i<j) {
                if(A[i] == A[j]) {
                    i++;
                    j--;
                }
                else if(A[i] != A[j]) {
                    if(A[i] > A[j]){
                        A[i] -= A[j];
                        j--;
                    }
                    else{
                        A[j] -= A[i];
                        i++;
                    }
                    count++;
                }
    	    }
    		System.out.println(count);
    	}
    	
	}
}
