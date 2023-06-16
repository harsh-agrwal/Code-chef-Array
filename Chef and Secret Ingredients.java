/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map.Entry;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for(int j=0; j<x; j++){
		    int y = s.nextInt();
		    String a[] = new String[y];
		    for(int i=0; i<y; i++){
		        a[i] = s.next();
		    }
		    
		    HashMap<Character, Integer> hm = new HashMap<>();
		    for(int i=0; i<y; i++){
		        ArrayList<Character> b = new ArrayList<>();
		        for(int k=0; k<a[i].length(); k++){
		            if(!b.contains(a[i].charAt(k))){
		                b.add(a[i].charAt(k));
		            }
		            
		        }
		        
		        for(int k=0; k<b.size(); k++){
		            hm.put(b.get(k), hm.getOrDefault(b.get(k),0)+1);
		        }
		        
		    }
		    
		    int c=0;
		    for(char key: hm.keySet()){
		        if(hm.get(key)==y){
		            c++;
		        }
		    }
		    
		    System.out.println(c);
		}
	}
}
