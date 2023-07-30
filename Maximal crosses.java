/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
     static int N;
     static char[][] ch;
     static int[][] H, V, DB, DF, sol;
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(reader.readLine());
		ch = new char[N][N];
		for(int i = 0; i < N; i++){
		     String str = reader.readLine();
		     for(int j = 0; j < N; j++){
		          char c = str.charAt(j);
		          ch[i][j] = c;
		     }
		}
		solution();
	}
	private static void solution()
	{
	     H = new int[N][N]; V = new int[N][N]; DB = new int[N][N]; DF = new int[N][N];
	     horizontal();
	     vertical();
	     diagonalBackword();
	     diagonalForward();
	     maxSol();
	}
	private static void horizontal(){
	     for(int i = 0; i < N; i++){
	          for(int j = 0; j < N; j++){
	               if(ch[i][j] == 'X'){
	                    int k = j, count = 0;
	                    while(k < N){
	                         if(ch[i][k] == 'X'){
	                              count++;
	                              k++;
	                         }else{
	                              
	                              break;
	                         }
	                    }
	                    k--;
	                    for(int l = j; l <= k; l++)
	                         H[i][l] = count;
	                    j = k;    
	               }
	               else{
	                    H[i][j] = 0;
	               }
	          }
	     }
	}
	private static void vertical()
	{
	     for(int i = 0; i < N; i++){
	          for(int j = 0; j < N; j++){
	               if(ch[j][i] == 'X'){
	                    int k = j, count = 0;
	                    while(k < N){
	                         if(ch[k][i] == 'X'){
	                              count++;
	                              k++;
	                         }else{
	                              
	                              break;
	                         }
	                    }
	                    k--;
	                    for(int l = j; l <= k; l++)
	                         V[l][i] = count;
	                    j = k;
	               }
	               else{
	                    V[j][i] = 0;
	               }
	          }
	     }
	}
	private static void diagonalBackword()
	{
	     for(int i = 0; i < N; i++){
	          int l = -1;
	          for(int j = i; j < N; j++){
	               l++;
	               if(ch[l][j] == 'X'){
	                    int m = l, n = j, count = 0;
	                    while(n < N){
	                         if(ch[m][n] == 'X'){
	                              count++; m++; n++;
	                         }else{
	                               break;
	                         }
	                    }m--; n--;
	                    for(int p = j; p <= n; p++){
	                         DB[l][p] = count;
	                         l++;
	                    }
	                    l--; j = n;
	               }else {
	                    DB[l][j] = 0;
	                    
	               }
	          }
	     }
	     for(int i = 1; i < N; i++){
	          int l = i-1;
	          for(int j = 0; j < (N-i); j++){
	               l++;
	               if(ch[l][j] == 'X'){
	                    int m = l, n = j, count = 0;
	                    while(n < (N-i)){
	                         if(ch[m][n] == 'X'){
	                              count++; m++; n++;
	                         }else {
	                               break;
	                         }
	                    }m--; n--;
	                    for(int p = j; p <= n; p++){
	                         DB[l][p] = count;
	                         l++;
	                    }
	                    l--; j = n;
	               }else {
	                    DB[l][j] = 0;
	               }
	          }
	     }
	}
	private static void diagonalForward(){
	     for(int i = 0; i < N; i++){
	          int l = i;
	          for(int j = 0; j <= i; j++){
	               if(ch[j][l] == 'X'){
	                    int m = j, n = l, count = 0;
	                    while(m <= i){
	                         if(ch[m][n] == 'X'){
	                              count++;
	                              m++; n--;
	                         }else {
	                              break;
	                         }
	                    }
	                    m--; n++;
	                    for(int p = j; p <= m; p++){
	                         DF[p][l] = count;
	                         l--;
	                    }
	                    j = m; l = n; l--;
	               }else {
	                    DF[j][l] = 0;
	                    l--;
	               }
	          }
	     }
	     for(int i = 1; i < N; i++){
	          int l = i;
	          for(int j = N-1; j >= i; j--){
	               if(ch[l][j] == 'X'){
	                    int m = l, n = j, count = 0;
	                    while(n >= i){
	                         if(ch[m][n] == 'X'){
	                              count++; m++; n--;
	                         }else {
	                              break;
	                         }
	                    }
	                    n++; m--;
	                    for(int p = l; p <= m; p++){
	                         DF[p][j] = count;
	                         j--;
	                    }
	                    l = m + 1; j = n;
	               }else{
	                    DF[l][j] = 0;
	                    l++;
	               }
	          }
	     }
	}
	private static void maxSol(){
	     sol = new int[N][N];
	     for(int i = 0; i < N; i++){
	          StringBuilder str = new StringBuilder("");
	          for(int j = 0; j < N; j++){
	               if(H[i][j] >= V[i][j] && H[i][j] >= DB[i][j] && H[i][j] >= DF[i][j])sol[i][j] = H[i][j];
	               else if(V[i][j] >= H[i][j] && V[i][j] >= DB[i][j] && V[i][j] >= DF[i][j])sol[i][j] = V[i][j];
	               else if(DB[i][j] >= H[i][j] && DB[i][j] >= V[i][j] && DB[i][j] >= DF[i][j])sol[i][j] = DB[i][j];
	               else sol[i][j] = DF[i][j];
	               str.append(sol[i][j]);
	               str.append(" ");
	          }
	          System.out.println(str);
	     }
	}
}
