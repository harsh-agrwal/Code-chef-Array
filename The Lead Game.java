/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
        int rounds = input.nextInt();
        int lead = 0;
        int player1 = 0, player2 = 0, winner = 0;
        for (int i = 0; i < rounds; i++) {
            int score1 = input.nextInt();
            int score2 = input.nextInt();
            player1 += score1;
            player2 += score2;
            int currentLead = Math.abs(player1 - player2);
            if (currentLead > lead) {
                lead = currentLead;
                if (player1 > player2) {
                    winner = 1;
                } else {
                    winner = 2;
                }
            }
        }
        System.out.println(winner + " " + lead);
        input.close();
		// your code goes here
	}
}
