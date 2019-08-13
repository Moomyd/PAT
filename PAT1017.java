import java.util.Scanner;
import java.math.BigInteger;
public class PAT1017 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();
        //BigInteger b = sc.nextBigInteger();
        //System.out.println(a.divide(b)+" "+a.mod(b));			//这样也能做出结果 但是会运行超时
        System.out.println(a.divide(BigInteger.valueOf(b))+" "+a.mod(BigInteger.valueOf(b)));
    }
}

