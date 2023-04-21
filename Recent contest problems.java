/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int start38 = 0, ltime108 = 0;
            for (int i = 0; i < n; i++) {
                String contest = scanner.next();
                if (contest.equals("START38")) {
                    start38++;
                } else {
                    ltime108++;
                }
            }
            System.out.println(start38 + " " + ltime108);
        }
		// your code goes here
	}
}
