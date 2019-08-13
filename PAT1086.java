import java.util.Scanner;

public class PAT1086 {
    public static void main(String args[]) {
        int a, b, c, d[] = new int[10];
        int i = 0, m = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a * b;
        if (c == 0)

            System.out.println("0");

        else {
            while (c != 0) {
                d[i++] = c % 10;
                c = c / 10;
            }
            for (int j = 0; j < i; j++) {
                m = m * 10 + d[j];
            }
            System.out.println(m + " ");
        }
    }
}
