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
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t-- >0){
		    int a = input.nextInt();
		    int k = input.nextInt();
		    int[] arr = new int[a];
		     int sum = 0;
		    for(int i = 0; i < a; i++){
		        arr[i] = input.nextInt();
		        if(i < k){
		            sum+= arr[i];}
		        
		    }
		   
		    int max = sum;
             int i =0;
             int j = k;
             while(j < a){
                 sum-=arr[i];
                 i++;
                 sum+=arr[j];
                 j++;
                 if(sum > max){
                     max = sum;
                 }
             }
		    System.out.println(max);
		}
	}
}
