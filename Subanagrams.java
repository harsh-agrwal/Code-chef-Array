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
		int[] res = new int[26];
		Scanner console = new Scanner(System.in);
	    int N = console.nextInt();
	    for(int i = 0; i < N; i++) {
	        String str = console.next();
	        if(i == 0) {
	          for(char ch : str.toCharArray()) {
	              res[ch - 'a'] += 1; 
	          }
	        } else {
	            int[] curr = new int[26];
	            for(char ch : str.toCharArray()) {
	              curr[ch - 'a'] += 1; 
	          }
	          for(int j = 0 ; j < 26; j++) {
	              res[j] = Math.min(res[j], curr[j]);
	          }
	        }
	    }
	    
	    String ans = "";
	    for(int i = 0; i < 26; i++) {
	        if(res[i] > 0) {
	            int count = res[i];
	            while(count-- > 0) {
	                ans=ans+ ((char)(i+'a'));
	            }
	        }
	    }
		
		ans=ans.equals("") ? "no such string" :ans;
		System.out.println(ans);
	}
}
