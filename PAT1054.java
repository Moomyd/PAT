import java.util.Scanner;

/*
 * 思路：
 * 1.因为输入数字不一定是合法的  所以不能用nextDouble();
 * 2.所以这里采用字符串输入
 * 3.将字符串转变成double型数，如果无法转换(即非法数)则捕捉异常,输出相应语句
 * 4.如果该字符串能转变成double型数,则进一步判断是否为合法数(题目规定-1000<=x<=1000 ,并且最多精确到小数点后2位);
 * 5.这里介绍主要介绍两种判断是否最多是2位小数
 * 第一种：将数字转换成精确到2位小数，求与原来的作差的绝对值;如果是0则符合,否则多余2位(该方法不是很严谨)如果输入数据是1.000000则该数字也合法,显然是错误的,但是测试数据没有这类型数据
 * 第二种：将字符串长度-“.”的位置-1;即可算出小数点后有几位数字
 */

public class PAT1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();

        String[] number = s.split(" ");

        double sum = 0;
        double counts = 0;
        for (int i = 0; i < n; i++) {
            try {
                double x = Double.parseDouble(number[i]);

                int times = 0;

                if (number[i].contains(".")) {
                    times = number[i].length() - number[i].indexOf(".") - 1;
                }

                if (x >= -1000 && x <= 1000 && times <= 2 && times >= 0) {
                    sum += x;
                    counts++;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.printf("ERROR: %s is not a legal number\n", number[i]);
            }
        }
        if (counts == 0) {
            System.out.printf("The average of %.0f numbers is Undefined", counts);
        } else if (counts == 1) {
            System.out.printf("The average of %.0f number is %.2f\n", counts, sum / counts);
        } else {
            System.out.printf("The average of %.0f numbers is %.2f\n", counts, sum / counts);
        }

    }
}
