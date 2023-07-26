/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{Scanner sc=new Scanner(System.in);
	   	int t=sc.nextInt();
		while(t-->0){
		int m=sc.nextInt();
		int k=sc.nextInt();
		int f[]=new int[k];
		ArrayList<ArrayList<Integer>>h=new ArrayList<>();
		for(int i=0;i<m;i++) {
			ArrayList<Integer>g=new ArrayList<>();
			int n=sc.nextInt();
			for(int j=0;j<n;j++) {
				int v=sc.nextInt();
				g.add(v);
				f[v-1]++;
			}
			h.add(g);
		}
		int cv=0;
		for(int i=0;i<k;i++) {
			if(f[i]==0) {
				cv=1;
				System.out.println("sad");
				break;
			}
		}
		if(cv==0) {
			boolean ans=true;
			for(int i=0;i<m;i++) {
				boolean main=true;
				for(int j=0;j<h.get(i).size();j++) {
					int x=h.get(i).get(j);
					if(f[x-1]==1) {
						main=false;
					}
				}
				if(main) {
					ans=false;
				}
			}
			if(ans) {
				System.out.println("all");
			}
			else {
				System.out.println("some");
			}
			
		}
		}
		// your code goes here
	}
}
