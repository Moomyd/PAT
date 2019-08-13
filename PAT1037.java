
/*
 * 思路：
 * 1.模拟减法法则对应位相减即可  不足则向上一位借1;
 * 2.对输出数据的处理用拆分字符串将数字保存到数组中;
 * 3.两数字相减之前要用大的数-小的数，因此在进行运算之前要判断哪个是大数;
 * 4.如果支付的钱数较少,则相减后输出的数字应该是负数;
 */

import java.util.Scanner;

public class PAT1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String[] number1 = s1.split("\\.");
        String[] number2 = s2.split("\\.");

        int a = 0;
        int b = 0;
        int c = 0;

        int number11 = Integer.parseInt(number1[0]);
        int number12 = Integer.parseInt(number1[1]);
        int number13 = Integer.parseInt(number1[2]);

        int number21 = Integer.parseInt(number2[0]);
        int number22 = Integer.parseInt(number2[1]);
        int number23 = Integer.parseInt(number2[2]);

        if (f(number1, number2)) {
            if (number23 >= number13) {
                c = number23 - number13;
            } else {
                c = number23 + 29 - number13;
                number22--;
            }
            if (number22 >= number12) {
                b = number22 - number12;
            } else {
                b = number22 + 17 - number12;
                number21--;
            }

            a = number21 - number11;

            System.out.printf("%d.%d.%d\n", a, b, c);
        } else {
            if (number13 >= number23) {
                c = number13 - number23;
            } else {
                c = number13 + 29 - number23;
                number12--;
            }
            if (number12 >= number22) {
                b = number12 - number22;
            } else {
                b = number12 + 17 - number22;

                number11--;
            }

            a = number11 - number21;

            System.out.printf("-%d.%d.%d\n", a, b, c);
        }

    }

    public static boolean f(String[] a1, String[] a2) {
        int x1 = Integer.parseInt(a1[0]);
        int x2 = Integer.parseInt(a1[1]);
        int x3 = Integer.parseInt(a1[2]);

        int y1 = Integer.parseInt(a2[0]);
        int y2 = Integer.parseInt(a2[1]);
        int y3 = Integer.parseInt(a2[2]);

        if (x1 > y1) {
            return false;
        } else if (x1 == y1) {
            if (x2 > y2) {
                return false;
            } else if (x2 == y2) {
                if (x3 > y3) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}

