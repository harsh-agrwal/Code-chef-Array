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
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		while(n-->0){
		    char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		    int[] x=new int[26];
		    for(int i=0;i<26;i++){
		        x[i]=input.nextInt();
		    }
		    int count=0;
		    String str=input.next();
		    int a=26;
		    for(int i=0;i<a;i++){
		        if(str.contains(String.valueOf(arr[i])))
		        {
		         continue;
		          
		        }
		        else{
		            count+=x[i];
		        }
		    }
		    System.out.println(count);
	}
	}
}
