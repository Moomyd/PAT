import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N, max;
    static List<Integer>[] list;
    static int[] arr;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        int M = s.nextInt();
        list = new ArrayList[N];
        arr = new int[N];
        for(int i=0; i<list.length; i++)
            list[i] = new ArrayList<Integer>();
        for(int i=0; i<M; i++) {
            int k = s.nextInt() - 1;
            int n = s.nextInt();
            for(int j=0; j<n; j++)
                list[k].add(s.nextInt() - 1);
        }
        s.close();
        dfs(0, 0);

        for(int i=0; i<=max; i++) {
            if(i == 0) System.out.print(arr[i]);
            else System.out.print(" " + arr[i]);
        }
    }

    private static void dfs(int k, int depth) {
        if(list[k].size() == 0) {
            arr[depth] ++;
            if(depth > max)
                max = depth;
            return;
        }

        for(int i : list[k]) {
            dfs(i, depth + 1);
        }
    }

}
