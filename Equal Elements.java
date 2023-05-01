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
		while(t-->0){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    int maxOccurence = 1;
		    HashMap<Integer,Integer> occurences = new HashMap<>();
		    for(int i=0; i<n; i++){
		        if(occurences.containsKey(arr[i])){
		            occurences.put(arr[i],occurences.get(arr[i])+1);
		        }
		        else occurences.put(arr[i],1);
		    }
		    for(int freq:occurences.values()){
		        maxOccurence = Math.max(maxOccurence,freq);
		    }
		    System.out.println(n-maxOccurence);
		}
	}
}
