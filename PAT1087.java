import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PAT1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int b=0,num=1;
        for (int i = 1; i <= n; i++) {
            int a=i/2+i/3+i/5;
            if(i==1) {
                b=a;
            }
            if(b!=a) {
                num++;
            }
            b=a;
        }
        System.out.println(num);
    }
}

