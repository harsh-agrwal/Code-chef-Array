import java.util.Scanner;

class ARRROT {
	public static void main(String[] args) {
		long bigInt = 1000000007;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long sum = 0;
		for(int i = 0; i < N; i++) sum += Long.valueOf(sc.nextInt());
		int Q = sc.nextInt();	
		for(int i = 0; i < Q; i++) {
			int x = sc.nextInt();
			sum <<= 1;
			sum %= bigInt;
			if(sum < 0) sum += bigInt;
			System.out.println(sum);
		}
	}
}
