package 第一周12_11.算法训练5_1最小公倍数;

import java.util.Scanner;

public class Main
{
    /**
     * 问题描述
     * 　　	 * 编写一函数lcm，求两个正整数的最小公倍数。
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        System.out.println(lcm(a, b));
    }

    private static int lcm(int a, int b)
    {
        if (a % b == 0)
        {
            return a;
        } else if (b % a == 0)
        {
            return b;
        } else
        {
            int m = min(a, b);
            return a * b / m;
        }
    }

    private static int min(int a, int b)
    {
        if (a < b)
        {
            min(b, a);
        }
        while (b != 0)
        {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
