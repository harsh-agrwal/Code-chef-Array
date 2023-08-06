import java.util.ArrayList;
import java.util.Scanner;
import java.util.ListIterator;
class MAXSUBARR {
	public static long maxSubArraySum(long[] a, int n) {
		long sum = 0;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            long result = Math.max(sum, a[i]);
            max = Math.max(result, max);
            sum = result;
        }
        return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 0;
		T = sc.nextInt();
		while(T-- > 0) {
			int N = sc.nextInt();
			long[] a = new long[N + 2];
			for(int i = 0; i < N; i++) a[i + 1] = sc.nextInt();
			int M = sc.nextInt();
			long[] b = new long[N];
			long p = 0;
			for(int i = 0; i < M; i++) {
				int temp = sc.nextInt();
				if(temp > 0) p += Long.valueOf(temp);
			}
			long maxx = 0;
			a[0] = p;
			maxx = maxSubArraySum(a, a.length);
			a[0] = 0;
			a[N + 1] = p;
			maxx = Math.max(maxx, maxSubArraySum(a, a.length));
			System.out.println(maxx);
		}
	}
}
