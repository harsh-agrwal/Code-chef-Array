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
        while(tests-->0){
            int totalNumbers=sc.nextInt();
            int [] nums=new int[totalNumbers];
            int sum=0, temp;
            for(int i=0; i<totalNumbers; i++){
                temp=sc.nextInt();
                nums[i]=temp;
                sum=sum+temp;
            }
            Arrays.sort(nums);
            int result=sum-(totalNumbers*nums[0]);
            System.out.println(result);
        }
    }
}
