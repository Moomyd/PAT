import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PAT1090 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        Map<Integer, String> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            s=br.readLine().split(" ");
            int a=Integer.parseInt(s[0]);
            int b=Integer.parseInt(s[1]);
            String str;
            if(map.containsKey(a)&&map.containsKey(b)) {
                str=map.get(a);
                map.put(a, str+" "+s[1]);
                str=map.get(b);
                map.put(b, str+" "+s[0]);
            }else if(!map.containsKey(a)&&map.containsKey(b)){
                map.put(a, s[1]);
                str=map.get(b);
                map.put(b, str+" "+s[0]);
            }else if(map.containsKey(a)&&!map.containsKey(b)) {
                str=map.get(a);
                map.put(a, str+" "+s[1]);
                map.put(b, s[0]);
            }else if(!map.containsKey(a)&&!map.containsKey(b)){
                map.put(a, s[1]);
                map.put(b, s[0]);
            }
        }
        for (int i = 0; i < m; i++) {
            boolean b=false;
            s=br.readLine().split(" ");
            int a=Integer.parseInt(s[0]);
            jc:for (int j = 1; j <= a; j++) {
                if(map.containsKey(Integer.parseInt(s[j]))) {
                    String s1=map.get(Integer.parseInt(s[j]));
                    for (int j2 = j+1; j2 <= a; j2++) {
                        if(s1.contains(s[j2])) {
                            System.out.println("No");
                            b=true;
                            break jc;
                        }
                    }
                }else {
                    continue;
                }
            }
            if(!b) {
                System.out.println("Yes");
            }
        }
    }
}
