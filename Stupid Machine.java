/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / (gcd(a, b));
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int a[] = new int[n];
            String temp[] = br.readLine().split(" ");
            int i;
            for (i = 0; i < n; i++)
                a[i] = Integer.parseInt(temp[i]);
            long ans=0;
            int dp[]=new int[n];
            dp[0]=a[0];
            ans+=a[0];
            for(i=1;i<n;i++)
            {
                dp[i]=Math.min(dp[i-1],a[i]);
                ans+=dp[i];
            }
            System.out.println(ans);
        }
    }
}
