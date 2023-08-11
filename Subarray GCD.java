import java.util.Arrays;
import java.util.Scanner;

class SUBGCD {
	 public static int gcd(int a, int b) {
		 while(b != 0) {
			 int temp = a%b;
			 a = b;
			 b = temp;
		 }
		 return a;
	 }
	public static void solve(Scanner sc) {
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		int gcd = gcd(A[0], A[1]);
		if(gcd == 1) {
			System.out.println(N);
			return;
		}
		for(int i = 1; i < N - 1; i++) {
			gcd = gcd(gcd, A[i + 1]);
			if(gcd == 1) {
				System.out.println(N);
				return;
			}
		}
		System.out.println(-1);
	}
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	while(T-- > 0) solve(sc);
	}
}
