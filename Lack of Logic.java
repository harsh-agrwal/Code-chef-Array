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
        char [] uppercase = new char[26];
        for (int i=65;i<=90;i++) {
            uppercase[i-65]= (char)i;
        }

        int T = sc.nextInt();
        while (sc.hasNextLine()) {
           String line = sc.nextLine().toUpperCase();
           if (line.length()>0) {
               String newStr="";
               for (int i=0;i<26;i++) {
                   if (line.contains(""+uppercase[i])) {
                    
                   }
                   else {
                       newStr+= uppercase[i];
                   }
               }
               
               if(newStr.length()>0) {
                   System.out.println(newStr);
               }
               else {
                   System.out.println("~");
               }
           }
        }
	}
}
