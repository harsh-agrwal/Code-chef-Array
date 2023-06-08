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
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            sc.nextLine();
            String s = sc.next();

            char [] frequency = new char [26];
            for(int i = 0; i<n; i++) {
                frequency[s.charAt(i) - 'a']++;
            }
            while(q-- > 0){
                int num = sc.nextInt();
                int queue = 0;
                char [] arr = frequency.clone();
                for(int i = 0; i<arr.length; i++){
                    if(arr[i] - num > 0){
                        arr[i] -= num;
                        queue += arr[i];
                    }
                }
                System.out.println(queue);
            }
        }

	}
}
