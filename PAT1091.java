import java.util.Scanner;

public class PAT1091 {
    public static void main(String[] args) {
        int M;
        Scanner sc = new Scanner(System.in);
        M=sc.nextInt();
        if (M>=0&&M<=20) {
            int a[] = new int[M];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
            int temp[] = new int[M];
            String s1[] = new String[M];
            String s2[] = new String[M];
            for (int i = 0; i < M; i++) {
                boolean flag = true;
                for (int j = 1; j < 10; j++) {
                    temp[i]=j*a[i]*a[i];
                    s1[i] = String.valueOf(a[i]);
                    s2[i] = String.valueOf(temp[i]);
                    if (s2[i].substring(s2[i].length()-s1[i].length(),s2[i].length()).equals(s1[i])) {
                        System.out.println(j+" "+temp[i]);
                        flag= false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("No");
                }
            }
        }
    }
}
