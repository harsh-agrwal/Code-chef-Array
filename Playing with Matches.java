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
		Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = a + b;
            int matches = 0;
            while (sum > 0) {
                int digit = sum % 10;
                if (digit == 0) {
                    matches += 6;
                } else if (digit == 1) {
                    matches += 2;
                } else if (digit == 2) {
                    matches += 5;
                } else if (digit == 3) {
                    matches += 5;
                } else if (digit == 4) {
                    matches += 4;
                } else if (digit == 5) {
                    matches += 5;
                } else if (digit == 6) {
                    matches += 6;
                } else if (digit == 7) {
                    matches += 3;
                } else if (digit == 8) {
                    matches += 7;
                } else if (digit == 9) {
                    matches += 6;
                }
                sum /= 10;
            }
            System.out.println(matches);
        }
    }
}
