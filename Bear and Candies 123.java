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
		int T = sc.nextInt();
		while(T-- > 0)
		{
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    String winner = "";
		    int i = 1;
		    while(true)
		    {
		        if((i*i) > A)
		        {
		            winner = "Bob";
		            break;
		        }
		        if(i*(i+1) > B)
		        {
		            winner = "Limak";
		            break;
		        }
		        i+=1;
		    }
		    System.out.println(winner);
		}
	}
}
