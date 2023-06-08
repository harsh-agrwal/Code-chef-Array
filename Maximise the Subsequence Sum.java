/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t > 0){
		    int n = scan.nextInt();
		    int k = scan.nextInt();
		    int nums[] = new int[n];
		    for(int i=0; i<n; i++){
		        nums[i] = scan.nextInt();
		    }
		    Arrays.sort(nums);
		    for(int i=0; i<n; i++){
		        if(nums[i] >= 0 || k == 0) break;
		        nums[i] = -1 * nums[i];
		        k--;
		    }
		    Arrays.sort(nums);
		    long sum = 0;
		    for(int i=n-1; i>=0; i--){
		        if(nums[i] <= 0) break;
		        sum += nums[i];
		    }
		    System.out.println(sum);
		    t--;
		}
	}
}
