import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        int p4 = sc.nextInt();
        int weeks = 0;
        if (p1 >= 10) weeks++;
        if (p2 >= 10) weeks++;
        if (p3 >= 10) weeks++;
        if (p4 >= 10) weeks++;
        System.out.println(weeks);
    }
}
