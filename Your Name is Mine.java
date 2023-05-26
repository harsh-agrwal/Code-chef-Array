/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    String M = sc.next();
		    String W = sc.next();
		    int l1 = M.length();
		    int l2 = W.length();
		    
		    int max = Math.max(l1, l2);
		    boolean canMarry = true;
		    
		    if(M.equals(W)){
		        System.out.println("YES");
		    }else{
		        
		        if(max == l1){
    		        int lastIndex = 0;
    		        for(int i=0; i<l2; i++){
    		            char ch = W.charAt(i);
    		            int index = M.indexOf(ch, lastIndex);
    		            if(index == -1){
    		                canMarry = false;
    		                break;
    		            }else{
    		                lastIndex = index+1;
    		            }
    		        }
    		    }else{
    		        int lastIndex = 0;
    		        for(int i=0; i<l1; i++){
    		            char ch = M.charAt(i);
    		            int index = W.indexOf(ch, lastIndex);
    		            if(index == -1){
    		                canMarry = false;
    		                break;
    		            }else{
    		                lastIndex = index+1;
    		            }
    		        }
    		    }
    		    if(canMarry)
    		        System.out.println("YES");
    		    else
    		        System.out.println("NO");
		    }
		    T--;
		}
	}
}
