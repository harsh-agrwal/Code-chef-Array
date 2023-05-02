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
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int n = s.nextInt();
		    int x = s.nextInt();
		    String str = s.next();
		    HashSet<Integer> set = new HashSet<>(n);
		    set.add(x);
		    for(int i=0; i<n; i++){
		        if(str.charAt(i)=='R'){
		            x+=1;
		            set.add(x);
		        }
		        else if(str.charAt(i)=='L'){
		            x-=1;
		            set.add(x);
		        }
		    }
		    System.out.println(set.size());
		    set.clear();
		}
	}
}
