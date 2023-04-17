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
            int count = 0;
            for (int i = 0; i < n; i++) {
                int difficulty = scanner.nextInt();
                if (difficulty >= 1000) {
                    count++;
                }
            }
            System.out.println(count);
        }
		// your code goes here
	}
}
