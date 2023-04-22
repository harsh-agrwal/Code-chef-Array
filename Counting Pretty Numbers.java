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
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count = 0;
            for (int i = l; i <= r; i++) {
                int lastDigit = i % 10;
                if (lastDigit == 2 || lastDigit == 3 || lastDigit == 9) {
                    count++;
                }
            }
            System.out.println(count);
        }
		// your code goes here
	}
}
