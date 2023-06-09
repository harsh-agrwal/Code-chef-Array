/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception 
	{
        try(Scanner scn = new Scanner(System.in)) {
			int cases = scn.nextInt();
			
			while(cases-- > 0) {
				int n = scn.nextInt();
				int m = scn.nextInt();

				int[] total_prices = new int[m];
				int[] contents = new int[n]; 
				Arrays.fill(total_prices, -1); 
				
				for(int i = 0; i < n; ++i) 
					contents[i] = scn.nextInt();
				
				for(int i = 0; i < n; ++i) {
					int type = contents[i] - 1; 
					int price = scn.nextInt(); 
					
					if(total_prices[type] == -1) 
						total_prices[type] = price;
					else total_prices[type] += price; 
				}
				
				int min = Integer.MAX_VALUE;
				for(int price : total_prices)
					if(price < min && price != -1) min = price;
				
				System.out.println(min);
			}
		}
	}
}
