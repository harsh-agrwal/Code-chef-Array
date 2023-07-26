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
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        // long mod = 1000_000_007l;
        while (test-- > 0) {
            int n = sc.nextInt();
            List<Integer> list=new ArrayList<>();
            int i;
            int maxi = Integer.MIN_VALUE;
            int a[]=new int[n];
            for (i = 0; i < n; i++) {
                int x= sc.nextInt();
                if(!list.contains(x))
                list.add(x);
                a[i]=x;
                maxi = Math.max(maxi, x);
            }
            if (list.size() == 1)
                System.out.println(0);
            else if (a[n-1] == maxi)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
