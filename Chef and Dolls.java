import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
         	Scanner inp=new Scanner(System.in);
	int t=inp.nextInt();
	while(t-->0){
	    int n= inp.nextInt();
	    int []arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=inp.nextInt();
	        
	    }
	    
	    Arrays.sort(arr);
	    for(int i=0;i<n-1;i+=2){
	        if(arr[i]==arr[i+1]){
	            continue;
	        }
	        else
	        {
	            System.out.println(arr[i]);
	            break;
	        }
	    }
	}
	}
}
