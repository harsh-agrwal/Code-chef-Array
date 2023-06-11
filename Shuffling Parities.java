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
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int p=0;
		    int j=0;
		    int ans=0;
		    int k=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]==1&&i==0){
		            j++;
		            k++;
		            continue;
		        }
		        if((arr[i]+(i+1))%2==0&&arr[i]%2==0){
		                p++;
		        }else if((arr[i]+(i+1))%2==0&&arr[i]%2==1){
		            j++;
		        }else{
		            ans++;
		        }
		    }
		    System.out.println(ans+Math.min(p,j)*2);
		}
	}
}
