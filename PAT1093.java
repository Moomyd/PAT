//未AC 16分 两个超时
import java.util.Scanner;

public class PAT1093 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String one = in.nextLine();
        String two = in.nextLine();
        in.close();
        char[] num1 = one.toCharArray();
        char[] num2 = two.toCharArray();
        //添加操作多，故使用stringbuilder
        StringBuilder stringBuilder = new StringBuilder();
        //数组一
        for (int i = 0; i < num1.length; i++) {
            //当达到95，直接跳出；
            if(stringBuilder.length()==95)
                break;
            String str =""+num1[i];
            //判断是否存在当前元素，有则跳过，没有则添加
            if(stringBuilder.indexOf(str)!=-1)
                continue;
            else
                stringBuilder.append(num1[i]);
        }
        //数组二
        for (int i = 0; i < num2.length; i++) {
            //当达到95，直接跳出；
            if(stringBuilder.length()==95)
                break;
            String str =""+num2[i];
            if(stringBuilder.indexOf(str)!=-1)
                continue;
            else
                stringBuilder.append(num2[i]);
        }
        System.out.println(stringBuilder);
    }
}
