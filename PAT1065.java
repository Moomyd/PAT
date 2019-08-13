//后两个测试点超时，宝宝已经尽力try过了

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class PAT1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int couples[] = new int[100000];
        int appear[] = new int[100000];
        for(int i = 0; i < 100000; i++) {
            couples[i] = -1;
            appear[i] = -1;
        }

        for(int i = 0; i < N; i++) {
            String[] s = br.readLine().split(" ");
            int wife = Integer.parseInt(s[0]);
            int husband = Integer.parseInt(s[1]);
            couples[wife] = husband;
            couples[husband] = wife;
        }

        int M = Integer.parseInt(br.readLine());
        String[] guest = br.readLine().split(" ");
        int minus = 0;
        for(int i = 0; i < M; i++) {
            int g = Integer.parseInt(guest[i]);
            if(couples[g] != -1)
                appear[couples[g]] = 1;
            if(couples[g] != -1 && appear[couples[g]] == 1 && appear[g] == 1) {
                minus += 2;
            }
        }

        Arrays.sort(guest);

        boolean flag = false;

        System.out.println(guest.length - minus);
        for(int i = 0; i < guest.length;i++) {
            int g = Integer.parseInt(guest[i]);
            if(appear[g] != 1) {
                if(flag) {
                    System.out.print(" " + guest[i]);
                }else {
                    System.out.print(guest[i]);
                    flag = true;
                }
            }
        }
    }
}
