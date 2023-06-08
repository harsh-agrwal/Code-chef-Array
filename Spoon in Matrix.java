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
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    int m=in.nextInt();
		    String str[]=new String[n];
		    for(int i=0;i<n;i++){
		        str[i]=in.next().toLowerCase();
		    }
		    int c=0;
		    for(int i=0;i<n;i++){
		        if(str[i].contains("spoon")){
		            c++;
		            break;
		        }
		    }
		    String s[]=new String[m];
		    for(int i=0;i<m;i++){
		        for(int j=0;j<n;j++){
		            s[i]=s[i]+str[j].charAt(i);
		        }
		    }
		    int res=0;
		    for(int i=0;i<m;i++){
		        if(s[i].contains("spoon")){
		            res++;
		            break;
		        }
		    }
		    
		    if(c>0 || res>0){
		        System.out.println("There is a spoon!");
		    }
		    else{
		        System.out.println("There is indeed no spoon!");
		    }
		}
		    
	}
}
