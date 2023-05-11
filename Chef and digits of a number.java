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
		int T = sc.nextInt();
		while(T>0){
		    
		    String number = sc.next();
		    
		    int oneC = 0;
		    
		    for(int i=0; i<number.length(); i++){
		        if(number.charAt(i) == '1')
		            oneC++;
		    }
		    
		    if((oneC == (number.length() - 1)) || (oneC == 1))
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    T--;
		}
	}
}
