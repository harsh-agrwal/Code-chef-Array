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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[10];
		    
		    int i;
		    for(i=0;i<n;i++)
		    arr[sc.nextInt()-1]++;
		    HashMap<Integer,Integer>hm=new HashMap<>();
		   int max=0,ans=0;
		   for(i=0;i<10;i++){
		       //System.out.print(arr[i]);
		       if(arr[i]>0){
		           if(hm.containsKey(arr[i]))
		           {
		               hm.put(arr[i],hm.get(arr[i])+1);
		           }
		           else{
		               hm.put(arr[i],1);
		           }
		           if(hm.get(arr[i])==max)
		           ans=Math.min(arr[i],ans);
		           else {
		           if(hm.get(arr[i])>max){
		               max=hm.get(arr[i]);
		               ans=arr[i];
		           }
		           }
		       }
		   }
		  // System.out.println(hm);
		   System.out.println(ans);
		}
	}
}
