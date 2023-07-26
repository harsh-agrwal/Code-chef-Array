import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    
    public static void main(String[] args) throws Exception{
        
        io scan = new io();
        PrintWriter out=new PrintWriter(System.out);
        int T = scan.nextInt();
        
        while(T-->0){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int q = scan.nextInt();
            
            int arr[] = new int[n+1];
            Arrays.fill(arr , -1);
            
            int curr = 0;
            boolean flag = false;
            
            while(q-->0){
                char c = scan.next().charAt(0);
                int p = scan.nextInt();
                
                if(c == '-') p*= -1;
                
                if(p<0) curr--;
                else curr++;
                
                if(p*arr[Math.abs(p)]>0){
                    flag = true;
                }
                else if(curr>m){
                    flag = true;
                }
                arr[Math.abs(p)]*= -1;
            }
            
            if(flag)out.println("Inconsistent");
            else out.println("Consistent");
        }
    
    out.flush();
    
    }    
}

class io{
    BufferedReader bin;
    StringTokenizer st=new StringTokenizer("");
    public io(){
        bin=new BufferedReader(new InputStreamReader(System.in));
        return;
    }
    
    public String next(){
        while(!st.hasMoreTokens()){
            try{
                st=new StringTokenizer(bin.readLine());
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    
    public int nextInt(){
        return Integer.parseInt(next());
    }
    
    public long nextLong(){
        return Long.parseLong(next());
    }
    public double nextDouble(){
        return Double.parseDouble(next());
    }
    public String nextLine(){
        try{
        return bin.readLine();
        }
        catch(Exception e){}
        return null;
    }
    public boolean hasNext(){
        String next=null;
        try{
            next=bin.readLine();
        }
        catch(Exception e){
        }
        if(next==null)
            return false;
        st=new StringTokenizer(next);
        return true;
    }
}

