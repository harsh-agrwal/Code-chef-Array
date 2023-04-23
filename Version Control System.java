/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            boolean[] ignored = new boolean[n+1];
            boolean[] tracked = new boolean[n+1];
            while (m-- > 0) {
                int x = sc.nextInt();
                ignored[x] = true;
            }
            while (k-- > 0) {
                int x = sc.nextInt();
                tracked[x] = true;
            }
            int ignoredAndTracked = 0;
            int untrackedAndUnignored = 0;
            for (int i = 1; i <= n; i++) {
                if (ignored[i] && tracked[i]) {
                    ignoredAndTracked++;
                } 
                else if (!ignored[i] && !tracked[i]) {
                    untrackedAndUnignored++;
                }
            }
            System.out.println(ignoredAndTracked + " " + untrackedAndUnignored);
        }
        sc.close();
		// your code goes here
	}
}
