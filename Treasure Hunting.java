/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException  e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e)  {
        e.printStackTrace();
      }
      return str;
    }
  }

    static class Node{
        int i;
        int j;
        int no;
        int time;
        Node(int i,int j,int no,int time){
            this.i = i;
            this.j = j;
            this.no = no;
            this.time = time;
        }
    }
    static boolean boundary(int i,int j,int n){
        if(i>=n || i<0 || j>=n || j<0){
            return false;
        }
        return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader fr = new FastReader();
			int T = fr.nextInt();
		int[] r = {-1,0,1,0};
		int[] c = {0,-1,0,1};
		while(T-->0){
		    int N = fr.nextInt();
		    int[][] arr = new int[N][N];
		    int tcount = 0;
		    int ans = 0;
		    for(int i = 0;i<N;i++){
		        String s = fr.nextLine();
		        for(int j = 0;j<N;j++){
		            if(s.charAt(j)=='*'){
		                tcount++;
		                arr[i][j] = tcount;
		                ans|= (1<<tcount);
		            }
		            else if(s.charAt(j)=='#'){
		                arr[i][j] = -1;
		            }
		            else{
		                arr[i][j] = 0;
		            }
		        }
		    }
		    int[][][] dp = new int[N][N][1<<(tcount+1)];
		    Queue<Node> q = new LinkedList<>();
		    q.add(new Node(0,0,0,0));
		    boolean flag = false;
		    while(!q.isEmpty()){
		        Node p = q.remove();
		        int i = p.i;
		        int j = p.j;
		        int no = p.no;
		        int curtime = p.time;
		        if(i==j && i==N-1 && no==ans){
		            System.out.println(curtime);
		            flag = true;
		            break;
		        }
		        for(int k = 0;k<4;k++){
		             break;
		        }
		        for(int k = 0;k<4;k++){
		            int nexti = i+r[k];
		            int nextj = j+c[k];
		            int cno = (arr[i][j]>0)?no|(1<<arr[i][j]):no;
		            if(boundary(nexti,nextj,N) && arr[nexti][nextj]!=-1 && dp[nexti][nextj][cno]==0){
		                dp[nexti][nextj][cno] = 1;
		                q.add(new Node(nexti,nextj,cno,curtime+1));
		            }
		        }
		    }
		    if(!flag){
		        System.out.println(-1);
		    }
		}
	}
}
