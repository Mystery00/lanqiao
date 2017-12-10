/*
 * Created by Mystery0 on 17-12-10 下午8:09.
 * Copyright (c) 2017. All Rights reserved.
 *
 * Last modified 17-12-10 下午7:01
 */

package 第三周3_19.算法提高_数的划分;

import java.util.Scanner;

/**
 * 问题描述
 * 　　一个正整数可以划分为多个正整数的和，比如n=3时：
 * 　　3；1＋2；1＋1＋1；
 * 　　共有三种划分方法。
 * 　　给出一个正整数，问有多少种划分方法。
 * 输入格式
 * 　　一个正整数n
 * 输出格式
 * 　　一个正整数，表示划分方案数
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(split(number,number));
    }

    private static int split(int n, int m)//其中n为需要划分的整数，m为划分后的最大加数。
    {
        if (n < 1 || m < 1) return 0;
        if (n == 1 || m == 1) return 1;
        if (n < m) return split(n, n);
        if (n == m) return (split(n, m - 1) + 1);
        if (n > m) return (split(n, m - 1) + split((n - m), m));
        return 0;
    }
}
