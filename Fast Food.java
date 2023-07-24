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
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
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
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{ BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        FastReader scn = new FastReader();
        int t = scn.nextInt();
        while (t-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            int n = scn.nextInt();
            for (int i = 0; i < n; i++) {
                int x = scn.nextInt();
                list.add(x);
            }
            for (int i = 0; i < n; i++) {
                int x = scn.nextInt();
                list1.add(x);
            }
            int[] suffixSum1 = new int[n];
            for (int i = 0; i < n; i++) {
                suffixSum1[i] = 0;
            }
            suffixSum1[n - 1] = list1.get(n - 1);
            for (int i = n - 2; i >= 0; i--) {
                suffixSum1[i] = suffixSum1[i + 1] + list1.get(i);
            }
            int[] prefixSum=new int[n];
            for(int i=0;i<n;i++){
                prefixSum[i]=0;
            }
            prefixSum[0]=list.get(0);
            for(int i=1;i<n;i++){
                prefixSum[i]=prefixSum[i-1]+list.get(i);
            }
            long max=Math.max(prefixSum[n-1],suffixSum1[0]);
            for(int i=0;i<n-1;i++){
                max=Math.max(max,prefixSum[i]+suffixSum1[i+1]);
            }
            output.write(max + "\n");
            output.flush();
        }
    }
}
