import java.util.Scanner;

class ADIGIT {
	public static int[][] getArrValues(int[] A, int n){
		int[][] R = new int[n][10];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 10; j++) {
				if(i > 0) R[i][j] = R[i - 1][j] + Math.abs(A[i] - j);
				else R[i][j] = Math.abs(A[i] - j);
			}
		}
		return R;
	}
	
	public static void intPrintArray(int[] a) {
		for(int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] A = new int[n];
		String temp = sc.next();
		for(int i = 0; i < n; i++) A[i] = Character.getNumericValue(temp.charAt(i));
		int[][] R = getArrValues(A, n);
		for(int i = 0; i < m; i++) {
			int x = sc.nextInt();
			System.out.println(R[x - 1][A[x - 1]]);
		}
	}
}
