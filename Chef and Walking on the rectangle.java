/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Solution sol=new Solution();
		sol.output();
	}
}

class Solution{
    private Scanner sc=new Scanner(System.in);
    
    void output(){
        int tests=sc.nextInt();
        
        while (tests-->0){
            int rows=sc.nextInt();
            int columns=sc.nextInt();
            int K = sc.nextInt();
            
            if( (rows==1 && columns<=2) || (rows<=2 && columns==1) ){
                System.out.println(0);
            }else if(rows==1 || columns==1){
                System.out.println(K);
            }else{
                int count=0;
                for(int i=1; i<=K; i+=2){
                    count++;
                }
                System.out.println(count);
            }
        } 
    }
}
