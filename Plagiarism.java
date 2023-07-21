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
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String [] str = br.readLine().split(" ");
            int n =Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int k =Integer.parseInt(str[2]);
            int [] arr = new int [k];
            String [] s = br.readLine().split(" ");
            for(int j=0;j<k;j++){
                arr[j]=Integer.parseInt(s[j]);
            }
            HashMap<Integer,Integer> hm = new HashMap<>();
            ArrayList<Integer> al = new ArrayList<>();
            for(int j=0;j<k;j++){
                if(!hm.containsKey(arr[j])){
                    hm.put(arr[j],1);
                }
                else{
                    hm.put(arr[j],hm.get(arr[j])+1);
                }
            }

           
            for(int key:hm.keySet()){
                if(key>=1 && key<=n){
                    if(hm.get(key)>1){
                        //count++;
                        al.add(key);
                    }
                }
            }
            if(al.size()==0){
                System.out.println(0);
            }
            else {
                System.out.print(al.size() + " ");
                Collections.sort(al);
               for(int j=0;j<al.size();j++){
                   System.out.print(al.get(j) + " ");
               }
                System.out.println();
            }


        }
         
	}
}
