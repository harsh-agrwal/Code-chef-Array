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
		int t,i,j,k,l,m,n,o,p,q;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-->0){
		    n = sc.nextInt();
		    m = sc.nextInt();
		    int ar[][] = new int[8][2];
		    l = 0;
	        p = n-2;
	        if(p>0){
	            q = m -1;
	            if(q>0) {
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
	            q = m+1;
	            if(q<9){
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
		    }
		    p = n-1;
		    if(p>0){
		        q = m -2;
	            if(q>0) {
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
	            q = m+2;
	            if(q<9){
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
		    }
	        p = n+2;
	        if(p<9){
	            q = m -1;
	            if(q>0) {
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
	            q = m+1;
	            if(q<9){
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
		    }
		    p = n+1;
		    if(p<9){
		        q = m -2;
	            if(q>0) {
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
	            q = m+2;
	            if(q<9){
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
		    }
		    
		    
		    
   		    n = sc.nextInt();
		    m = sc.nextInt();
		    int an[][] = new int[8][2];
		    for(i = 0; i<l; i++){
		        an[i][0] = ar[i][0];
		        an[i][1] = ar[i][1];
		    }
		    i = l;
		    l = 0;
		    p = n-2;
	        if(p>0){
	            q = m -1;
	            if(q>0) {
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
	            q = m+1;
	            if(q<9){
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
		    }
		    p = n-1;
		    if(p>0){
		        q = m -2;
	            if(q>0) {
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
	            q = m+2;
	            if(q<9){
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
		    }
	        p = n+2;
	        if(p<9){
	            q = m -1;
	            if(q>0) {
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
	            q = m+1;
	            if(q<9){
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
		    }
		    p = n+1;
		    if(p<9){
		        q = m -2;
	            if(q>0) {
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
	            q = m+2;
	            if(q<9){
	                ar[l][0] = p;
	                ar[l++][1] = q;
	            }
		    }
		    k = l;
		    o = 0;
		    p = 0;
		    for(j = 0; j<i; j++){
		        for(o = 0; o<k; o++){
		            if(((an[j][0] == ar[o][0]) && an[j][1] == ar[o][1]) ){
		                p = 1;   
		                break;
		            }
		        }
		    }
		    if(p == 1) {
		    System.out.println("yes");
		    }
		    else System.out.println("no");
		}
	}
}
