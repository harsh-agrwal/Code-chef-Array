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
		    String st1=sc.next();
		    String st2=sc.next();
		    st1=st1.toLowerCase();
		    st2=st2.toLowerCase();
		    char[] ch1=st1.toCharArray();
		    char[] ch2=st2.toCharArray();int c=0,cn=0;
		    HashMap<Character,Integer> hm1=new HashMap<>();
		    for(int i=0;i<ch1.length;i++) hm1.put(ch1[i],hm1.getOrDefault(ch1[i],0)+1);
		     HashMap<Character,Integer> hm2=new HashMap<>();
		    for(int i=0;i<ch2.length;i++) hm2.put(ch2[i],hm2.getOrDefault(ch2[i],0)+1);
		    if(hm1.keySet().equals(hm2.keySet())) c=1;
		    if(hm1.equals(hm2)) cn=1;
		    System.out.println(c==cn?"YES":"NO");
		    }
	}
}
