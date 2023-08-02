/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		FastReader in = new FastReader();
		FastWriter out = new FastWriter();
		int t = in.nextInt();
		while (t --> 0){
		    int n = in.nextInt();
		    int k = in.nextInt();
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = in.nextInt();
		    }
		    long res = getCombos(arr, n);
		    res *= k;
		    res += getMultiCombo(arr, n, k);
		    out.println(res);
		}
		out.close();
	}
	
	static long getMultiCombo(int[] arr, int n, int k){
	    sort(arr);
	    long cnt = 0, x = 0;
	    for(int i = n - 2; i >= 0; i--){
	        if (arr[i] != arr[i + 1]){
	            x = n - i - 1;
	        }
	        cnt += x;
	    }
	    long times = k;
	    times *= (k - 1);
	    times /= 2;
	    return cnt * times;
	}
	static int getCombos(int[] arr, int n){
	    int pairs = 0;
	    for(int i = n - 1; i > 0; i--){
	        for(int j = i - 1; j >= 0; j--){
	            if (arr[i] < arr[j]){
	                pairs++;
	            }
	        }
	    }
	    return pairs;
	}
	static public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    static void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2 * i + 1;
        int r = 2 * i + 2; 
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }
        public void println() throws IOException {
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
}
