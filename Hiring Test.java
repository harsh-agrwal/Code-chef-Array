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
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t-->0){
		    int n=scan.nextInt();
		    int m=scan.nextInt();
		    String[] cand=new String[n];
		    int x=scan.nextInt();
		    int y=scan.nextInt();
		    for(int i=0;i<n;i++){
		        cand[i]=scan.next();
		  }
		  for(int i=0; i<n; i++){
		        int p = 0, f = 0;
		        for(int j=0; j<m; j++){
		            if(cand[i].charAt(j) == 'P'){
		                p++;
		            }
		            else if(cand[i].charAt(j) == 'F'){
		                f++;
		            }
		        }
		        if(f>=x || (f == x-1 && p>=y)){
		            System.out.print(1);
		        }
		        else{
		            System.out.print(0);
		        }
		    }
		    System.out.print("\n");
		}
	}
}
