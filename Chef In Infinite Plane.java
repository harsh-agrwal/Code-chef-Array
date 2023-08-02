/* package codechef; // don't place package name! */

import java.util.*;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{  
	public static void main (String[] args) throws java.lang.Exception
	{   
		FastScanner sc=new FastScanner();
	    int T=sc.nextInt();
		while(T-->0){
    		int N=sc.nextInt();
    		int arr[]=new int[N];
    		for(int i=0;i<N;i++){
    			arr[i]=sc.nextInt();
    		}
    		HashMap<Integer,Integer> bun=new HashMap<Integer,Integer>();
    		for(int i=0;i<N;i++){
            bun.put(arr[i],bun.getOrDefault(arr[i], 0) + 1);
    		}
    		long answer=N;
    		for(Entry<Integer, Integer> entryMap: bun.entrySet()){
                if(entryMap.getValue()>entryMap.getKey()-1){
                	answer=answer-entryMap.getValue()+entryMap.getKey()-1;
        		 }
    		}
    		System.out.println(answer);
    	}
    }
	static class FastScanner {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer("");
    	String next() {
    		while(!st.hasMoreTokens()) {
    			try {
    				st = new StringTokenizer(br.readLine());
    			}
    			catch (Exception e) {
    				e.printStackTrace();
    			}
    		}
    		return st.nextToken();
    	}
    
    	int nextInt() {
    		return Integer.parseInt(next());
    	}
    
    	long nextLong() {
    		return Long.parseLong(next());
    	}
    
    	double nextDouble() {
    		return Double.parseDouble(next());
    	}
    }
	public static void file_io() {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} 
		catch(Exception e) {
			System.err.println("Error");
		}
	}
}
