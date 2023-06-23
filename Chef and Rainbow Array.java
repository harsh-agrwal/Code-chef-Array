/* package codechef; // don't place package name! */

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
		int T = sc.nextInt();
		while(T-- > 0){
		    int N = sc.nextInt();
		   if(N < 13){
		       System.out.println("no");
		       continue;
		   }
		    int [] A = new int[N];
		    for(int i = 0; i < N; i++){
		        A[i] = sc.nextInt();
		    }
		    boolean flag = true;
		    int s = 0, e = N-1;
		    
		    if(A[0] != 1){
		        flag = false;
		    }
		    
		    while(s < e){
		        if(A[s] != A[e] || (A[s+1] - A[s] > 1) || (A[s+1] - A[s] < 0) || A[s] > 7){
		            flag = false;
		            break;
		        }
		        
		        s++;
		        e--;
		    }
		    
		    if(s<e || A[s] != 7){
		        flag = false;
		    }
		    
		    if(!flag){
		        System.out.println("no");
		    }
		    else{
		        System.out.println("yes");
		    }
		    
		}
	}
}
