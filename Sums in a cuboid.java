/* package codechef; // don't place package name! */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	private static int X = 0, Y = 0, Z = 0;
	private static int [][][] B = null;
	
	private static void printA() {
		for (int i = 0; i < X; i++) {
			for (int j = 0; j < Y; j++) {
				StringBuffer toPrint = new StringBuffer(4*Z);
				for (int k = 0; k < Z; k++) {
					int value = B[i][j][k];
					if (i != 0)value = value - B[i-1][j][k];
					if (j != 0)value = value - B[i][j-1][k];
					if (k != 0)value = value - B[i][j][k-1];
					
					if (i!=0 && j!=0 && k!=0)value = value - B[i-1][j-1][k-1];
					if (j!=0 && k!=0) value = value + B[i][j-1][k-1];
					if (i!=0 && k!=0) value = value + B[i-1][j][k-1];
					if (i!=0 && j!=0) value = value + B[i-1][j-1][k];
					toPrint.append(value).append(' ');
				}
				System.out.println(toPrint);
			}
		}
	}
	
	public static void main (String [] args) {
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		try {
			String input = br.readLine();
			int numOfInputs = Integer.parseInt(input);
			
			int count = 0;
			while (count < numOfInputs) {
				try {
					input = br.readLine();
					StringTokenizer sTok = new StringTokenizer(input);
					X =  Integer.parseInt(sTok.nextToken());
					Y =  Integer.parseInt(sTok.nextToken());
					Z =  Integer.parseInt(sTok.nextToken());
					
					B = new int [X][Y][Z];
					
					int XY = X*Y;
					int x = 0,  y = 0;
				
					for (int i = 0; i < XY; i++) {
						input = br.readLine();
						sTok = new StringTokenizer(input);
						for (int z = 0; z < Z; z++) {
							B[x][y][z] = Integer.parseInt(sTok.nextToken());
						}
						y = (y + 1)%Y;
						if(y == 0) x++;
					}
					printA();
					count++;
				} catch (NumberFormatException nfe) {
					nfe.printStackTrace();
					continue;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}		

}
