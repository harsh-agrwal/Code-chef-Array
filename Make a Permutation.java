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
		while(t-->0){
		    int N=sc.nextInt();
		    int arr[]=new int[N];
		    for(int i=0;i<N;i++){
		        arr[i]=sc.nextInt();
		    }
		    HashSet<Integer> h=new HashSet<>();
		    for(int i=1;i<=N;i++){
		        h.add(i);
		    }
		    for(int i=0;i<N;i++){
		        h.remove(arr[i]);
		    }
		    System.out.println(h.size());
		}
	}
}
