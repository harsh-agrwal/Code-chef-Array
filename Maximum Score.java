import java.io.*;
import java.util.*;

class CodeChef {
    public static int minCost(int[][] costs) {
        int n = costs.length;
        if (n == 0)
            return 0;
        int k = costs[0].length;
        if (k == 0)
            return 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int[][] dp = new int[n][k];
        for (int i = 0; i < k; i++) {
            dp[0][i] = costs[0][i];
            if (costs[0][i] < min1) {
                min2 = min1;
                min1 = costs[0][i];
            } else if (costs[0][i] < min2) {
                min2 = costs[0][i];
            }
        }
        if (n == 1) {
            return min1;
        }
        int cmin1 = Integer.MAX_VALUE;
        int cmin2 = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (dp[i - 1][j] != min1) {
                    dp[i][j] = costs[i][j] + min1;
                } else {
                    dp[i][j] = costs[i][j] + min2;
                }
                if (dp[i][j] < cmin1) {
                    cmin2 = cmin1;
                    cmin1 = dp[i][j];
                } else if (dp[i][j] < cmin2) {
                    cmin2 = dp[i][j];
                }
            }
            min1 = cmin1;
            min2 = cmin2;
            cmin1 = Integer.MAX_VALUE;
            cmin2 = Integer.MAX_VALUE;
        }
        if (min1 < 0) {
            return -1;

        }
        return min1;
    }

    public static ArrayList<Integer> getPrimes(int n) {
        boolean visited[] = new boolean[n + 1];
        Arrays.fill(visited, true);
        visited[0] = visited[1] = false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (visited[i]) {
                for (int j = i * i; j * j <= n; j++) {
                    visited[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (visited[i])
                list.add(i);
        }
        return list;
    }

    static long mod = 1000_000_007;

    public static long myPow(long x, int n) {
        if (n == 0 || x == 1.0)
            return 1l % mod;
        else if (n % 2 == 1) {
            return myPow(x * x, n / 2) % mod * x % mod;
        }
        return myPow(x * x, n / 2) % mod;
    }

    public static boolean setBit(int n, int i) {
        n = n >> i;
        return n % 2 == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            int i, j;
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++)
                    a[i][j] = sc.nextInt();
            }
            int ans = 0;
            long sum = 0;
            int flag = 0;
            int lastMax = Integer.MAX_VALUE;
            for (i = n - 1; i >= 0; i--) {
                int maxi = 0;
                for (j = 0; j < n; j++) {
                    if (a[i][j] > maxi && a[i][j] < lastMax) {
                        maxi = a[i][j];
                    }
                }
                if (maxi == 0) {
                    flag = 1;
                    break;
                }
                sum += maxi;
                lastMax = maxi;
            }
            System.out.println(flag == 1 ? -1 : sum);
        }
    }
}
